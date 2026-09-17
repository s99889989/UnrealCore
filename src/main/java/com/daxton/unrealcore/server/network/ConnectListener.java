package com.daxton.unrealcore.server.network;
import com.daxton.unrealcore.server.application.method.SchedulerFunction;
import com.daxton.unrealcore.server.nms.PackUtil;
import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandlerContext;
import com.daxton.unrealcore.UnrealCore;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.nio.charset.StandardCharsets;

public class ConnectListener implements Listener {

    //當玩家登入
    @EventHandler(priority = EventPriority.LOWEST)
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        try {
            Channel channel = PackUtil.addCustomPayloadPacket(player);
            if(channel != null){

////                Integer protocolVersion = HandshakeInterceptor.getProtocolVersion(channel);
//                String randomKey = "ProtocolLib-" + ThreadLocalRandom.current().nextLong();
////                Integer protocolVersion = (Integer) channel.attr(AttributeKey.valueOf("protocol_version")).get();
//                Integer protocolVersion = (Integer)channel.attr(AttributeKey.valueOf(randomKey)).get();
//                UnrealCore.sendLogger("ProtocolLib版本-"+protocolVersion);

                //Add listener
                ChannelDuplexHandler duplexHandler = new ChannelDuplexHandler(){
                    @Override
                    public void channelRead(ChannelHandlerContext context, Object object)throws Exception {
//                        UnrealCore.sendLogger("Object: "+object.getClass().getSimpleName());
                        ByteBuf byteBuf = PackUtil.handleDiscardedPayload(object);

                        if(byteBuf != null){
                            String receivedString = byteBuf.toString(StandardCharsets.UTF_8);
                            if (receivedString.startsWith("{")) {
                                receivedString = receivedString.substring(1);
                            }

                            UnrealCore.sendLogger(receivedString);
                            String finalReceivedString = receivedString;
                            SchedulerFunction.run(UnrealCore.getInstance(), () -> ConnectController.onReceiveClientPack(player, finalReceivedString));
                        }
                        super.channelRead(context, object);
                    }
                };

                channel.pipeline().addBefore("packet_handler", player.getName(), duplexHandler);

            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
            UnrealCore.sendErrorLogger(e.getMessage());
        }

    }

    //玩家登出
    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event){

        Player player = event.getPlayer();

        try {
            PackUtil.removeCustomPayloadPacket(player);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            UnrealCore.sendErrorLogger(e.getMessage());
        }

    }

}

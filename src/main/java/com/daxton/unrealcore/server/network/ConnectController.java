package com.daxton.unrealcore.server.network;

import com.daxton.unrealcore.UnrealCore;
import com.daxton.unrealcore.server.application.method.SchedulerFunction;
import com.daxton.unrealcore.server.event.network.PlayerConnectionSuccessfulEvent;
import com.daxton.unrealcore.server.nms.PackUtil;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

//連線功能
public class ConnectController {

    public static final int IDX = 123;
    //"unrealcore:communication";
    //"minecraft:brand"
    public static final String CHANNEL = "minecraft:brand";


    //啟用
    public static void onEnable(){

    }

    //停用
    public static void onDisable() {


    }

    //----------------------------------------------------------------------------------------------------//

    //接收客戶端訊息
    public static void onReceiveClientPack(Player player, String receivedString){
        receivedString = receivedString.trim();

        String[] strings = receivedString.split(" : ");
        if(strings.length == 2){

            String type = strings[0];
            String message = strings[1];

        }
    }


    public static void onReceiveClientPack(Player player, String type, String message){
        //連線成功
        if(type.equals("Communication:ConnectionSuccessful")){
            SchedulerFunction.runLater(UnrealCore.getInstance(), ()->{
                PlayerConnectionSuccessfulEvent playerConnectionSuccessfulEvent = new PlayerConnectionSuccessfulEvent(player, message);
                Bukkit.getPluginManager().callEvent(playerConnectionSuccessfulEvent);
            }, 20);
        }

    }

    //----------------------------------------------------------------------------------------------------//

    //發給指定玩家
    public static void sendPack(Player player, String type, String message) {
        String sendMessage = type + " : " + message;
        sendPacketByteBuf(player, sendMessage);


    }

    //發給全部玩家
    public static void sendPack(String type, String message) {
        String sendMessage = type + " : " + message;
        for (Player player : Bukkit.getOnlinePlayers()) {
            sendPacketByteBuf(player, sendMessage);
        }
    }


    // 處理資料包（分割大資料包, 加密）
    private static void sendPacketByteBuf(Player player, String message) {

        byte[] bytes = message.getBytes(StandardCharsets.UTF_8);

        int chunkSize = 16384;  //1024000  32700 21800 16384
        int numChunks = (int) Math.ceil((double) bytes.length / chunkSize);
        byte[][] chunks = new byte[numChunks][];
        for (int i = 0; i < numChunks; i++) {
            int start = i * chunkSize;
            int end = Math.min(start + chunkSize, bytes.length);

            chunks[i] = Arrays.copyOfRange(bytes, start, end);
        }

        for (int i = 0; i < numChunks; i++) {

            String end = "f";
            if(i == numChunks - 1){
                end = "t";
            }
            byte[] end_bytes = end.getBytes(StandardCharsets.UTF_8);
            PacketByteBuf buf = new PacketByteBuf();

            buf.writeByteArray(end_bytes, chunks[i]);

            PackUtil.sendPluginMessage(player, CHANNEL, buf.getBuffer());

        }
    }

}

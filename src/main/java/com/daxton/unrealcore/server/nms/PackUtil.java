package com.daxton.unrealcore.server.nms;

import com.daxton.unrealcore.UnrealCore;
import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import org.bukkit.entity.Player;


public class PackUtil {



    public static Channel addCustomPayloadPacket(Player player) throws NoSuchFieldException, IllegalAccessException {
        String nmsVersion = NMSVersion.getNMSVersion();

        switch (nmsVersion) {
            case "v1_12_R1":
                return com.daxton.unrealcore.nms.v1_12_R1.PacketUtil.addCustomPayloadPacket(player);
            case "v1_13_R1":
                return com.daxton.unrealcore.nms.v1_13_R1.PacketUtil.addCustomPayloadPacket(player);
            case "v1_13_R2":
                return com.daxton.unrealcore.nms.v1_13_R2.PacketUtil.addCustomPayloadPacket(player);
            case "v1_14_R1":
                return com.daxton.unrealcore.nms.v1_14_R1.PacketUtil.addCustomPayloadPacket(player);
            case "v1_15_R1":
                return com.daxton.unrealcore.nms.v1_15_R1.PacketUtil.addCustomPayloadPacket(player);
            case "v1_16_R1":
                return com.daxton.unrealcore.nms.v1_16_R1.PacketUtil.addCustomPayloadPacket(player);
            case "v1_16_R2":
                return com.daxton.unrealcore.nms.v1_16_R2.PacketUtil.addCustomPayloadPacket(player);
            case "v1_16_R3":
                return com.daxton.unrealcore.nms.v1_16_R3.PacketUtil.addCustomPayloadPacket(player);
            case "v1_17_R1":
                return com.daxton.unrealcore.nms.v1_17_R1.PacketUtil.addCustomPayloadPacket(player);
            case "v1_18_R1":
                return com.daxton.unrealcore.nms.v1_18_R1.PacketUtil.addCustomPayloadPacket(player);
            case "v1_18_R2":
                return com.daxton.unrealcore.nms.v1_18_R2.PacketUtil.addCustomPayloadPacket(player);
            case "v1_19_R1":
                return com.daxton.unrealcore.nms.v1_19_R1.PacketUtil.addCustomPayloadPacket(player);
            case "v1_19_R2":
                return com.daxton.unrealcore.nms.v1_19_R2.PacketUtil.addCustomPayloadPacket(player);
            case "v1_19_R3":
                return com.daxton.unrealcore.nms.v1_19_R3.PacketUtil.addCustomPayloadPacket(player);
            case "v1_20_R1":
                return com.daxton.unrealcore.nms.v1_20_R1.PacketUtil.addCustomPayloadPacket(player);
            case "v1_20_R2":
                return com.daxton.unrealcore.nms.v1_20_R2.PacketUtil.addCustomPayloadPacket(player);
            case "v1_20_R3":
                return com.daxton.unrealcore.nms.v1_20_R3.PacketUtil.addCustomPayloadPacket(player);
            case "v1_20_R4":
                return com.daxton.unrealcore.nms.v1_20_R4.PacketUtil.addCustomPayloadPacket(player);
            case "v1_21_R1":
                return com.daxton.unrealcore.nms.v1_21_R1.PacketUtil.addCustomPayloadPacket(player);
            case "v1_21_R2":
                return com.daxton.unrealcore.nms.v1_21_R2.PacketUtil.addCustomPayloadPacket(player);
            case "v1_21_R3":
                return com.daxton.unrealcore.nms.v1_21_R3.PacketUtil.addCustomPayloadPacket(player);
            case "v1_21_R4":
                return com.daxton.unrealcore.nms.v1_21_R4.PacketUtil.addCustomPayloadPacket(player);
            case "v1_21_R5":
                return com.daxton.unrealcore.nms.v1_21_R5.PacketUtil.addCustomPayloadPacket(player);
        }
        return null;
    }

    public static ByteBuf handleDiscardedPayload(Object object){
        String nmsVersion = NMSVersion.getNMSVersion();
        switch (nmsVersion) {
            case "v1_12_R1":
                return com.daxton.unrealcore.nms.v1_12_R1.PacketUtil.handleDiscardedPayload(object);
            case "v1_13_R1":
                return com.daxton.unrealcore.nms.v1_13_R1.PacketUtil.handleDiscardedPayload(object);
            case "v1_13_R2":
                return com.daxton.unrealcore.nms.v1_13_R2.PacketUtil.handleDiscardedPayload(object);
            case "v1_14_R1":
                return com.daxton.unrealcore.nms.v1_14_R1.PacketUtil.handleDiscardedPayload(object);
            case "v1_15_R1":
                return com.daxton.unrealcore.nms.v1_15_R1.PacketUtil.handleDiscardedPayload(object);
            case "v1_16_R1":
                return com.daxton.unrealcore.nms.v1_16_R1.PacketUtil.handleDiscardedPayload(object);
            case "v1_16_R2":
                return com.daxton.unrealcore.nms.v1_16_R2.PacketUtil.handleDiscardedPayload(object);
            case "v1_16_R3":
                return com.daxton.unrealcore.nms.v1_16_R3.PacketUtil.handleDiscardedPayload(object);
            case "v1_17_R1":
                return com.daxton.unrealcore.nms.v1_17_R1.PacketUtil.handleDiscardedPayload(object);
            case "v1_18_R1":
                return com.daxton.unrealcore.nms.v1_18_R1.PacketUtil.handleDiscardedPayload(object);
            case "v1_18_R2":
                return com.daxton.unrealcore.nms.v1_18_R2.PacketUtil.handleDiscardedPayload(object);
            case "v1_19_R1":
                return com.daxton.unrealcore.nms.v1_19_R1.PacketUtil.handleDiscardedPayload(object);
            case "v1_19_R2":
                return com.daxton.unrealcore.nms.v1_19_R2.PacketUtil.handleDiscardedPayload(object);
            case "v1_19_R3":
                return com.daxton.unrealcore.nms.v1_19_R3.PacketUtil.handleDiscardedPayload(object);
            case "v1_20_R1":
                return com.daxton.unrealcore.nms.v1_20_R1.PacketUtil.handleDiscardedPayload(object);
            case "v1_20_R2":
                return com.daxton.unrealcore.nms.v1_20_R2.PacketUtil.handleDiscardedPayload(object);
            case "v1_20_R3":
                return com.daxton.unrealcore.nms.v1_20_R3.PacketUtil.handleDiscardedPayload(object);
            case "v1_20_R4":
                return com.daxton.unrealcore.nms.v1_20_R4.PacketUtil.handleDiscardedPayload(object);
            case "v1_21_R1":
                return com.daxton.unrealcore.nms.v1_21_R1.PacketUtil.handleDiscardedPayload(object);
            case "v1_21_R2":
                return com.daxton.unrealcore.nms.v1_21_R2.PacketUtil.handleDiscardedPayload(object);
            case "v1_21_R3":
                return com.daxton.unrealcore.nms.v1_21_R3.PacketUtil.handleDiscardedPayload(object);
            case "v1_21_R4":
                return com.daxton.unrealcore.nms.v1_21_R4.PacketUtil.handleDiscardedPayload(object);
            case "v1_21_R5":
                return com.daxton.unrealcore.nms.v1_21_R5.PacketUtil.handleDiscardedPayload(object);
        }
        return null;
    }

    public static void removeCustomPayloadPacket(Player player) throws NoSuchFieldException, IllegalAccessException {
        String nmsVersion = NMSVersion.getNMSVersion();

        switch (nmsVersion) {
            case "v1_12_R1":
                com.daxton.unrealcore.nms.v1_12_R1.PacketUtil.removeCustomPayloadPacket(player);
                break;
            case "v1_13_R1":
                com.daxton.unrealcore.nms.v1_13_R1.PacketUtil.removeCustomPayloadPacket(player);
                break;
            case "v1_13_R2":
                com.daxton.unrealcore.nms.v1_13_R2.PacketUtil.removeCustomPayloadPacket(player);
                break;
            case "v1_14_R1":
                com.daxton.unrealcore.nms.v1_14_R1.PacketUtil.removeCustomPayloadPacket(player);
                break;
            case "v1_15_R1":
                com.daxton.unrealcore.nms.v1_15_R1.PacketUtil.removeCustomPayloadPacket(player);
                break;
            case "v1_16_R1":
                com.daxton.unrealcore.nms.v1_16_R1.PacketUtil.removeCustomPayloadPacket(player);
                break;
            case "v1_16_R2":
                com.daxton.unrealcore.nms.v1_16_R2.PacketUtil.removeCustomPayloadPacket(player);
                break;
            case "v1_16_R3":
                com.daxton.unrealcore.nms.v1_16_R3.PacketUtil.removeCustomPayloadPacket(player);
                break;
            case "v1_17_R1":
                com.daxton.unrealcore.nms.v1_17_R1.PacketUtil.removeCustomPayloadPacket(player);
                break;
            case "v1_18_R1":
                com.daxton.unrealcore.nms.v1_18_R1.PacketUtil.removeCustomPayloadPacket(player);
                break;
            case "v1_18_R2":
                com.daxton.unrealcore.nms.v1_18_R2.PacketUtil.removeCustomPayloadPacket(player);
                break;
            case "v1_19_R1":
                com.daxton.unrealcore.nms.v1_19_R1.PacketUtil.removeCustomPayloadPacket(player);
                break;
            case "v1_19_R2":
                com.daxton.unrealcore.nms.v1_19_R2.PacketUtil.removeCustomPayloadPacket(player);
                break;
            case "v1_19_R3":
                com.daxton.unrealcore.nms.v1_19_R3.PacketUtil.removeCustomPayloadPacket(player);
                break;
            case "v1_20_R1":
                com.daxton.unrealcore.nms.v1_20_R1.PacketUtil.removeCustomPayloadPacket(player);
                break;
            case "v1_20_R2":
                com.daxton.unrealcore.nms.v1_20_R2.PacketUtil.removeCustomPayloadPacket(player);
                break;
            case "v1_20_R3":
                com.daxton.unrealcore.nms.v1_20_R3.PacketUtil.removeCustomPayloadPacket(player);
                break;
            case "v1_20_R4":
                com.daxton.unrealcore.nms.v1_20_R4.PacketUtil.removeCustomPayloadPacket(player);
                break;
            case "v1_21_R1":
                com.daxton.unrealcore.nms.v1_21_R1.PacketUtil.removeCustomPayloadPacket(player);
                break;
            case "v1_21_R2":
                com.daxton.unrealcore.nms.v1_21_R2.PacketUtil.removeCustomPayloadPacket(player);
                break;
            case "v1_21_R3":
                com.daxton.unrealcore.nms.v1_21_R3.PacketUtil.removeCustomPayloadPacket(player);
                break;
            case "v1_21_R4":
                com.daxton.unrealcore.nms.v1_21_R4.PacketUtil.removeCustomPayloadPacket(player);
                break;
            case "v1_21_R5":
                com.daxton.unrealcore.nms.v1_21_R5.PacketUtil.removeCustomPayloadPacket(player);
                break;
        }
    }


    public static void sendPluginMessage(Player player, String channel, ByteBuf byteBuf) {
        String nmsVersion = NMSVersion.getNMSVersion();

        switch (nmsVersion) {
            case "v1_12_R1":
                com.daxton.unrealcore.nms.v1_12_R1.PacketUtil.sendPluginMessage(player, channel, byteBuf);
                break;
            case "v1_13_R1":
                com.daxton.unrealcore.nms.v1_13_R1.PacketUtil.sendPluginMessage(player, channel, byteBuf);
                break;
            case "v1_13_R2":
                com.daxton.unrealcore.nms.v1_13_R2.PacketUtil.sendPluginMessage(player, channel, byteBuf);
                break;
            case "v1_14_R1":
                com.daxton.unrealcore.nms.v1_14_R1.PacketUtil.sendPluginMessage(player, channel, byteBuf);
                break;
            case "v1_15_R1":
                com.daxton.unrealcore.nms.v1_15_R1.PacketUtil.sendPluginMessage(player, channel, byteBuf);
                break;
            case "v1_16_R1":
                com.daxton.unrealcore.nms.v1_16_R1.PacketUtil.sendPluginMessage(player, channel, byteBuf);
                break;
            case "v1_16_R2":
                com.daxton.unrealcore.nms.v1_16_R2.PacketUtil.sendPluginMessage(player, channel, byteBuf);
                break;
            case "v1_16_R3":
                com.daxton.unrealcore.nms.v1_16_R3.PacketUtil.sendPluginMessage(player, channel, byteBuf);
                break;
            case "v1_17_R1":
                com.daxton.unrealcore.nms.v1_17_R1.PacketUtil.sendPluginMessage(player, channel, byteBuf);
                break;
            case "v1_18_R1":
                com.daxton.unrealcore.nms.v1_18_R1.PacketUtil.sendPluginMessage(player, channel, byteBuf);
                break;
            case "v1_18_R2":
                com.daxton.unrealcore.nms.v1_18_R2.PacketUtil.sendPluginMessage(player, channel, byteBuf);
                break;
            case "v1_19_R1":
                com.daxton.unrealcore.nms.v1_19_R1.PacketUtil.sendPluginMessage(player, channel, byteBuf);
                break;
            case "v1_19_R2":
                com.daxton.unrealcore.nms.v1_19_R2.PacketUtil.sendPluginMessage(player, channel, byteBuf);
                break;
            case "v1_19_R3":
                com.daxton.unrealcore.nms.v1_19_R3.PacketUtil.sendPluginMessage(player, channel, byteBuf);
                break;
            case "v1_20_R1":
                com.daxton.unrealcore.nms.v1_20_R1.PacketUtil.sendPluginMessage(player, channel, byteBuf);
                break;
            case "v1_20_R2":
                com.daxton.unrealcore.nms.v1_20_R2.PacketUtil.sendPluginMessage(player, channel, byteBuf);
                break;
            case "v1_20_R3":
                com.daxton.unrealcore.nms.v1_20_R3.PacketUtil.sendPluginMessage(player, channel, byteBuf);
                break;
            case "v1_20_R4":
                com.daxton.unrealcore.nms.v1_20_R4.PacketUtil.sendPluginMessage(player, byteBuf);
                break;
            case "v1_21_R1":
                com.daxton.unrealcore.nms.v1_21_R1.PacketUtil.sendPluginMessage(player, byteBuf);
                break;
            case "v1_21_R2":
                com.daxton.unrealcore.nms.v1_21_R2.PacketUtil.sendPluginMessage(player, byteBuf);
                break;
            case "v1_21_R3":
                com.daxton.unrealcore.nms.v1_21_R3.PacketUtil.sendPluginMessage(player, byteBuf);
                break;
            case "v1_21_R4":
                com.daxton.unrealcore.nms.v1_21_R4.PacketUtil.sendPluginMessage(player, byteBuf);
                break;
            case "v1_21_R5":
                com.daxton.unrealcore.nms.v1_21_R5.PacketUtil.sendPluginMessage(player, byteBuf);
                break;
            default:
                player.sendPluginMessage(UnrealCore.getInstance(), channel, byteBuf.array());
        }

    }



//    public static void sendPluginMessage(Player player, String channel, PacketByteBuf byteBuf) {
//        String nmsVersion = NMSVersion.getNMSVersion();
////        String ss = byteBuf.getBuffer().toString(StandardCharsets.UTF_8);
////
////        UnrealCore.sendLogger(ss);
//        switch (nmsVersion) {
//            case "v1_12_R1":
//                com.daxton.unrealcore.nms.v1_12_R1.PacketUtil.sendPluginMessage(player, channel, byteBuf.getBuffer());
//                break;
//            case "v1_13_R1":
//                com.daxton.unrealcore.nms.v1_13_R1.PacketUtil.sendPluginMessage(player, channel, byteBuf.getBuffer());
//                break;
//            case "v1_13_R2":
//                com.daxton.unrealcore.nms.v1_13_R2.PacketUtil.sendPluginMessage(player, channel, byteBuf.getBuffer());
//                break;
//            case "v1_14_R1":
//                com.daxton.unrealcore.nms.v1_14_R1.PacketUtil.sendPluginMessage(player, channel, byteBuf.getBuffer());
//                break;
//            case "v1_15_R1":
//                com.daxton.unrealcore.nms.v1_15_R1.PacketUtil.sendPluginMessage(player, channel, byteBuf.getBuffer());
//                break;
//            case "v1_16_R1":
//                com.daxton.unrealcore.nms.v1_16_R1.PacketUtil.sendPluginMessage(player, channel, byteBuf.getBuffer());
//                break;
//            case "v1_16_R2":
//                com.daxton.unrealcore.nms.v1_16_R2.PacketUtil.sendPluginMessage(player, channel, byteBuf.getBuffer());
//                break;
//            case "v1_16_R3":
//                com.daxton.unrealcore.nms.v1_16_R3.PacketUtil.sendPluginMessage(player, channel, byteBuf.getBuffer());
//                break;
//            case "v1_17_R1":
//                com.daxton.unrealcore.nms.v1_17_R1.PacketUtil.sendPluginMessage(player, channel, byteBuf.getBuffer());
//                break;
//            case "v1_18_R1":
//                com.daxton.unrealcore.nms.v1_18_R1.PacketUtil.sendPluginMessage(player, channel, byteBuf.getBuffer());
//                break;
//            case "v1_18_R2":
//                com.daxton.unrealcore.nms.v1_18_R2.PacketUtil.sendPluginMessage(player, channel, byteBuf.getBuffer());
//                break;
//            case "v1_19_R1":
//                com.daxton.unrealcore.nms.v1_19_R1.PacketUtil.sendPluginMessage(player, channel, byteBuf.getBuffer());
//                break;
//            case "v1_19_R2":
//                com.daxton.unrealcore.nms.v1_19_R2.PacketUtil.sendPluginMessage(player, channel, byteBuf.getBuffer());
//                break;
//            case "v1_19_R3":
//                com.daxton.unrealcore.nms.v1_19_R3.PacketUtil.sendPluginMessage(player, channel, byteBuf.getBuffer());
//            case "v1_20_R1":
//                com.daxton.unrealcore.nms.v1_20_R1.PacketUtil.sendPluginMessage(player, channel, byteBuf.getBuffer());
//                break;
//            case "v1_20_R2":
//                com.daxton.unrealcore.nms.v1_20_R2.PacketUtil.sendPluginMessage(player, byteBuf.getBuffer());
//                break;
//            case "v1_20_R3":
//                com.daxton.unrealcore.nms.v1_20_R3.PacketUtil.sendPluginMessage(player, byteBuf.getBuffer());
//                break;
//            case "v1_20_R4":
//                com.daxton.unrealcore.nms.v1_20_R4.PacketUtil.sendPluginMessage(player, byteBuf.getBuffer());
//                break;
//            case "v1_21_R1":
//                com.daxton.unrealcore.nms.v1_21_R1.PacketUtil.sendPluginMessage(player, byteBuf.getBuffer());
//                break;
//            case "v1_21_R2":
//                com.daxton.unrealcore.nms.v1_21_R2.PacketUtil.sendPluginMessage(player, byteBuf.getBuffer());
//                break;
//            case "v1_21_R3":
//                com.daxton.unrealcore.nms.v1_21_R3.PacketUtil.sendPluginMessage(player, byteBuf.getBuffer());
//                break;
//            case "v1_21_R4":
//                com.daxton.unrealcore.nms.v1_21_R4.PacketUtil.sendPluginMessage(player, byteBuf.getBuffer());
//                break;
//            default:
//                player.sendPluginMessage(UnrealCore.getInstance(), channel, byteBuf.array());
//        }
//
//    }

//    public static void sendServerVersion(Player player) {
//
//        //版本低於1.20.2
//        if(!NMSVersion.isMinecraftVersionHigher("1.20.2")){
//            String message = "base64=false";
////            message = "Entity:EntityDisplaySet : {\"uuidString\":\"380df991-f603-344c-a090-369bad2a924a\",\"display\":true}";
//            PacketByteBuf byteBuf = new PacketByteBuf();
//            byteBuf.writeByteArray(message.getBytes(StandardCharsets.UTF_8));
//            sendPluginMessage(player, "minecraft:brand", byteBuf.getBuffer());
//        }
//
//    }

}

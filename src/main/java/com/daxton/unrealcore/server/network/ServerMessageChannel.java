package com.daxton.unrealcore.server.network;



import com.daxton.unrealcore.server.nms.PackUtil;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;


public class ServerMessageChannel {

    public static final int IDX = 123;
    //"unrealcore:communication";
    //"minecraft:brand"
    public static final String CHANNEL = "minecraft:brand";

    //發給指定玩家
    public static void sendTo(Player player, String message) {

        sendPacketByteBuf(player, message);


    }

    //發給全部玩家
    public static void sendToAll(String message) {
        for (Player player : Bukkit.getOnlinePlayers()) {
            sendPacketByteBuf(player, message);
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

//    // 處理資料包（分割大資料包, 加密）
//    private static void sendPacketByteBuf3(Player player, String message) {
//        PacketByteBuf msg = new PacketByteBuf();
//        byte[] bytes = message.getBytes(StandardCharsets.UTF_8);
//        msg.writeByteArray(bytes);
//        try {
//            byte[] send = msg.array();
//            ByteBuf byteBuf = Unpooled.wrappedBuffer(send);
//
//            if (bytes.length > 15360) {
//                byte[] cache = new byte[1024];
//
//                while (byteBuf.isReadable()) {
//
//                    PacketByteBuf buf = new PacketByteBuf();
//
//
//                    // 動態調整緩衝區大小
//                    if (byteBuf.readableBytes() < cache.length) {
//                        cache = new byte[byteBuf.readableBytes()];
//                    }
//
//                    byteBuf.readBytes(cache);
//                    String tt = "f";
//                    if(byteBuf.isReadable()){
//                        tt= "t";
//                    }
//                    String c = Arrays.toString(cache);
//                    String mes = Base64Util.encode(tt+c);
////                    buf.writeBoolean(!byteBuf.isReadable()); // 是否為最後一個分塊
//
//                    buf.writeString(mes);        // 寫入分塊數據
//                    PackUtil.sendPluginMessage(player, CHANNEL, buf);
//                }
//            } else {
//                // 单个数据包处理
//                PacketByteBuf buf = new PacketByteBuf();
//                String mes = Base64Util.encode("t"+message);
//                buf.writeString(mes);
//                PackUtil.sendPluginMessage(player, CHANNEL, buf);
//            }
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        } finally {
//            msg.release();
//        }
//    }

//    // 處理資料包（分割大資料包, 加密）
//    private static void sendPacketByteBuf(Player player, PacketByteBuf msg) {
//        UUID uuid = UUID.randomUUID();
//        try {
//            byte[] send = msg.array();
//            ByteBuf byteBuf = Unpooled.wrappedBuffer(send);
//
//            if (send.length > 15360) {
////                byte[] cache = new byte[1024];
////
////                while (byteBuf.isReadable()) {
////
////                    PacketByteBuf buf = new PacketByteBuf();
//////                    buf.writeByte(IDX);
////
////                    // 動態調整緩衝區大小
////                    if (byteBuf.readableBytes() < cache.length) {
////                        cache = new byte[byteBuf.readableBytes()];
////                    }
////
////                    byteBuf.readBytes(cache);
////                    buf.writeBoolean(!byteBuf.isReadable()); // 是否為最後一個分塊
//////                    buf.writeUuid(uuid);                     // 資料包組的 UUID
////                    buf.writeByteArray(cache);               // 寫入分塊數據
////                    PackUtil.sendPluginMessage(player, CHANNEL, buf);
////                }
//            } else {
//                // 单个数据包处理
//                PacketByteBuf buf = new PacketByteBuf();
//                buf.writeByte(IDX);
////                buf.writeBoolean(true);  // 單包標記為最後一個
////                buf.writeUuid(uuid);
//                buf.writeByteArray(send);
//                PackUtil.sendPluginMessage(player, CHANNEL, buf);
//            }
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        } finally {
//            msg.release();
//        }
//    }

//    // 處理資料包（分割大資料包, 加密）
//    private static void sendPacketByteBuf2(Player player, PacketByteBuf msg) {
//        UUID uuid = UUID.randomUUID();
//        try {
//            byte[] send = msg.array();
//            ByteBuf byteBuf = Unpooled.wrappedBuffer(send);
//
//            if (send.length > 15360) {
//                byte[] cache = new byte[1024];
//
//                while (byteBuf.isReadable()) {
//
//                    PacketByteBuf buf = new PacketByteBuf();
//                    buf.writeByte(IDX);
//
//                    // 動態調整緩衝區大小
//                    if (byteBuf.readableBytes() < cache.length) {
//                        cache = new byte[byteBuf.readableBytes()];
//                    }
//
//                    byteBuf.readBytes(cache);
//                    buf.writeBoolean(!byteBuf.isReadable()); // 是否為最後一個分塊
//                    buf.writeUuid(uuid);                     // 資料包組的 UUID
//                    buf.writeByteArray(cache);               // 寫入分塊數據
//                    PackUtil.sendPluginMessage(player, CHANNEL, buf);
//                }
//            } else {
//                // 单个数据包处理
//                PacketByteBuf buf = new PacketByteBuf();
//                buf.writeByte(IDX);
//                buf.writeBoolean(true);  // 單包標記為最後一個
//                buf.writeUuid(uuid);
//                buf.writeByteArray(send);
//                PackUtil.sendPluginMessage(player, CHANNEL, buf);
//            }
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        } finally {
//            msg.release();
//        }
//    }
//
//    // 處理資料包（分割大資料包, 加密）
//    private static void handleByteBuf(PacketByteBuf msg, Consumer<List<PacketByteBuf>> handle) {
//        CompletableFuture.supplyAsync(() -> {
//            List<PacketByteBuf> result = Lists.newArrayList();
//            UUID uuid = UUID.randomUUID();
//            try {
//                byte[] send = msg.array();
//                ByteBuf byteBuf = Unpooled.wrappedBuffer(send);
//
//                if (send.length > 15360) {
//                    byte[] cache = new byte[1024];
//
//                    while (byteBuf.isReadable()) {
//
//                        PacketByteBuf buf = new PacketByteBuf();
//                        buf.writeByte(IDX);
//
//                        // 動態調整緩衝區大小
//                        if (byteBuf.readableBytes() < cache.length) {
//                            cache = new byte[byteBuf.readableBytes()];
//                        }
//
//                        byteBuf.readBytes(cache);
//                        buf.writeBoolean(!byteBuf.isReadable()); // 是否為最後一個分塊
//                        buf.writeUuid(uuid);                     // 資料包組的 UUID
//                        buf.writeByteArray(cache);               // 寫入分塊數據
//                        result.add(buf);
//                    }
//                } else {
//                    // 单个数据包处理
//                    PacketByteBuf buf = new PacketByteBuf();
//                    buf.writeByte(IDX);
//                    buf.writeBoolean(true);  // 單包標記為最後一個
//                    buf.writeUuid(uuid);
//                    buf.writeByteArray(send);
//                    result.add(buf);
//                }
//                return result;
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//            } finally {
//                msg.release();
//            }
//        },NETWORK_EXECUTOR).thenAcceptAsync(handle);
//    }

}

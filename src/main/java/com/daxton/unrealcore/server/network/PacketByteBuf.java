package com.daxton.unrealcore.server.network;

import com.daxton.unrealcore.UnrealCore;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.entity.Player;


import java.nio.charset.StandardCharsets;
import java.util.UUID;

@Getter
@Setter
public class PacketByteBuf {

    private final ByteBuf buffer;

    public PacketByteBuf() {
        this.buffer = Unpooled.buffer();

    }

    public PacketByteBuf(ByteBuf buffer) {
        this.buffer = buffer;
    }

    public void writeByte(int value) {
        this.buffer.writeByte(value);
    }

    public void writeVarInt(int value) {
        while ((value & -128) != 0) {
            this.buffer.writeByte(value & 127 | 128);
            value >>>= 7;
        }
        this.buffer.writeByte(value);
    }

    public int readVarInt() {
        int i = 0;
        int j = 0;
        byte b;
        do {
            b = this.buffer.readByte();
            i |= (b & 127) << j++ * 7;
            if (j > 5) {
                throw new RuntimeException("VarInt too big");
            }
        } while ((b & 128) == 128);
        return i;
    }

    public void writeUuid(UUID uuid) {
        this.buffer.writeLong(uuid.getMostSignificantBits());
        this.buffer.writeLong(uuid.getLeastSignificantBits());
    }

    public UUID readUuid() {
        long mostSigBits = this.buffer.readLong();
        long leastSigBits = this.buffer.readLong();
        return new UUID(mostSigBits, leastSigBits);
    }

    public void writeBoolean(boolean value) {
        this.buffer.writeBoolean(value);
    }

    public boolean readBoolean() {
        return this.buffer.readBoolean();
    }



    public void writeString(String value) {
        byte[] bytes = value.getBytes(StandardCharsets.UTF_8);
        this.writeVarInt(bytes.length);
        this.buffer.writeBytes(bytes);
    }

    public void writeByteArray(byte[] array, String value) {
        byte[] bytes = value.getBytes(StandardCharsets.UTF_8);
        this.writeVarInt(array.length+bytes.length);
        this.buffer.writeBytes(bytes);
        this.buffer.writeBytes(array);
    }

    public void writeByteArray(byte[] array, byte[] array2, Player player) {
        //版本 包含 和 低於1.20.1
//        if(!NMSVersion.isMinecraftVersionHigher("1.20.1")){
//            UnrealCore.sendLogger("加上!");
//            this.writeVarInt(array.length+array2.length);
//        }
        this.writeVarInt(array.length+array2.length);
        this.buffer.writeBytes(array);
        this.buffer.writeBytes(array2);
    }

    public void writeByteArray(byte[] array, byte[] array2) {
        //版本 包含 和 低於1.20.1
//        if(!NMSVersion.isMinecraftVersionHigher("1.20.1")){
//            UnrealCore.sendLogger("加上!");
//            this.writeVarInt(array.length+array2.length);
//        }
        this.writeVarInt(array.length+array2.length);
        this.buffer.writeBytes(array);
        this.buffer.writeBytes(array2);
    }

    public void writeByteArray(byte[] array) {
        this.writeVarInt(array.length);
        this.buffer.writeBytes(array);
    }

    public void writeByteArray2(byte[] array) {
        this.buffer.writeBytes(array);
    }

    public byte[] readByteArray() {
        int length = this.readVarInt();
        byte[] array = new byte[length];
        this.buffer.readBytes(array);
        return array;
    }

    public byte[] array() {
        byte[] data = new byte[this.buffer.readableBytes()];
        this.buffer.getBytes(this.buffer.readerIndex(), data);
        return data;
    }

    public void release() {
        this.buffer.release();
    }

}
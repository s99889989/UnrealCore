package com.daxton.unrealcore.server.event.network;

import lombok.*;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

@Getter
@Setter
@ToString
@NoArgsConstructor
@NonNull
public class PlayerConnectionSuccessfulEvent extends Event {

    private static final HandlerList handlers = new HandlerList();


    private Player player;  //玩家
    private String modLoaders = "Forge";  //模組加載器類別(Forge, Fabric)
    private String minecraftVersion = "1.20.2";  //Minecraft版本
    private String modVersion = "2.0";  //模組版本
    private String language = "en_us";  //玩家在客戶端設置使用的語言
    //玩家連線成功事件
    public PlayerConnectionSuccessfulEvent(Player player, String received){
        this.player = player;
        CorePlayerBeen corePlayerBeen = JsonUtil.toObject(received, CorePlayerBeen.class);
        this.modLoaders = corePlayerBeen.getModLoaders();
        this.minecraftVersion = corePlayerBeen.getMinecraftVersion();
        this.modVersion = corePlayerBeen.getModVersion();
        this.language = corePlayerBeen.getLanguage();
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public @org.jetbrains.annotations.NotNull HandlerList getHandlers() {
        return handlers;
    }

}

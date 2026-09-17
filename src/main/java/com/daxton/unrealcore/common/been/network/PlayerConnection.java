package com.daxton.unrealcore.common.been.network;

import com.daxton.unrealcore.server.nms.NMSVersion;
import com.daxton.unrealcore.util.helpers.JsonUtil;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
//客戶端玩家資訊
public class PlayerConnection {

    private String modLoaders = "Unknown";  //模組加載器類別(Forge, Fabric, NeoForge, Unknown)
    private String minecraftVersion = "Unknown";  //Minecraft版本 (1.21)
    private String modVersion = "2.0";  //模組版本 (2.0)
    private String language = "en_us";  //玩家在客戶端設置使用的語言 (en_us)

    public PlayerConnection(String message) {
        PlayerConnection corePlayerBeen = JsonUtil.toObject(message, PlayerConnection.class);
        this.modLoaders = corePlayerBeen.getModLoaders();
        this.minecraftVersion = corePlayerBeen.getMinecraftVersion();
        this.modVersion = corePlayerBeen.getModVersion();
        this.language = corePlayerBeen.getLanguage();
    }

    public PlayerConnection() {
        minecraftVersion = NMSVersion.getMinecraftVersion();
    }

}

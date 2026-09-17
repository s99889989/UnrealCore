package com.daxton.unrealcore;

import com.daxton.unrealcore.server.command.MainCommand;
import com.daxton.unrealcore.server.command.MainTab;
import com.daxton.unrealcore.server.network.ConnectController;
import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class UnrealCore extends JavaPlugin {

    @Getter
    private static UnrealCore unrealCore;

    @Override
    public void onEnable() {
        unrealCore = this;

        //指令
        Objects.requireNonNull(Bukkit.getPluginCommand("unrealcore")).setExecutor(new MainCommand());
        Objects.requireNonNull(Bukkit.getPluginCommand("unrealcore")).setTabCompleter(new MainTab());

        //連線功能 啟用
        ConnectController.onEnable();


    }

    @Override
    public void onDisable() {

        //連線功能 停用
        ConnectController.onDisable();

    }

    public static UnrealCore getInstance() {
        return unrealCore;
    }

    //發送後臺訊息
    public static void sendLogger(String message){
        unrealCore.getLogger().info(message);
    }

    //發送後臺錯誤訊息
    public static void sendErrorLogger(String message){
        unrealCore.getLogger().info("Error: "+message);
    }
    //發送後台系統訊息
    public static void sendSystemLogger(String message){
        unrealCore.getLogger().info("System: "+message);
    }


    //獲取資源路徑
    public static String getResourceFolder(){
        return unrealCore.getDataFolder()+"/";
    }

}

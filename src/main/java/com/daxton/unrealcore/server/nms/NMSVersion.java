package com.daxton.unrealcore.server.nms;

//import com.comphenix.protocol.ProtocolLibrary;
//import com.viaversion.viaversion.api.Via;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class NMSVersion {

    //獲取 Server NMS 版本 v1_17_R1
    public static String getNMSVersion(){
        String minecraftVersion = NMSVersion.getMinecraftVersion();
        return versionToNMSVersion(minecraftVersion);
    }

    //獲取 Server Minecraft 版本 1.17.1
    public static String getMinecraftVersion(){
        String bukkitVersion = Bukkit.getServer().getBukkitVersion();
        bukkitVersion = bukkitVersion.substring(0, bukkitVersion.indexOf("-"));
        return bukkitVersion;
    }

    //獲取 Client NMS 版本 v1_17_R1
    public static String getClientNMSVersion(Player player){
        String nmsVersion = getNMSVersion();
        if(player != null){
            if (Bukkit.getServer().getPluginManager().getPlugin("ProtocolLib") != null){
                nmsVersion = NMSVersion.versionToNMSVersion(NMSVersion.getClientVersion(player));
            }
            if (Bukkit.getServer().getPluginManager().getPlugin("ViaVersion") != null){
                nmsVersion = NMSVersion.versionToNMSVersion(NMSVersion.getClientVersion(player));
            }
        }
        return nmsVersion;
    }

    //獲取 Client Minecraft 版本 1.17.1
    public static String getClientVersion(Player player){

        int versionID = nmsVersionToPackVersion(getNMSVersion());
//        if (Bukkit.getServer().getPluginManager().getPlugin("ViaVersion") != null){
//            versionID = Via.getAPI().getPlayerVersion(player.getUniqueId());
//        }else if (Bukkit.getServer().getPluginManager().getPlugin("ProtocolLib") != null){
//            versionID = ProtocolLibrary.getProtocolManager().getProtocolVersion(player);
//        }

        return NMSVersion.clientVersion(versionID);
    }

    //傳入版本大於等於目前版本 例如1.20.4 如果目前版本大於1.20.4就回傳true
    public static boolean isMinecraftVersionHigher(String targetVersion) {
        String currentVersion = Bukkit.getBukkitVersion().split("-")[0]; // 獲取服務器版本號
        return compareVersions(currentVersion, targetVersion) > 0;
    }

    // 比較兩個版本號的方法
    private static int compareVersions(String version1, String version2) {
        String[] parts1 = version1.split("\\.");
        String[] parts2 = version2.split("\\.");
        int length = Math.max(parts1.length, parts2.length);

        for (int i = 0; i < length; i++) {
            int v1 = i < parts1.length ? Integer.parseInt(parts1[i]) : 0;
            int v2 = i < parts2.length ? Integer.parseInt(parts2[i]) : 0;

            if (v1 != v2) {
                return Integer.compare(v1, v2);
            }
        }

        return 0; // 版本相同
    }

    //Protocol版本 轉成 Minecraft版本
    public static String clientVersion(int pack){
        switch(pack){
            case 4: return "1.7.5";
            case 5: return "1.7.10";
            case 47: return "1.8.9";
            case 107: return "1.9";
            case 108: return "1.9.1";
            case 109: return "1.9.2";
            case 110: return "1.9.4";
            case 210: return "1.10.2";
            case 315: return "1.11";
            case 316: return "1.11.2";
            case 335: return "1.12";
            case 338: return "1.12.1";
            case 340: return "1.12.2";
            case 393: return "1.13";
            case 401: return "1.13.1";
            case 404: return "1.13.2";
            case 477: return "1.14";
            case 480: return "1.14.1";
            case 485: return "1.14.2";
            case 490: return "1.14.3";
            case 498: return "1.14.4";
            case 573: return "1.15";
            case 575: return "1.15.1";
            case 578: return "1.15.2";
            case 735: return "1.16";
            case 736: return "1.16.1";
            case 751: return "1.16.2";
            case 753: return "1.16.3";
            case 754: return "1.16.5";
            case 755: return "1.17";
            case 756: return "1.17.1";
            case 757: return "1.18.1";
            case 758: return "1.18.2";
            case 759: return "1.19";
            case 760: return "1.19.2";
            case 761: return "1.19.3";
            case 762: return "1.19.4";
            case 763: return "1.20.1";
            case 764: return "1.20.2";
            case 765: return "1.20.4";
            case 766: return "1.20.6";
            case 767: return "1.21.1";
            case 768: return "1.21.3";
            case 769: return "1.21.4";
            case 770: return "1.21.5";
            case 771: return "1.21.8";
            case 25566: return "1.21.7";
            default: return "";
        }
    }

    //NMS版本 轉成 Protocol版本
    public static int nmsVersionToPackVersion(String nmsVersion){
        switch(nmsVersion){
            case "v_1_7_R1": return 4;
            case "v_1_7_R2": return 4;
            case "v_1_7_R3": return 5;
            case "v_1_7_R4": return 5;
            case "v1_8_R1": return 47;
            case "v1_8_R2": return 47;
            case "v_1_8_R3": return 47;
            case "v1_9_R1": return 109;
            case "v1_9_R2": return 110;
            case "v1_10_R1": return 210;
            case "v1_11_R1": return 316;
            case "v1_12_R1": return 340;
            case "v1_13_R1": return 393;
            case "v1_13_R2": return 404;
            case "v1_14_R1": return 498;
            case "v1_15_R1": return 578;
            case "v1_16_R1": return 736;
            case "v1_16_R2": return 753;
            case "v1_16_R3": return 754;
            case "v1_17_R1": return 756;
            case "v1_18_R1": return 757;
            case "v1_18_R2": return 758;
            case "v1_19_R1": return 760;
            case "v1_19_R2": return 761;
            case "v1_19_R3": return 762;
            case "v1_20_R1": return 763;
            case "v1_20_R2": return 764;
            case "v1_20_R3": return 765;
            case "v1_20_R4": return 766;
            case "v1_21_R1": return 767;
            case "v1_21_R2": return 768;
            case "v1_21_R3": return 769;
            case "v1_21_R4": return 770;
            case "v1_21_R5": return 771;
            default: return 772;
        }
    }

    //Minecraft版本權重，版本越高越大
    public static int getMinecraftVersionSize(String nms){
        switch(nms){
            case "1.7.2": return 1;
            case "1.7.5": return 2;
            case "1.7.8": return 3;
            case "1.7.10": return 4;
            case "1.8.1": return 5;
            case "1.8.4": return 6;
            case "1.8.8": return 7;
            case "1.9.2": return 8;
            case "1.9.4": return 9;
            case "1.10.2": return 10;
            case "1.11.2": return 11;
            case "1.12": return 12;
            case "1.12.1": return 13;
            case "1.12.2": return 14;
            case "1.13": return 15;
            case "1.13.1": return 16;
            case "1.13.2": return 17;
            case "1.14": return 18;
            case "1.14.1": return 19;
            case "1.14.2": return 20;
            case "1.14.3": return 21;
            case "1.14.4": return 22;
            case "1.15": return 23;
            case "1.15.2": return 24;
            case "1.16": return 25;
            case "1.16.1": return 26;
            case "1.16.3": return 27;
            case "1.16.5": return 28;
            case "1.17": return 29;
            case "1.17.1": return 30;
            case "1.18": return 31;
            case "1.18.1": return 32;
            case "1.18.2": return 33;
            case "1.19": return 34;
            case "1.19.1": return 35;
            case "1.19.2": return 36;
            case "1.19.3": return 37;
            case "1.19.4": return 38;
            case "1.20": return 39;
            case "1.20.1": return 40;
            case "1.20.2": return 41;
            case "1.20.3": return 42;
            case "1.20.4": return 43;
            case "1.20.5": return 44;
            case "1.20.6": return 45;
            case "1.21": return 46;
            case "1.21.1": return 47;
            case "1.21.2": return 48;
            case "1.21.3": return 49;
            case "1.21.4": return 50;
            case "1.21.5": return 51;
            case "1.21.6": return 52;
            case "1.21.7": return 53;
            case "1.21.8": return 54;
            default: return 55;
        }
    }

    //Minecraft版本 轉成 NMS版本
    public static String versionToNMSVersion(String version){
        switch(version){
            case "1.7.2": return "v_1_7_R1";
            case "1.7.5": return "v_1_7_R2";
            case "1.7.8": return "v_1_7_R3";
            case "1.7.10": return "v_1_7_R4";
            case "1.8.1": return "v1_8_R1";
            case "1.8.4": return "v1_8_R2";
            case "1.8.8": return "v_1_8_R3";
            case "1.9.2": return "v1_9_R1";
            case "1.9.4": return "v1_9_R2";
            case "1.10.2": return "v1_10_R1";
            case "1.11.2": return "v1_11_R1";
            case "1.12.2": return "v1_12_R1";
            case "1.13": return "v1_13_R1";
            case "1.13.2": return "v1_13_R2";
            case "1.14.4": return "v1_14_R1";
            case "1.15.2": return "v1_15_R1";
            case "1.16.1": return "v1_16_R1";
            case "1.16.3": return "v1_16_R2";
            case "1.16.5": return "v1_16_R3";
            case "1.17": return "v1_17_R1";
            case "1.17.1": return "v1_17_R1";
            case "1.18": return "v1_18_R1";
            case "1.18.1": return "v1_18_R1";
            case "1.18.2": return "v1_18_R2";
            case "1.19": return "v1_19_R1";
            case "1.19.1": return "v1_19_R1";
            case "1.19.2": return "v1_19_R1";
            case "1.19.3": return "v1_19_R2";
            case "1.19.4": return "v1_19_R3";
            case "1.20": return "v1_20_R1";
            case "1.20.1": return "v1_20_R1";
            case "1.20.2": return "v1_20_R2";
            case "1.20.3": return "v1_20_R3";
            case "1.20.4": return "v1_20_R3";
            case "1.20.5": return "v1_20_R4";
            case "1.20.6": return "v1_20_R4";
            case "1.21.1": return "v1_21_R1";
            case "1.21.2": return "v1_21_R2";
            case "1.21.3": return "v1_21_R2";
            case "1.21.4": return "v1_21_R3";
            case "1.21.5": return "v1_21_R4";
            case "1.21.6": return "v1_21_R5";
            case "1.21.7": return "v1_21_R5";
            case "1.21.8": return "v1_21_R5";
        }
        return "";
    }

}

package com.daxton.unrealcore.common.been.common.type;

public enum ModelType {

    //預設,   時裝工坊, BB模型,   方塊 , BMD ,  史詩戰鬥 ,  圖片,  物品, OBJ, PK, 文字,  影片,  帽子
    DEFAULT, ARMOUR, BBMODEL, BLOCK, BMD, EPICFIGHT, IMAGE, ITEM, OBJ, PK, TEXT, VIDEO, HAT;


    //字串轉模型類型
    public static ModelType to(String name){
        return to(name, DEFAULT);
    }

    //字串轉模型類型
    public static ModelType to(String name, ModelType defaultType){
        if (name == null) {
            return defaultType; // 處理空字串，返回一個默認值
        }
        try {
            return ModelType.valueOf(name.toUpperCase());
        }catch (IllegalArgumentException e){
            return defaultType; // 如果字串不匹配任何枚舉值，返回默認值
        }
    }

    //字串轉模型類型
    public static ModelType toNull(String name){
        if (name == null) {
            return null; // 處理空字串，返回一個默認值
        }
        try {
            return ModelType.valueOf(name.toUpperCase());
        }catch (IllegalArgumentException e){
            return null; // 如果字串不匹配任何枚舉值，返回默認值
        }
    }

}

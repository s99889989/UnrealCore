package com.daxton.unrealcore.util.helpers;

import com.daxton.unrealcore.UnrealCore;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

public class JsonUtil {

    //把Json轉成物件
    public static <T> T toObject(String jsonString, Class<T> classOfT) {
        try {
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            return gson.fromJson(jsonString, classOfT);
        }catch (JsonSyntaxException jsonSyntaxException){
            UnrealCore.sendErrorLogger("JsonString: "+jsonString);
            return null;
        }
    }

}

package com.daxton.unrealcore.util.helpers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ObjectUtil {

    //把物件轉成Json字串
    public static String toJson(Object object) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        return gson.toJson(object);
    }

}

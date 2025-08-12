package com.daxton.unrealcore.common.been.player.display.widgets.control;

import com.daxton.unrealcore.common.been.player.display.DefaultModuleData;

import java.util.LinkedHashMap;
import java.util.Map;

public class ContainerModuleData extends DefaultModuleData {

    private String width = "200";  //顯示寬
    private String height = "150";  //顯示高
    private String actualWidth = "200";  //實際的寬
    private String actualHeight = "150";  //實際的高
    private String image = "";  //背景圖
    private String color = "0xffffff";  //被景色(int)
    private String transparent = "255";  //背景透明度(int)

    private String scrollBackgroundImageRight = "";  //滾動條 背景 圖 右
    private String scrollBackgroundImageBottom = "";  //滾動條 背景 圖 底
    private String scrollBackgroundColor = "0xc0c0c0";  //滾動條.背景.顏色
    private String scrollBackgroundTransparent = "255";  //滾動條.背景.透明度

    private String scrollImageRight = "";  //滾動條 邊條 圖 右
    private String scrollImageBottom = "";  //滾動條 邊條 圖 底
    private String scrollColor = "0xc0c0c0";  //滾動條.顏色
    private String scrollTransparent = "255";  //滾動條.透明度

    private String scrollSidebarColor = "0xc0c0c0";  //滾動條.邊條.顏色
    private String scrollSidebarTransparent = "100";  //滾動條.邊條.透明度

    private String scrollX = "0";  //滾動條X位置(0~100)(int)
    private String scrollY = "0";  //滾動條Y位置(0~100)(int)
    private String overflowXHide = "true";  //超出X範圍隱藏(boolean)
    private String overflowYHide = "true";  //超出Y範圍隱藏(boolean)
    private String scrollXDisplay = "1";  //X滾動條顯示(1 = 超出才顯示, 2 = 不顯示, 3 = 總是顯示)(int)
    private String scrollYDisplay = "1";  //2Y滾動條顯示(1 = 超出才顯示, 2 = 不顯示, 3 = 總是顯示)(int)
    private String use = "true";  //可以使用(boolean)
    private Map<String, DefaultModuleData> moduleDataMap = new LinkedHashMap<>();  //子模塊列表
    private String scrollDelta = "10";  //滾動增量

}

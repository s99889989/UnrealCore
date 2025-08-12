package com.daxton.unrealcore.common.been.player.display.widgets.display;

import com.daxton.unrealcore.common.been.player.display.DefaultModuleData;

import java.util.ArrayList;
import java.util.List;

public class ImageModuleData extends DefaultModuleData {

    private String width = "0";  //寬
    private String height = "0";  //高
    private String uvStartX;  //UV 起始 X 位置
    private String uvStartY;  //UV 起始 Y 位置
    private String uvEndX;  //UV 結尾 Y 位置
    private String uvEndY;  //UV 結尾 Y 位置
    private List<String> image = new ArrayList<>();  //圖片位址
    private String color = "0xffffff";  //顏色(0xffffff)(int)
    private String transparent = "255";  //顏色透明度(0~255)(int)
    private String cycle = "-1";  //播放次數
    private String tick = "20";  //多少tick後換下一張圖

}

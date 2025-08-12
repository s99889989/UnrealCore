package com.daxton.unrealcore.common.been.player.display.widgets.display;

import com.daxton.unrealcore.common.been.player.display.DefaultModuleData;

import java.util.ArrayList;
import java.util.List;

public class TextModuleData extends DefaultModuleData {

    private List<String> text = new ArrayList<>();  //顯示的文字
    private String textColor = "#FFFFFF";  //文字顏色(int)
    private String textSize = "1";  //文字縮放大小(float)
    private String space = "10";  //每行文字間距(int)
    private String width = "0";  //限制寬度自動換行
    private String font = "";  //使用的字形
    private String shadow = "false";  //文字陰影

}

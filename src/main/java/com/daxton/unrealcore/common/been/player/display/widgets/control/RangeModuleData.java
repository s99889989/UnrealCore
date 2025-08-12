package com.daxton.unrealcore.common.been.player.display.widgets.control;

import com.daxton.unrealcore.common.been.player.display.DefaultModuleData;

import java.util.LinkedList;
import java.util.List;

public class RangeModuleData extends DefaultModuleData {

    private String width = "0";  //背景-寬
    private String height = "0";  //背景-高

    private String image = "";  //背景-圖
    private String radius = "0";  //背景-圓角(int)
    private String color = "0xffffff";  //背景-顏色(int)
    private String transparent = "255";  //背景-透明度(int)
    private String straight = "false";  //預設為橫式，是否改為直式(boolean)

    private String optionWidth = "0";  //目標-寬
    private String optionHeight = "0";  //目標-高
    private String optionImage = "";  //目標-圖
    private String optionColor = "0x000000";  //目標-顏色(int)
    private String optionTransparent = "0x000000";  //目標-透明度(int)
    private String optionChoose = "";  //預設選項
    private String optionChooseShow = "false";  //是否顯示選項名稱(boolean)
    private String optionChooseColor = "0xFFFFFF";  //是否顯示選項名稱(boolean)
    private List<String> optionList = new LinkedList<>();  //選項
    private String use = "true";  //可以使用(boolean)
    private String font = "";  //使用的字形

}

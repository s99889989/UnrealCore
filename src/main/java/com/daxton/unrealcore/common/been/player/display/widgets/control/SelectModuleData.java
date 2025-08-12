package com.daxton.unrealcore.common.been.player.display.widgets.control;

import com.daxton.unrealcore.common.been.player.display.DefaultModuleData;

import java.util.LinkedList;
import java.util.List;

public class SelectModuleData extends DefaultModuleData {

    private String width = "20";  //寬
    private String height = "10";  //高
    private String radius = "0";  //圓角(int)
    private String image = "";  //背景 圖
    private String color = "0xffffff";  //背景 顏色(int)
    private String transparent = "255";  //背景 透明度(int)
    private String textSize = "1";  //文字縮放大小(float)
    private String textColor = "0xffffff";  //文字顏色(int)

    private String optionWidth = "20";  //選項背景 寬
    private String optionHeight = "10";  //選項背景 高
    private String optionImage = "";  //選項背景 圖
    private String optionColor = "0xffffff";  //選項背景 顏色(int)
    private String optionTransparent = "255";  //選項背景 透明度(int)
    private String optionHoverColor = "0xffffff";  //選項背景 滑過顏色(int)
    private String optionHoverTransparent = "255";  //選項背景 滑過透明度(int)
    private String optionTextColor = "0xffffff";  //選項文字 顏色(int)
    private String optionTextHoverColor = "0xffffff";  //選項文字滑過 顏色(int)
    private String optionTextSize = "1";  //選項文字 大小(float)
    private String optionDirection = "1";  //彈出方向(1 = 下, 2 = 左, 3 = 上, 4 = 右 )(int)
    private String optionChoose = "";  //選擇的選項
    private List<String> optionList = new LinkedList<>();  //選項列表
    private String use = "true";  //可以使用(boolean)
    private String font = "";  //使用的字形

}

package com.daxton.unrealcore.common.been.player.display.widgets.control;

import com.daxton.unrealcore.common.been.player.display.DefaultModuleData;

public class SlotModuleData extends DefaultModuleData {

    private String width = "0";  //寬
    private String height = "0";  //高

    private String image = "";  //底圖  unrealcore:textures/gui/slot/black.png
    private String color = "0xffffff";  //背景顏色(0xffffff)(int)
    private String transparent = "255";  //背景透明度(0~255)(int)

    private String hoverMargin = "1";  //滑鼠滑過邊距(int)
    private String hoverColor = "0xffffff";  //滑鼠滑過顏色(int)
    private String hoverTransparent = "100";  //滑鼠滑過透明度(int)

    private String slot = "1";  //物品格ID(int)
    private String itemSize = "1";  //物品縮放大小(float)

    private String use = "true";  //可以使用(boolean)

    private String selectImage = "";  //選擇顯示的圖
    private String selectColor = "0xFFFFFF";  //選擇顯示的顏色
    private String selectTransparent = "0";  //選擇顯示的透明度
    private String selectWidth = "20";  //選擇顯示的寬
    private String selectHeight = "20";  //選擇顯示的高

}

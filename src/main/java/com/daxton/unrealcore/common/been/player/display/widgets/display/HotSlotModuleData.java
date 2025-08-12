package com.daxton.unrealcore.common.been.player.display.widgets.display;

import com.daxton.unrealcore.common.been.player.display.DefaultModuleData;

public class HotSlotModuleData extends DefaultModuleData {

    private String width = "0";  //寬
    private String height = "0";  //高
    private String image = "unrealcore:textures/gui/slot/black.png";  //底圖
    private String color = "0xffffff";  //背景顏色(0xffffff)(int)
    private String transparent = "255";  //背景透明度(0~255)(int)

    private String hoverMargin = "1";  //滑鼠滑過邊距(int)
    private String hoverColor = "0xffffff";  //滑鼠滑過顏色(int)
    private String hoverTransparent = "255";  //滑鼠滑過透明度(int)

    private String slot = "1";  //物品格ID(1~9)(int)
    private String itemSize = "1";  //物品縮放大小(float)

}

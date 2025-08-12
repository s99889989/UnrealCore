package com.daxton.unrealcore.common.been.player.display.widgets.input;

import com.daxton.unrealcore.common.been.player.display.DefaultModuleData;

import java.util.ArrayList;
import java.util.List;

public class AreaInputModuleData extends DefaultModuleData {

    private String image = "";  //圖片位址
    private String width = "60";  //寬
    private String height = "100";  //高
    private String color = "0xeb0505";  //被景色(int)
    private String transparent = "255";  //背景透明度(int)
    private List<String> text = new ArrayList<>();  //輸入內容
    private String textColor = "000000";  //輸入內容顏色(int)
    private String textSize = "1";  //輸入內容縮放大小(float)
    private String textMaxLength = "256";  //最大輸入字串長度
    private String inputStart = "1";  //增減輸入開始的位置
    private String inputEnd = "1";  //增減輸入結束的位置
    private String use = "true";  //可以使用(boolean)
    private String font = "";  //使用的字形

}

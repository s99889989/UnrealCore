package com.daxton.unrealcore.common.been.player.display.widgets.input;

import com.daxton.unrealcore.common.been.player.display.DefaultModuleData;

public class InputModuleData extends DefaultModuleData {

    private String width = "0";  //寬
    private String height = "0";  //高
    private String image = "";  //圖片位址
    private String color = "0xffffff";  //背景顏色
    private String transparent = "255";  //背景透明度
    private String title = "";  //標題
    private String titleColor = "0xCDAD00";  //標題顏色(int)
    private String titleSize = "1";  //標題縮放大小(float)
    private String prompt = "";  //提示文
    private String promptColor = "0x8B7355";  //提示文文字顏色(int)
    private String promptSize = "1";  //提示文文字縮放大小(float)
    private String text = "";  //輸入內容
    private String textColor = "0xFFFFFF";  //輸入內容顏色(int)
    private String textSize = "1";  //輸入內容縮放大小(float)
    private String textMaxLength = "256";  //最大輸入字串長度
    private String inputStart = "1";  //增減輸入開始的位置
    private String inputEnd = "1";  //增減輸入結束的位置
    private String use = "true";  //可以使用(boolean)
    private String font = "";  //使用的字形

}

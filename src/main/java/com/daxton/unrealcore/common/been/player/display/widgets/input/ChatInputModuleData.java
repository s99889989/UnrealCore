package com.daxton.unrealcore.common.been.player.display.widgets.input;

import com.daxton.unrealcore.common.been.player.display.DefaultModuleData;

public class ChatInputModuleData extends DefaultModuleData {

    private String width = "0";  //寬
    private String height = "0";  //高
    private String image = "";  //圖片位址
    private String color = "0xffffff";  //背景顏色
    private String transparent = "255";  //背景透明度
    private String text = "";  //輸入內容
    private String textColor = "0x9370DB";  //輸入內容顏色(int)
    private String textSize = "1";  //輸入內容縮放大小(float)
    private String textMaxLength = "256";  //最大輸入字串長度
    private String inputStart = "1";  //增減輸入開始的位置
    private String inputEnd = "1";  //增減輸入結束的位置
    private String input = "false";  //是否正在輸入
    private String font = "";  //使用的字形
    private String channel = "default";  //頻道名稱

}

package com.daxton.unrealcore.common.been.player.display.widgets.control;

import com.daxton.unrealcore.common.been.player.display.DefaultModuleData;

public class CheckModuleData extends DefaultModuleData {

    private String width = "20";  //寬
    private String height = "20";  //高
    private String onImage = "";  //圖片位址(有選)
    private String offImage = "";  //圖片位址(沒選)
    private String text = "";  //顯示的文字
    private String textColor = "000000";  //文字顏色(int)
    private String textSize = "1";  //文字縮放大小(float)
    private String textPlace = "1";  //文字的擺放方向( 1 = 右, 2 = 下, 3 = 左, 4 = 上 )(int)
    private String textDistance = "10";  //文字離圖的距離(int)
    private String check = "false";  //是否選擇(boolean)
    private String font = "";  //使用的字形

    private String use = "true";  //可以使用(boolean)

}

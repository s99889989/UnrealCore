package com.daxton.unrealcore.common.been.common.base;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class LocationBeen {

    //X座標
    private double positionX = 0;
    //Y座標
    private double positionY = 0;
    //Z座標
    private double positionZ = 0;
    //旋轉X
    private float rotateX = 0;
    //旋轉Y
    private float rotateY = 0;
    //旋轉Z
    private float rotateZ = 0;
    //縮放X
    private float scaleX = 1;

}

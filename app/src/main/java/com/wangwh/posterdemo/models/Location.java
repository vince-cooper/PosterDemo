package com.wangwh.posterdemo.models;

/**
 * @Author: 王文辉
 * @Date: 2022-04-19 14:17
 * @Desc: 坐标属性
 * @Note:
 */
public class Location {
    private int x;
    private int y;
    /**
     * 基于的原点
     * @see OriginType
     */
    private int origin;

    public OriginType getOriginType() {
        return OriginType.Companion.find(origin);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getOrigin() {
        return origin;
    }

    public void setOrigin(int origin) {
        this.origin = origin;
    }
}

package com.wangwh.posterdemo.models;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;

/**
 * @Author: 王文辉
 * @Date: 2022-04-19 14:19
 * @Desc: View属性
 * @Note:
 */
public abstract class ViewAttrs extends Location {
    private int w = ViewGroup.LayoutParams.WRAP_CONTENT;
    private int h = ViewGroup.LayoutParams.WRAP_CONTENT;

    @NonNull
    public abstract View createView(@NonNull Context context);

    @NonNull
    public ViewGroup.MarginLayoutParams createLayoutParams() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(getW(), getH());

        OriginType originType = getOriginType();
        if (originType == OriginType.LeftTop) {
            layoutParams.setMargins(getX(), getY(), 0, 0);
        } else if (originType == OriginType.RightTop) {
            layoutParams.gravity = Gravity.RIGHT;
            layoutParams.setMargins(0, getY(), getX(), 0);
        }

        return layoutParams;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
}

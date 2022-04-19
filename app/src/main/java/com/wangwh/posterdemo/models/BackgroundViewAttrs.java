package com.wangwh.posterdemo.models;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;

import com.bumptech.glide.Glide;

/**
 * @Author: 王文辉
 * @Date: 2022-04-19 14:36
 * @Desc: 背景属性
 * @Note:
 */
public class BackgroundViewAttrs extends ImageViewAttrs {

    @Override
    public int getW() {
        return ViewGroup.LayoutParams.MATCH_PARENT;
    }

    @Override
    public int getH() {
        return ViewGroup.LayoutParams.MATCH_PARENT;
    }

    @Override
    @NonNull
    public View createView(@NonNull Context context) {
        AppCompatImageView view = new AppCompatImageView(context);
        view.setScaleType(ImageView.ScaleType.FIT_XY);
        Glide.with(context).load(getUrl()).into(view);
        return view;
    }
}

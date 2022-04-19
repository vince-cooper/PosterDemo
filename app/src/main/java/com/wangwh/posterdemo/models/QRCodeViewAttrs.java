package com.wangwh.posterdemo.models;

import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;

import com.wangwh.posterdemo.utils.QRCodeUtil;

/**
 * @Author: 王文辉
 * @Date: 2022-04-19 14:45
 * @Desc: 二维码属性
 * @Note:
 */
public class QRCodeViewAttrs extends ViewAttrs {
    private String text;

    @Override
    @NonNull
    public View createView(@NonNull Context context) {
        AppCompatImageView view = new AppCompatImageView(context);
        view.setImageBitmap(QRCodeUtil.createQRCodeBitmap(getText(), getW(), getH(), "0"));
        return view;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

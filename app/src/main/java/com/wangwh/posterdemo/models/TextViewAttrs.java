package com.wangwh.posterdemo.models;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;

import com.wangwh.posterdemo.utils.ColorUtil;

/**
 * @Author: 王文辉
 * @Date: 2022-04-19 14:31
 * @Desc: 文字属性
 * @Note:
 */
public class TextViewAttrs extends ViewAttrs {
    private String text;
    private float textSize;
    private String textColor;
    private int maxLines;

    @Override
    @NonNull
    public View createView(@NonNull Context context) {
        AppCompatTextView view = new AppCompatTextView(context);
        view.setText(text);
        view.setTextColor(ColorUtil.parse(textColor, Color.BLACK));
        view.setTextSize(TypedValue.COMPLEX_UNIT_PX, textSize);
        if (maxLines > 0) {
            view.setMaxLines(maxLines);
        }
        return view;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public float getTextSize() {
        return textSize;
    }

    public void setTextSize(float textSize) {
        this.textSize = textSize;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public int getMaxLines() {
        return maxLines;
    }

    public void setMaxLines(int maxLines) {
        this.maxLines = maxLines;
    }
}

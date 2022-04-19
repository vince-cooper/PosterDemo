package com.wangwh.posterdemo.models

import android.content.Context
import android.util.TypedValue
import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import com.wangwh.posterdemo.utils.ColorUtil

/**
 * @Author: 王文辉
 * @Date: 2022-04-19 09:54
 * @Desc: 定义[AppCompatTextView]属性
 * @Note:
 */
class TextViewAttrs(
    x: Int,
    y: Int,
    origin: Int = 0,
    w: Int,
    h: Int,
    val text: String,
    val textSize: Float,
    val textColor: String,
    val maxLines: Int? = null,
) : ViewAttrs(x = x, y = y, origin = origin, w = w, h = h) {
    override fun createView(ctx: Context): View {
        val attrs = this@TextViewAttrs
        return AppCompatTextView(ctx).apply {
            text = attrs.text
            setTextColor(ColorUtil.parse(attrs.textColor))
            setTextSize(TypedValue.COMPLEX_UNIT_PX, attrs.textSize)
            if (attrs.maxLines != null) {
                maxLines = attrs.maxLines
            }
        }
    }
}
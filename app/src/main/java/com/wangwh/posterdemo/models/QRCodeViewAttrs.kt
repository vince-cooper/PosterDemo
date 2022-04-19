package com.wangwh.posterdemo.models

import android.content.Context
import android.view.View
import androidx.appcompat.widget.AppCompatImageView
import com.wangwh.posterdemo.utils.QRCodeUtil

/**
 * @Author: 王文辉
 * @Date: 2022-04-19 10:57
 * @Desc: 定义二维码属性
 * @Note:
 */
class QRCodeViewAttrs(
    x: Int,
    y: Int,
    origin: Int = 0,
    w: Int,
    h: Int,
    val text: String,
) : ViewAttrs(x = x, y = y, origin = origin, w = w, h = h) {
    override fun createView(ctx: Context): View {
        val attrs = this@QRCodeViewAttrs
        return AppCompatImageView(ctx).apply {
            setImageBitmap(QRCodeUtil.createQRCodeBitmap(attrs.text, attrs.w, attrs.h, "0"))
        }
    }
}
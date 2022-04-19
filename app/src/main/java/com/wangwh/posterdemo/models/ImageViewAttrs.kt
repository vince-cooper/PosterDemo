package com.wangwh.posterdemo.models

import android.content.Context
import android.view.View
import androidx.annotation.DrawableRes
import androidx.appcompat.widget.AppCompatImageView
import com.bumptech.glide.Glide

/**
 * @Author: 王文辉
 * @Date: 2022-04-19 09:54
 * @Desc: 定义[AppCompatImageView]属性
 * @Note:
 */
class ImageViewAttrs(
    x: Int,
    y: Int,
    origin: Int = 0,
    w: Int,
    h: Int,
    val url: String,
) : ViewAttrs(x = x, y = y, origin = origin, w = w, h = h) {
    override fun createView(ctx: Context): View {
        val attrs = this
        return AppCompatImageView(ctx).apply {
            Glide.with(this).load(attrs.url).into(this)
        }
    }
}
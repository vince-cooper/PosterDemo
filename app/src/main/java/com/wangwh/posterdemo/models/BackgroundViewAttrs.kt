package com.wangwh.posterdemo.models

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import com.bumptech.glide.Glide

/**
 * @Author: 王文辉
 * @Date: 2022-04-19 10:45
 * @Desc: 定义海报背景图属性
 * @Note:
 */
class BackgroundViewAttrs(
    val url: String,
) : ViewAttrs(
    x = 0,
    y = 0,
    w = ViewGroup.LayoutParams.MATCH_PARENT,
    h = ViewGroup.LayoutParams.MATCH_PARENT
) {
    override fun createView(ctx: Context): View {
        val attrs = this
        return AppCompatImageView(ctx).apply {
            Glide.with(this).load(attrs.url).into(this)
        }
    }
}
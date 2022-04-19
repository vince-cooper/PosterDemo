package com.wangwh.posterdemo.models

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Keep

/**
 * @Author: 王文辉
 * @Date: 2022-04-19 09:53
 * @Desc:
 * @Note:
 */
@Keep
@Suppress("MemberVisibilityCanBePrivate")
abstract class ViewAttrs(
    x: Int,
    y: Int,
    origin: Int = 0,
    val w: Int,
    val h: Int,
) : Location(x = x, y = y, origin = origin) {
    abstract fun createView(ctx: Context): View
    open fun createLayoutParams(): ViewGroup.MarginLayoutParams {
        return ViewGroup.MarginLayoutParams(w, h).apply {
            when (originType) {
                OriginType.LeftTop -> {
                    leftMargin = x
                    topMargin = y
                }
                OriginType.RightTop -> {
                    rightMargin = x
                    topMargin = y
                }
            }
        }
    }
}
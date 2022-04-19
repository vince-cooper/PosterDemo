package com.wangwh.posterdemo.utils

import android.graphics.Color
import androidx.annotation.ColorInt

/**
 * @Author: 王文辉
 * @Date: 2022-04-19 10:36
 * @Desc:
 * @Note:
 */
object ColorUtil {
    @ColorInt
    @JvmStatic
    fun parse(color: String, default: Int = Color.BLACK): Int {
        try {
            return Color.parseColor(color)
        } catch (e: IllegalArgumentException) {

        }
        return default
    }
}
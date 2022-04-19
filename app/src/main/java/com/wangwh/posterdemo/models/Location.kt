package com.wangwh.posterdemo.models

import androidx.annotation.Keep

/**
 * @Author: 王文辉
 * @Date: 2022-04-19 09:31
 * @Desc: 坐标
 * @Note:
 */
@Keep
open class Location(
    val x: Int,
    val y: Int,
    val origin: Int = 0
) {
    val originType: OriginType get() = OriginType.find(origin)
}
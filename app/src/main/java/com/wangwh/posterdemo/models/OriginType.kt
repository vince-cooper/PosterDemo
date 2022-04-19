package com.wangwh.posterdemo.models

/**
 * @Author: 王文辉
 * @Date: 2022-04-19 10:13
 * @Desc:
 * @Note:
 */
enum class OriginType(val field: Int) {
    LeftTop(0),
    RightTop(1),
    ;
    companion object {
        fun find(field: Int): OriginType {
            values().forEach {
                if (it.field == field) {
                    return it
                }
            }
            return LeftTop
        }
    }
}
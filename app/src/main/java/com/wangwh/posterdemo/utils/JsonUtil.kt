package com.wangwh.posterdemo.utils

import android.content.Context
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

/**
 * @Author: 王文辉
 * @Date: 2022-04-19 11:51
 * @Desc:
 * @Note:
 */
object JsonUtil {
    @JvmStatic
    fun getAssetJson(ctx: Context, filePath: String): String {
        val stringBuilder = StringBuilder()
        try {
            val assetManager = ctx.assets
            val bf =
                BufferedReader(InputStreamReader(assetManager.open(filePath)))
            var line: String?
            while (bf.readLine().also { line = it } != null) {
                stringBuilder.append(line)
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return stringBuilder.toString()
    }
}
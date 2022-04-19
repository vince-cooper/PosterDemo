@file:Suppress("unused")

package com.wangwh.posterdemo.widgets

import android.content.Context
import android.util.AttributeSet
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.core.view.updateLayoutParams
import com.wangwh.posterdemo.models.ViewAttrs
import com.wangwh.posterdemo.response.PosterTemplateData

/**
 * @Author: 王文辉
 * @Date: 2022-04-19 10:41
 * @Desc: 自定义海报View
 * @Note:
 */
class PosterView : FrameLayout {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    constructor(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int
    ) : super(context, attrs, defStyleAttr, defStyleRes)

    fun initPoster(data: PosterTemplateData) {
        updateLayoutParams<ViewGroup.LayoutParams> {
            width = 300
            height = 534
        }
        scaleX = 2.6f
        scaleY = 2.6f

        addView(data.image)
        addView(data.background)
        addView(data.qrcode)
        addView(data.title)
        addView(data.name)
        addView(data.age)
        addView(data.school)
    }

    private fun <T : ViewAttrs> addView(attrs: T?) {
        if (attrs == null) return

        val view = attrs.createView(context)
        val layoutParams = attrs.createLayoutParams()
        this.addView(view, layoutParams)
    }
}
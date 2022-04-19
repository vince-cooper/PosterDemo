package com.wangwh.posterdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.RelativeLayout
import android.widget.Toast
import com.google.gson.Gson
import com.google.gson.JsonSyntaxException
import com.wangwh.posterdemo.response.PosterTemplateData
import com.wangwh.posterdemo.utils.JsonUtil
import com.wangwh.posterdemo.widgets.PosterView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val data = getPosterTemplateData()
        if (data == null) {
            Toast.makeText(this, "解析数据失败！", Toast.LENGTH_LONG).show()
            return
        }

        val rootView = RelativeLayout(this).apply {
            gravity = Gravity.CENTER
        }
        setContentView(rootView)

        val posterView = createPosterView(data)
        rootView.addView(
            posterView,
            resources.getDimensionPixelOffset(R.dimen.poster_width),
            resources.getDimensionPixelOffset(R.dimen.poster_height)
        )
    }

    private fun getPosterTemplateData(): PosterTemplateData? {
        val json = JsonUtil.getAssetJson(this, "poster.json")
        try {
            return Gson().fromJson(json, PosterTemplateData::class.java)
        } catch (e: JsonSyntaxException) {

        }
        return null
    }

    private fun createPosterView(data: PosterTemplateData): View {
        return PosterView(baseContext).apply {
            initPoster(data)
        }
    }
}
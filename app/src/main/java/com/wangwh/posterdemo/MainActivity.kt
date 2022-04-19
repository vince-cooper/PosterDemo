package com.wangwh.posterdemo

import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
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
            finish()
            return
        }

        val rootView = RelativeLayout(this).apply {
            gravity = Gravity.CENTER
        }
        setContentView(rootView)

        val posterView = PosterView(this)
        rootView.addView(
            posterView,
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        posterView.initPoster(data)
    }

    private fun getPosterTemplateData(): PosterTemplateData? {
        val json = JsonUtil.getAssetJson(this, "poster.json")
        try {
            return Gson().fromJson(json, PosterTemplateData::class.java)
        } catch (e: JsonSyntaxException) {

        }
        return null
    }
}
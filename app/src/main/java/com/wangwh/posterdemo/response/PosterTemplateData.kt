package com.wangwh.posterdemo.response

import com.wangwh.posterdemo.models.BackgroundViewAttrs
import com.wangwh.posterdemo.models.ImageViewAttrs
import com.wangwh.posterdemo.models.QRCodeViewAttrs
import com.wangwh.posterdemo.models.TextViewAttrs

/**
 * @Author: 王文辉
 * @Date: 2022-04-19 11:19
 * @Desc:
 * @Note:
 */
class PosterTemplateData(
    val image: ImageViewAttrs? = null,
    val background: BackgroundViewAttrs? = null,
    val title: TextViewAttrs? = null,
    val name: TextViewAttrs? = null,
    val age: TextViewAttrs? = null,
    val school: TextViewAttrs? = null,
    val qrcode: QRCodeViewAttrs? = null,
)
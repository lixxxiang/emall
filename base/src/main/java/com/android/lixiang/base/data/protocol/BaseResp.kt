package com.android.lixiang.base.data.protocol

data class BaseResp<out T>(val status:Int, val message:String, val data:
T)

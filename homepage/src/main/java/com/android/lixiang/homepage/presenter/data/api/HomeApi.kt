package com.android.lixiang.homepage.presenter.data.api

import com.android.lixiang.base.data.protocol.BaseResp
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Headers

interface HomeApi {
    @Headers("Content-Type:text/html;charset=utf-8", "Accept:application/json;")
    @GET("global/mobile/homePageUnits")
    fun homePageUnits(): Observable<BaseResp<String>>
}
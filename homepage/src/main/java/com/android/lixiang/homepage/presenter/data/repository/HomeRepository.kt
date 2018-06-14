package com.android.lixiang.homepage.presenter.data.repository

import com.android.lixiang.base.common.BaseConstant.Companion.SERVER_ADDRESS_8024
import com.android.lixiang.base.data.net.RetrofitFactory
import com.android.lixiang.base.data.protocol.BaseResp
import com.android.lixiang.homepage.presenter.data.api.HomeApi
import com.android.lixiang.homepage.presenter.data.bean.HomePageUnitsBean
import io.reactivex.Observable
import javax.inject.Inject

class HomeRepository @Inject constructor(){
    fun HomePageUnits(): Observable<HomePageUnitsBean> {
        return RetrofitFactory(SERVER_ADDRESS_8024).create(HomeApi::class.java).homePageUnits()
    }
}
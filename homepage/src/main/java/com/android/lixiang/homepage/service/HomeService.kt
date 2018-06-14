package com.android.lixiang.homepage.service

import com.android.lixiang.homepage.presenter.data.bean.HomePageUnitsBean
import io.reactivex.Observable

interface HomeService {
    fun HomePageUnits(): Observable<HomePageUnitsBean>
}

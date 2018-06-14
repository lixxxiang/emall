package com.android.lixiang.homepage.service

import io.reactivex.Observable

interface HomeService {
    fun HomePageUnits(): Observable<Boolean>
}

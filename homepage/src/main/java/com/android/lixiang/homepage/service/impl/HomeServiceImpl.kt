package com.android.lixiang.homepage.service.impl

import com.android.lixiang.base.data.protocol.BaseResp
import com.android.lixiang.base.rx.BaseException
import com.android.lixiang.base.rx.BaseFunc
import com.android.lixiang.base.rx.BaseFuncBoolean
import com.android.lixiang.homepage.presenter.data.bean.HomePageUnitsBean
import com.android.lixiang.homepage.presenter.data.repository.HomeRepository
import com.android.lixiang.homepage.service.HomeService
import com.orhanobut.logger.Logger
import io.reactivex.Observable
import io.reactivex.ObservableSource
import javax.inject.Inject
import io.reactivex.functions.Function

class HomeServiceImpl @Inject constructor(): HomeService {
    @Inject
    lateinit var homeRepository: HomeRepository

//    override fun HomePageUnits(): Observable<Boolean> {
//        return homeRepository.HomePageUnits().flatMap(Function<BaseResp<String>, ObservableSource<Boolean>> { t ->
//            println("----））））" + t)
//            if (t.status != 0) {
//                return@Function Observable.error(BaseException(t.status, t.message))
//            }
//            Observable.just(true)
//        })
//    }

    override fun HomePageUnits(): Observable<HomePageUnitsBean> {

        return homeRepository.HomePageUnits()
    }
}
package com.android.lixiang.homepage.presenter

import com.android.lixiang.base.ext.execute
import com.android.lixiang.base.presenter.BasePresenter
import com.android.lixiang.base.rx.BaseObserver
import com.android.lixiang.homepage.presenter.data.bean.HomePageUnitsBean
import com.android.lixiang.homepage.presenter.view.HomeView
import com.android.lixiang.homepage.service.HomeService
import javax.inject.Inject

class HomePresenter @Inject constructor(): BasePresenter<HomeView>(){

    @Inject
    lateinit var mHomeService : HomeService

    fun testPresenter(){
        mView.test()
    }

    fun testPresenterWithService(){
//        mHomeService.testService()
//        mView.test()
    }

    fun HomePageUnits(){
        mHomeService.HomePageUnits().execute(object : BaseObserver<HomePageUnitsBean>(){
            override fun onNext(t: HomePageUnitsBean) {
                super.onNext(t)
                mView.onHomePageUnitsResult("onHomePageUnitsResult success")
            }
        },lifecycleProvider)

    }
}
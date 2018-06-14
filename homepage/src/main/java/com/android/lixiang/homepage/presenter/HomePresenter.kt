package com.android.lixiang.homepage.presenter

import com.android.lixiang.base.ext.execute
import com.android.lixiang.base.presenter.BasePresenter
import com.android.lixiang.base.rx.BaseObserver
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
        println("in")
//        mHomeService.testService()
//        mView.test()
    }

    fun HomePageUnits(){
        mHomeService.HomePageUnits().execute(object : BaseObserver<Boolean>(){
            override fun onNext(t: Boolean) {
                super.onNext(t)
                mView.onHomePageUnitsResult("onHomePageUnitsResult success")
            }
        },lifecycleProvider)
    }
}
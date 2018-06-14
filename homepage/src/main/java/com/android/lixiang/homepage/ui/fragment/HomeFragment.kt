package com.android.lixiang.homepage.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.lixiang.base.ui.fragment.BaseMvpFragment

import com.android.lixiang.homepage.R
import com.android.lixiang.homepage.presenter.HomePresenter
import com.android.lixiang.homepage.presenter.injection.component.DaggerHomeComponent
import com.android.lixiang.homepage.presenter.injection.module.HomeModule
import com.android.lixiang.homepage.presenter.view.HomeView
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : BaseMvpFragment<HomePresenter>(), HomeView {
    override fun injectComponent() {
        DaggerHomeComponent.builder().fragmentComponent(fragmentComponent)
                .homeModule(HomeModule())
                .build().inject(this)
    }

    override fun onHomePageUnitsResult(res: String) {

    }

    override fun test() {

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        btn.setOnClickListener {
            mPresenter.mView = this
            mPresenter.HomePageUnits()
        }
    }
}

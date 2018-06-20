package com.android.lixiang.classify.ui.activity

import android.graphics.Color
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.design.widget.AppBarLayout
import com.android.lixiang.base.utils.view.AppBarStateChangeListener
import com.android.lixiang.base.utils.view.StatusBarUtil
import com.android.lixiang.classify.R
import kotlinx.android.synthetic.main.activity_optics.*


class OpticsActivity : AppCompatActivity() {
    var mActivity: OpticsActivity? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_optics)
        mActivity = this
        StatusBarUtil.setTranslucentForImageViewInFragment(this, 0, null)

        appbar.addOnOffsetChangedListener(object : AppBarStateChangeListener() {
            @RequiresApi(Build.VERSION_CODES.M)
            override fun onStateChanged(appBarLayout: AppBarLayout, state: State) {
                when (state) {
                    State.EXPANDED -> {
                        mToolbar.title = ""
                        StatusBarUtil.setTranslucentForImageViewInFragment(mActivity, 0, null)
                    }
                    State.COLLAPSED -> {
                        StatusBarUtil.setColor(mActivity, Color.parseColor("#A58E63"), 0)
                    }
                    else -> {
                        mToolbar.title = ""
                        StatusBarUtil.setTranslucentForImageViewInFragment(mActivity, 0, null)
                    }
                }
            }
        })

        mToolbar.title = "光学1级"
        setSupportActionBar(mToolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}

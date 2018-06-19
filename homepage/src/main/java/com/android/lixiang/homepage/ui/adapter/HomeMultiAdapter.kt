package com.android.lixiang.homepage.ui.adapter

import com.android.lixiang.homepage.R
import com.android.lixiang.homepage.presenter.data.HomeMultiItemEntity
import com.android.lixiang.homepage.presenter.data.bean.HomeEntity
import com.android.lixiang.homepage.presenter.data.entity.BannerEntity
import com.android.lixiang.homepage.presenter.data.entity.EveryDayPicEntity
import com.android.lixiang.homepage.presenter.data.entity.TheThreeEntity
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.orhanobut.logger.Logger
import com.youth.banner.Banner

import java.util.ArrayList

class HomeMultiAdapter
/**
 * Same as QuickAdapter#QuickAdapter(Context,int) but with
 * some initialization data.
 *
 * @param data A new list is created out of this one to avoid mutable list
 */
(data: List<HomeMultiItemEntity>) : BaseMultiItemQuickAdapter<HomeMultiItemEntity, BaseViewHolder>(data) {
    init {
        addItemType(0, R.layout.banner_layout)
        addItemType(1, R.layout.every_day_pic_layout)
        addItemType(2, R.layout.the_three_layout)

    }

    override fun convert(helper: BaseViewHolder, item: HomeMultiItemEntity) {

        when (item.itemType) {
            0 -> {
                val bannerEntity: BannerEntity = (item.getField("BANNER") as ArrayList<*>)[0] as BannerEntity
//                helper.setText(R.id.etv, bannerEntity.imageUrl)

            }
            1 -> {
                val everyDayPicEntity: EveryDayPicEntity = (item.getField("EVERY_DAY_PIC") as ArrayList<*>)[0] as EveryDayPicEntity
                helper.setText(R.id.etv, everyDayPicEntity.picContentName)
            }
            2 -> {
                val theThreeEntity: TheThreeEntity = (item.getField("THE_THREE") as ArrayList<*>)[0] as TheThreeEntity
                helper.setText(R.id.ttv, theThreeEntity.imageUrl);
            }
        }
    }
}

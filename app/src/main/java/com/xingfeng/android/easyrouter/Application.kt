package com.xingfeng.android.easyrouter

import android.app.Application
import android.util.Log
import com.xingfeng.android.api.EasyRouter
import com.xingfeng.android.api.OtherModuleUrlCollectorImpl

/**
 * @Author: 王立
 * @Date: 2019/3/29 17:55
 * @Desc:
 */
class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Log.e("doujinyu12345", "doujihaiyu12345")
        EasyRouter.getInstance().init("easyrouter", "demo")
        EasyRouter.getInstance().addModule(OtherModuleUrlCollectorImpl())
    }
}
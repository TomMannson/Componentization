package com.tommannson.apps.paymenow.framework


import com.tommannson.apps.paymenow.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class App : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.factory().create(this);
    }

    override fun onCreate() {
        super.onCreate()
    }

}

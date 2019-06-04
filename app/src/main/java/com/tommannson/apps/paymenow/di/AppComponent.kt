package com.tommannson.apps.paymenow.di

import com.tommannson.apps.paymenow.framework.App
import com.tommannson.apps.paymenow.screens.MainActivity
import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.ContributesAndroidInjector

@Component(modules = [AppModule::class, FragmentBindingModule::class, VMModule::class, VMBindingModule::class, AndroidInjectionModule::class, ScreensInjectorModule::class])
interface AppComponent : AndroidInjector<App> {

    @Component.Factory
    interface Factory : AndroidInjector.Factory<App> {

    }
}

@Module
class AppModule() {
    @Provides
    fun provideName() = "Test"
}

@Module
interface ScreensInjectorModule {

    @ContributesAndroidInjector
    fun main(): MainActivity

}
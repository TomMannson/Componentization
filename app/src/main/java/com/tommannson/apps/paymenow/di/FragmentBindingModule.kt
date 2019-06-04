package com.tommannson.apps.paymenow.di


import com.tommannson.apps.paymenow.screens.home.HomeScreenFragment
import com.tommannson.apps.paymenow.screens.myPayments.MyPaymentsFragment
import com.tommannson.apps.paymenow.screens.myPayments.create.CreatePaymentFragment
import com.tommannson.apps.paymenow.screens.upcoming.UpcomingPaymentsFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBindingModule {

    @ContributesAndroidInjector
    abstract fun homeFragment(): HomeScreenFragment

    @ContributesAndroidInjector
    abstract fun upcomingFragment(): UpcomingPaymentsFragment

    @ContributesAndroidInjector
    abstract fun myFragment(): MyPaymentsFragment

    @ContributesAndroidInjector
    abstract fun createPaymentFragment(): CreatePaymentFragment
}

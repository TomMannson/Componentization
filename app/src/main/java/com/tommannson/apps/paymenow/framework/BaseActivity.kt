package com.tommannson.apps.mvitodo.framework

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

abstract class BaseActivity : DaggerAppCompatActivity() {

    @field:Inject
    lateinit var vmFactory: VMFactory


    protected inline fun <reified T : ViewModel> BaseActivity.viewmodel(): T {
        return ViewModelProviders.of(this, vmFactory).get(T::class.java)
    }

}

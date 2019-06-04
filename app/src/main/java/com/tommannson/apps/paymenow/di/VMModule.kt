package com.tommannson.apps.paymenow.di

import com.tommannson.apps.mvitodo.mvi.contracts.TodoListContract
import com.tommannson.apps.paymenow.screens.MainViewModel
import dagger.Binds
import dagger.Module

@Module
abstract class VMModule {

    @Binds
    abstract fun mainViewModel(vm: MainViewModel): TodoListContract.ViewModel


}

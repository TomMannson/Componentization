package com.tommannson.apps.paymenow.di

import androidx.lifecycle.ViewModel
import com.tommannson.apps.mvitodo.mvi.contracts.TodoListContract
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class VMBindingModule {

    @Binds
    @IntoMap
    @ViewModelKey(TodoListContract.ViewModel::class)
    abstract fun todolistBinding(vm: TodoListContract.ViewModel): ViewModel

}

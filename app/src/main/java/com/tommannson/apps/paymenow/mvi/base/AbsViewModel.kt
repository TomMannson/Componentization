package com.tommannson.apps.paymenow.mvi.base

import androidx.lifecycle.ViewModel
import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableObserver

abstract class AbsViewModel : ViewModel() {

    val compositeDisposable = CompositeDisposable()

    fun <T> Observable<T>.run(observer: DisposableObserver<T>) {
        compositeDisposable.add(this.subscribeWith(observer))
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }
}

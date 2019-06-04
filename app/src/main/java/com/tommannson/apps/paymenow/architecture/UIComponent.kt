package com.tommannson.apps.mvitodo.architecture

import io.reactivex.Observable

abstract class UIComponent<T> {

    val children = mutableListOf<UIComponent<*>>()

    fun onCreated() {
        for (child in children) {
            child.onCreated()
        }
    }

    abstract fun getContainerId(): Int
    abstract fun getUserInteractionEvents(): Observable<T>

}

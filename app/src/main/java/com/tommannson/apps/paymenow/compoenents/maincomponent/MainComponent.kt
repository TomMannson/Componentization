package com.tommannson.apps.paymenow.compoenents.maincomponent

import android.view.ViewGroup
import com.tommannson.apps.mvitodo.architecture.UIComponent
import io.reactivex.Observable


class MainComponent(parent: ViewGroup, attach: Boolean = true) : UIComponent<Any>() {
    override fun getContainerId(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getUserInteractionEvents(): Observable<Any> {
        return Observable.just(Any())
    }

    val uiView = MainView(parent, true)
}

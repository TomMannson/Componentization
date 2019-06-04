package com.tommannson.apps.paymenow.compoenents.appbar

import android.view.ViewGroup
import com.tommannson.apps.mvitodo.architecture.UIComponent
import com.tommannson.apps.paymenow.architecture.EventBusFactory
import com.tommannson.apps.paymenow.architecture.eventTypes.UserInteractionEvent
import io.reactivex.Observable

class ToolbarComponent(container: ViewGroup, private val bus: EventBusFactory) : UIComponent<UserInteractionEvent>() {

    val uiView: ToolbarView = ToolbarView(container, bus)

    override fun getContainerId() = uiView.containerId

    override fun getUserInteractionEvents(): Observable<UserInteractionEvent> {
        return bus.getSafeManagedObservable(UserInteractionEvent::class.java)
    }
}

package com.tommannson.apps.paymenow.compoenents.navigation

import android.view.ViewGroup
import com.tommannson.apps.mvitodo.architecture.UIComponent
import com.tommannson.apps.paymenow.architecture.EventBusFactory
import com.tommannson.apps.paymenow.architecture.eventTypes.UserInteractionEvent
import io.reactivex.Observable

class NavigationComponent(container: ViewGroup, bus: EventBusFactory) : UIComponent<UserInteractionEvent>() {

    val view = NavigationView(container, bus)

    override fun getContainerId() = 0;

    override fun getUserInteractionEvents(): Observable<UserInteractionEvent> {
        return Observable.empty();
    }
}

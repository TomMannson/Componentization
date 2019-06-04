package com.tommannson.apps.paymenow.architecture.eventTypes

import com.tommannson.apps.paymenow.architecture.ComponentEvent

sealed class UserInteractionEvent: ComponentEvent(){

    object BackInteraction: UserInteractionEvent()

}
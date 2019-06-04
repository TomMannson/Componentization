package com.tommannson.apps.paymenow.compoenents.navigation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.tommannson.apps.paymenow.R
import com.tommannson.apps.paymenow.architecture.EventBusFactory
import com.tommannson.apps.paymenow.architecture.UIView
import com.tommannson.apps.paymenow.architecture.eventTypes.UserInteractionEvent

class NavigationView(container: ViewGroup, bus: EventBusFactory) : UIView<UserInteractionEvent>(container) {

    val navigationView: BottomNavigationView =
        LayoutInflater.from(container.context).inflate(R.layout.component_navigation, container, true)
            .findViewById(R.id.bottom_navigation)

    init {
        if (container.context is AppCompatActivity) {
            val activity = container.context as AppCompatActivity
            val navController = activity.findNavController(R.id.nav)
            navigationView.setupWithNavController(navController)
        }
    }

    override fun show() {
    }

    override fun hide() {
    }

    override val containerId: Int = 0;

}

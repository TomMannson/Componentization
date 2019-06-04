package com.tommannson.apps.paymenow.compoenents.appbar

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.tommannson.apps.paymenow.architecture.UIView
import com.tommannson.apps.paymenow.architecture.eventTypes.UserInteractionEvent
import com.tommannson.apps.paymenow.R
import com.tommannson.apps.paymenow.architecture.EventBusFactory

class ToolbarView(container: ViewGroup, bus: EventBusFactory) : UIView<UserInteractionEvent>(container) {

    val toolbar: Toolbar = LayoutInflater.from(container.context).inflate(R.layout.component_toolbar, container, true)
        .findViewById(R.id.appToolbar)

    init {
        toolbar.title = "title"
        if (container.context is AppCompatActivity) {
            val activity = container.context as AppCompatActivity
            activity.setSupportActionBar(activity.findViewById(TOOLBAR_ID));
            val navController = activity.findNavController(R.id.nav)
            val appBarConfiguration = AppBarConfiguration(setOf(R.id.home, R.id.myPayments, R.id.upcoming))
            activity.setupActionBarWithNavController(navController, appBarConfiguration)
            toolbar.setNavigationOnClickListener {
                navController.navigateUp()
            }
        }
    }

    override fun show() {
    }

    override fun hide() {
    }

    override val containerId: Int = 0;

    companion object {
        val TOOLBAR_ID = R.id.appToolbar
    }
}

package com.tommannson.apps.paymenow.screens

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tommannson.apps.paymenow.R
import com.tommannson.apps.paymenow.architecture.EventBusFactory
import com.tommannson.apps.paymenow.architecture.HostComponent
import com.tommannson.apps.paymenow.compoenents.appbar.ToolbarComponent
import com.tommannson.apps.paymenow.compoenents.navigation.NavigationComponent

class MainActivity : AppCompatActivity() {

    val host = HostComponent.create();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        host.add(ToolbarComponent(findViewById(R.id.screenRoot), EventBusFactory.get(this)))
            .add(NavigationComponent(findViewById(R.id.screenRoot), EventBusFactory.get(this)))
            .build()

    }
}

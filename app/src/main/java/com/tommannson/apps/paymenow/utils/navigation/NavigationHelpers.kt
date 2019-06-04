package com.tommannson.apps.mvitodo.utils.navigation

import android.view.View
import androidx.annotation.IdRes
import androidx.navigation.Navigation

fun View.setupOnClickListenerWithAction(@IdRes resId: Int){
    this.setOnClickListener(Navigation.createNavigateOnClickListener(resId))
}
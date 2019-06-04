package com.tommannson.apps.paymenow.screens.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tommannson.apps.mvitodo.framework.BaseFragment
import com.tommannson.apps.paymenow.R

class HomeScreenFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

}

package com.tommannson.apps.paymenow.screens.myPayments.create

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tommannson.apps.mvitodo.framework.BaseFragment
import com.tommannson.apps.paymenow.R

class CreatePaymentFragment : BaseFragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return layoutInflater.inflate(R.layout.fragment_create_payment, container, false)
    }

}

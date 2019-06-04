package com.tommannson.apps.paymenow.screens.myPayments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tommannson.apps.mvitodo.framework.BaseFragment
import com.tommannson.apps.mvitodo.utils.navigation.setupOnClickListenerWithAction
import com.tommannson.apps.paymenow.R

class MyPaymentsFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_mypayment, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<View>(R.id.createPaymentAction)
            .setupOnClickListenerWithAction(R.id.action_myPayments_to_createPaymentFragment)
    }

}

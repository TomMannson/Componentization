package com.tommannson.apps.paymenow.compoenents

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import com.tommannson.apps.paymenow.compoenents.maincomponent.MainComponent


class TestComponentView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    init {
        MainComponent(this)
    }

}

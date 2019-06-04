package com.tommannson.apps.paymenow.architecture

import com.tommannson.apps.mvitodo.architecture.UIComponent

class HostComponent {

    val children = arrayListOf<UIComponent<*>>()

    companion object {
        fun create() = HostComponent()
    }

    fun add(component: UIComponent<*>) = apply {
        children.add(component)
    }

    fun build() {
        for (child in children) {
            child.onCreated()
        }
    }

}

package com.example.user.kotlinhelper

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class FragmentDemoOne : android.support.v4.app.Fragment() {
    private var txt: android.widget.TextView? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.activity_main, container, false)
//        this.txt = view.findViewById<View>(R.id.txt) as TextView

        val name = arguments!!.getString("name")
        view.txt!!.text = name
        return view

    }
}

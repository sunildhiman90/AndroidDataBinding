package com.codingambitions.androiddatabinding

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods

@BindingAdapter("android:text")
fun setText(view: TextView, textString: String){
    view.text = "Coding Ambitions Learning $textString"
}


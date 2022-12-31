package com.codingambitions.androiddatabinding

import android.view.View
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.BindingAdapter
import androidx.databinding.ObservableBoolean
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : BaseObservable() {
    //val isButtonClicked: MutableLiveData<Boolean> = MutableLiveData(false)
    var rememberMe: Boolean = false
       @Bindable
    get() = field
    set(value) {
        if(field!=value) {
            field = value
            println("setting=${field}")
            notifyPropertyChanged(BR.rememberMe)
        }
    }

    /*fun submitClicked(view: View) {
        isButtonClicked.value = !isButtonClicked.value!!
    }*/

    /*@Bindable
    fun getRememberMe() : Boolean? {
        return rememberMeVal
    }

    fun setRememberMe(value: Boolean) {
        if (rememberMeVal != value) {
            rememberMeVal = value
            println("setting=${value}")
            notifyPropertyChanged(BR.rememberMe)
        }

    }*/


}
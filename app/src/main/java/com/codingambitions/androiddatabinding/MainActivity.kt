package com.codingambitions.androiddatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods
import androidx.databinding.DataBindingUtil
import com.codingambitions.androiddatabinding.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val root = binding.root
        binding.user = User("Data Binding",1)
        viewModel = MainViewModel()
        binding.viewModel = viewModel
        setContentView(root)

        /*viewModel.isButtonClicked.observe(this) {
            Snackbar.make(
                findViewById(android.R.id.content),
                "Button click changed = $it",
                Snackbar.LENGTH_SHORT
            ).show()
        }*/

    }

}
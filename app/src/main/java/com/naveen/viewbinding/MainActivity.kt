package com.naveen.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.naveen.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var mainBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mainBinding.root
        setContentView(view)

        mainBinding.button.setOnClickListener {
            mainBinding.textViewResult.text = mainBinding.editTextName.text.toString()
        }
    }
}
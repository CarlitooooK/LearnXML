package com.example.learnxml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Sign_Up_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sing_up_activity)
        window.statusBarColor = resources.getColor(R.color.colorStatusBar)
    }
}


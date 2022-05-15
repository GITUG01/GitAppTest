package com.gitug01.gitapptest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("test", "first")
        Log.e("test", "second")
        Log.e("test", "third")
        Log.e("test", "fourth")
    }
}
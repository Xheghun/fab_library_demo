package com.xheghun.pointziapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.xheghun.demo_library.fab.FabLibrary

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        FabLibrary.Builder().setActivityParams(this, R.id.main_view).build()
    }
}
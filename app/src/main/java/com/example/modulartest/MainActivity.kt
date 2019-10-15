package com.example.modulartest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUI()
    }

    private fun setUI(){

        btn_login.setOnClickListener {
            val launchIntent = packageManager.getLaunchIntentForPackage("com.example.login")
            if (launchIntent != null) {
                startActivity(launchIntent)//null pointer check in case package name was not found
            }
        }
    }



}

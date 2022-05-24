package com.cookandroid.myapplication

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton


class MainActivity : Activity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "메인 액티비티 (수정)"
        val btnNewActivity = findViewById<View>(R.id.btnNewActivity) as Button
        btnNewActivity.setOnClickListener {
            val intent: Intent
            intent = if (btnNewActivity.isClickable == true) Intent(
                applicationContext,
                SecondActivity::class.java
            ) else Intent(
                applicationContext,
                ThirdActivity::class.java
            )
            startActivity(intent)
        }
    }
}
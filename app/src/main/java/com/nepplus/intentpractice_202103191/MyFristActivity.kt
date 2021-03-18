package com.nepplus.intentpractice_202103191

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_my_frist.*

class MyFristActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_frist)

        moveToBackButton.setOnClickListener {

            finish()

        }


    }
}
package com.nepplus.intentpractice_202103191

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       moveToFristButton.setOnClickListener {

           val myIntent = Intent(this, MyFristActivity::class.java)

           startActivity(myIntent)

       }
    }
}
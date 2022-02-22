package com.irfanarsya.daftarmenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        buttonMulai.setOnClickListener {
            val intent = Intent( this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}
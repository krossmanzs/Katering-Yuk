package com.krossmanzs.kateringyuk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        supportActionBar?.hide()

        val imgLogo: ImageView = findViewById(R.id.img_app_logo)
        imgLogo.alpha = 0f
        imgLogo.animate().setDuration(1500).alpha(1f).withEndAction() {
            Intent(this,MainActivity::class.java).also {
                startActivity(it)
                overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            }
        }
    }
}
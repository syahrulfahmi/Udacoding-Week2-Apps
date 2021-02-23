package com.sf.udcw2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_splash_screen.*


class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        setUpTimer()
        setUpView()
    }

    @SuppressLint("SetTextI18n")
    private fun setUpView() {
        val version = packageManager.getPackageInfo(packageName, 0).versionName
        textAppVersion.text = "v.$version"
    }

    private fun setUpTimer() {
        Handler(Looper.getMainLooper()).postDelayed({
            Intent(this, LoginActivity::class.java).apply {
                startActivity(this)
                finish()
            }
        }, 1200)
    }
}
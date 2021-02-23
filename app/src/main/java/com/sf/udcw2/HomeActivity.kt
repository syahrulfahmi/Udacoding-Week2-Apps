package com.sf.udcw2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        setUpListener()
    }

    private fun setUpListener() {
        Toast.makeText(this, getString(R.string.app_login_success), Toast.LENGTH_SHORT).show()
        cdCalculate.setOnClickListener {
            Intent(this, PhysicCalculateActivity::class.java).apply {
                startActivity(this)
            }
        }

        cdConvertion.setOnClickListener {
            Intent(this, DistanceConvertionActivity::class.java).apply {
                startActivity(this)
            }
        }
    }
}
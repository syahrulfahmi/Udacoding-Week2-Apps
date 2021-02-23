package com.sf.udcw2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sf.udcw2.adapter.SectionsPagerAdapter
import kotlinx.android.synthetic.main.activity_physic_calculate.*

class PhysicCalculateActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_physic_calculate)

        setUpView()
    }

    private fun setUpView() {
        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        viewPager.adapter = sectionsPagerAdapter
        tabs.setupWithViewPager(viewPager)
    }
}
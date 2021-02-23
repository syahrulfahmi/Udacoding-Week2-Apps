package com.sf.udcw2.adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.sf.udcw2.R
import com.sf.udcw2.ui.fragment.FragmentHitungLuas
import com.sf.udcw2.ui.fragment.FragmentHitungVolume

private val TAB_TITLES = arrayOf(
    R.string.tab_text_1,
    R.string.tab_text_2
)
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> FragmentHitungLuas.newInstance()
            1 -> FragmentHitungVolume.newInstance()
            else -> FragmentHitungVolume.newInstance()
        }
    }

    override fun getPageTitle(position: Int): CharSequence {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        return 2
    }
}
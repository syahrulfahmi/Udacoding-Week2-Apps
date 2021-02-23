package com.sf.udcw2.ui.fragment

import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.SuperscriptSpan
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.transition.AutoTransition
import androidx.transition.TransitionManager
import com.sf.udcw2.R
import kotlinx.android.synthetic.main.fragment_physic_calculate_luas.*

class FragmentHitungLuas : Fragment(R.layout.fragment_physic_calculate_luas) {
    companion object {
        fun newInstance(): FragmentHitungLuas {
            return FragmentHitungLuas()
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpListener()
    }

    private fun setUpListener() {
        edInputPanjang.clearFocus()
        edInputLebar.clearFocus()
        btnCalculate.setOnClickListener {
            if (checkValidation()) {
                TransitionManager.beginDelayedTransition(containerLuas, AutoTransition())
                val calculateResult = calculateResult(
                    edInputPanjang.text.toString().toInt(),
                    edInputLebar.text.toString().toInt()
                )
                val string = SpannableString("$calculateResult m2")
                string.setSpan(
                    SuperscriptSpan(),
                    calculateResult.toString().length + 2,
                    string.length,
                    Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
                )
                textResult.setText(string, TextView.BufferType.SPANNABLE)
            }
        }
        btnReset.setOnClickListener {
            edInputPanjang.setText("")
            edInputPanjang.clearFocus()
            edInputLebar.setText("")
            edInputLebar.clearFocus()
            textResult.text = getString(R.string.app_result_hint)
        }
    }

    private fun checkValidation(): Boolean {
        if (edInputPanjang.text.isNullOrEmpty()) {
            textInputPanjang.error = getString(R.string.app_length_should_be_filled)
            return false
        } else {
            textInputPanjang.isErrorEnabled = false
        }
        if (edInputLebar.text.isNullOrEmpty()) {
            textInputLebar.error = getString(R.string.app_width_should_be_filled)
            return false
        } else {
            textInputLebar.isErrorEnabled = false
        }
        return true
    }

    private fun calculateResult(panjang: Int, lebar: Int): Int =
        panjang * lebar
}
package com.sf.udcw2

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import com.sf.udcw2.adapter.MaterialSpinnerAdapter
import com.sf.udcw2.utils.Converter
import kotlinx.android.synthetic.main.activity_distance_convertion.*


class DistanceConvertionActivity : AppCompatActivity() {

    private val arr: Array<String> by lazy {
        resources.getStringArray(R.array.array_distance)
    }
    private var fromDistance = ""
    private var toDistance = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_distance_convertion)

        setUpView()
        setUpListener()
    }

    private fun setUpView() {
        val adapter = MaterialSpinnerAdapter(this, R.layout.support_simple_spinner_dropdown_item, arr)
        val adapterV2 = MaterialSpinnerAdapter(
            this,
            R.layout.support_simple_spinner_dropdown_item,
            arr
        )
        spinnerFirstDistance.setAdapter(adapter)
        spinnerLastDistance.setAdapter(adapterV2)
    }

    @SuppressLint("SetTextI18n")
    private fun setUpListener() {
        spinnerFirstDistance.setOnItemClickListener { _, _, i, _ ->
            hideKeyboard(this)
            textInputConvert.isErrorEnabled = false
            fromDistance = arr[i]
            if (!edInputNumber.text.isNullOrEmpty()) {
                textResult.text = "${
                    Converter.convert(
                        edInputNumber.text.toString(),
                        fromDistance,
                        toDistance
                    )
                } $toDistance"
            } else {
                textInputConvert.error = getString(R.string.app_number_should_be_filled)
            }
        }

        spinnerLastDistance.setOnItemClickListener { _, _, i, _ ->
            hideKeyboard(this)
            toDistance = arr[i]
            textInputConvert.isErrorEnabled = false
            if (!edInputNumber.text.isNullOrEmpty()) {
                textResult.text = "${
                    Converter.convert(
                        edInputNumber.text.toString(),
                        fromDistance,
                        toDistance
                    )
                } $toDistance"
            } else {
                textInputConvert.error = getString(R.string.app_number_should_be_filled)
            }
        }
    }

    private fun hideKeyboard(activity: Activity) {
        val imm: InputMethodManager =
            activity.getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        var view: View? = activity.currentFocus
        if (view == null) {
            view = View(activity)
        }
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}
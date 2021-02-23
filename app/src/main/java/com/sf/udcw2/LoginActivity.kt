package com.sf.udcw2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    companion object {
        const val DEFAULT_USERNAME = "udacodingid"
        const val DEFAULT_PASS = "udacodingJaya2021"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        setUpListener()
    }

    private fun setUpListener() {
        edPassword.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            override fun afterTextChanged(p0: Editable?) {}
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                textInputPassword.isErrorEnabled = false
            }
        })
        btnLogin.setOnClickListener {
            if (checkValidity()) {
                progressLoading.visibility = View.VISIBLE
                btnLogin.visibility = View.INVISIBLE
                Handler(Looper.getMainLooper()).postDelayed({
                    Intent(this, HomeActivity::class.java).apply {
                        startActivity(this)
                        finish()
                    }
                }, 1000)
            }
        }
    }

    private fun checkValidity(): Boolean {
        if (edUserName.text.isNullOrEmpty()) {
            textInputUserName.error = getString(R.string.app_user_name_should_be_filled)
            return false
        } else {
            textInputPassword.isErrorEnabled = false
        }
        if (edPassword.text.isNullOrEmpty()) {
            textInputPassword.error = getString(R.string.app_password_should_be_filled)
            return false
        } else {
            textInputPassword.isErrorEnabled = false
        }
        if (edPassword.text.toString().length < 6) {
            textInputPassword.error = getString(R.string.app_password_cannot_less_than_some_digits)
            return false
        } else {
            textInputPassword.isErrorEnabled = false
        }

        if (edUserName.text.toString() != DEFAULT_USERNAME || edPassword.text.toString() != DEFAULT_PASS) {
            Snackbar.make(
                containerLogin,
                getString(R.string.app_wrong_login),
                Snackbar.LENGTH_SHORT
            ).show()
            return false
        }
        return true
    }
}
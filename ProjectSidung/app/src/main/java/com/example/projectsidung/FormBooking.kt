package com.example.projectsidung

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_form_booking.*

class FormBooking : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_booking)

        val context = this

        btnBackBooking.setOnClickListener {
            var intent = Intent(context,Booking::class.java)
            startActivity(intent)
            finish()
        }
    }
}

package com.example.projectsidung

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_booking.*
import kotlinx.android.synthetic.main.activity_form_booking.*
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_home.btnBooking
import kotlinx.android.synthetic.main.activity_home.btnHome
import kotlinx.android.synthetic.main.activity_home.btnProfil

class Booking : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking)

        val context = this

        btnHome1.setOnClickListener {
            var intent = Intent(context,Home::class.java)
            startActivity(intent)
            finish()
        }

        btnBooking1.setOnClickListener {
            var intent = Intent(context,Booking::class.java)
            startActivity(intent)
            finish()
        }

        btnProfil1.setOnClickListener {
            var intent = Intent(context,Profil::class.java)
            startActivity(intent)
            finish()
        }

        btnPinjam.setOnClickListener {
            var intent = Intent(context,FormBooking::class.java)
            startActivity(intent)
            finish()
        }

    }
}

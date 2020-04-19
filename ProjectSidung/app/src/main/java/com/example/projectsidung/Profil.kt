package com.example.projectsidung

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_form_booking.*
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_profil.*

class Profil : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        val context = this

        btnLihatPengajuan.setOnClickListener {
            var intent = Intent(context,Riwayat::class.java)
            startActivity(intent)
            finish()
        }

        btnHome2.setOnClickListener {
            var intent = Intent(context,Home::class.java)
            startActivity(intent)
            finish()
        }

        btnBooking2.setOnClickListener {
            var intent = Intent(context,Booking::class.java)
            startActivity(intent)
            finish()
        }

        btnProfil2.setOnClickListener {
            var intent = Intent(context,Profil::class.java)
            startActivity(intent)
            finish()
        }

        btnLogout.setOnClickListener {
            val sharedPreferences = getSharedPreferences("CEKLOGIN", Context.MODE_PRIVATE)
            val editor = sharedPreferences.edit()

            editor.putString("STATUS", "0")
            editor.apply()

            startActivity(Intent(this@Profil, MainActivity::class.java))
            finish()
        }

    }
}

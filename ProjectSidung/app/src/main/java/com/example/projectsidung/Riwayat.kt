package com.example.projectsidung

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_form_booking.*
import kotlinx.android.synthetic.main.activity_riwayat.*

class Riwayat : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_riwayat)

        val context = this

        btnBackProfil.setOnClickListener {
            var intent = Intent(context,Profil::class.java)
            startActivity(intent)
            finish()
        }
    }
}

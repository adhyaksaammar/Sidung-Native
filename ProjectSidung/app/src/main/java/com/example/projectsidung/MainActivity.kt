package com.example.projectsidung

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val context = this

        moveLogin.setOnClickListener {
            var intent = Intent(context,Login::class.java)
            startActivity(intent)
            finish()
        }

        moveRegister.setOnClickListener {
            var intent = Intent(context,Register::class.java)
            startActivity(intent)
            finish()
        }

        moveTatacara.setOnClickListener {
            var intent = Intent(context,TataCara::class.java)
            startActivity(intent)
            finish()
        }
    }
}

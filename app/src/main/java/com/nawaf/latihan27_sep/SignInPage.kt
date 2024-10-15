package com.nawaf.latihan27_sep

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignInPage : AppCompatActivity() {

    private lateinit var gas : TextView
    private lateinit var gas2 : Button
    private lateinit var gas3 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_in_page)

        gas = findViewById(R.id.signup)
        gas.setOnClickListener(){
            val a = Intent(this, SIgnUpPage::class.java)
            startActivity(a)
        }

        gas2 = findViewById(R.id.e)
        gas2.setOnClickListener(){
            val a = Intent(this, PageListDoctor::class.java)
            startActivity(a)
        }

        gas2 = findViewById(R.id.e)
        gas2.setOnClickListener(){
            val a = Intent(this, PageListDoctor::class.java)
            startActivity(a)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
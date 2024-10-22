package com.nawaf.latihan27_sep

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailGambar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_gambar)
        val ImagesResId = intent.getIntExtra("data", 0)
        val title = intent.getStringExtra("data1")
        val title2 = intent.getStringExtra("data2")
        val title3 = intent.getStringExtra("data3")
        val title4 = intent.getStringExtra("data4")

        val imageView = findViewById<ImageView>(R.id.aa)
        val a = findViewById<TextView>(R.id.bb)
        val b = findViewById<TextView>(R.id.cc)
        val c = findViewById<TextView>(R.id.dd)
        val d = findViewById<TextView>(R.id.ff)
        imageView.setImageResource(ImagesResId)
        a.setText(title)
        b.setText(title2)
        c.setText(title3)
        d.setText(title4)
    }
}
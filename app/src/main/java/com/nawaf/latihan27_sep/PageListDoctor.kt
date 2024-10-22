package com.nawaf.latihan27_sep

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.nawaf.latihan27_sep.adapter.adapterdokter
import com.nawaf.latihan27_sep.adapter.adaptericon

class PageListDoctor : AppCompatActivity() {


    private val imagelist1 = arrayOf(

        R.drawable.icon1,
        R.drawable.icon2,
        R.drawable.icon3
    )

    private val imagedoctor = arrayOf(
        R.drawable.dokter1,
        R.drawable.dokter2,
        R.drawable.dokter3,
        R.drawable.dokter4
    )

    private val namadoc = arrayOf("Nawaf", "Akbar", "Arya", "Vega")
    private val deskripsion = arrayOf("Dokter Umum", "Dokter Hewan", "Dokter Saraf", "Dokter bedah")
    private val reviewnya = arrayOf("(123 review)", "(43 review)", "(100 review)", "(250 review)")
    private val ratingnya = arrayOf("5.0", "4.5", "4.4", "3.2")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_list_doctor)

        val gridView = findViewById<GridView>(R.id.rv_icon)
        val adapter = adaptericon(this, imagelist1)
        gridView.adapter = adapter

        val dokternya = findViewById<GridView>(R.id.rv_doctor)
        val adapternya = adapterdokter(this, imagedoctor, namadoc, deskripsion, reviewnya, ratingnya)
        dokternya.adapter = adapternya

        dokternya.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, DetailGambar::class.java)
            intent.putExtra("data", imagedoctor[position])
            intent.putExtra("data1", namadoc[position])
            intent.putExtra("data2", deskripsion[position])
            intent.putExtra("data3", reviewnya[position])
            intent.putExtra("data4", ratingnya[position])
            startActivity(intent)
        }



    }
}
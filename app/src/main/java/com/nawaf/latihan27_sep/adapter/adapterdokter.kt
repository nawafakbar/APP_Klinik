package com.nawaf.latihan27_sep.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.nawaf.latihan27_sep.R

class adapterdokter (private val context: Context, private val images: Array<Int>,
                     private val nama: Array<String>, private val des: Array<String>,
                     private val review: Array<String>, private val rating: Array<String>
): BaseAdapter() {
    override fun getCount(): Int {
        return images.size
        return nama.size
        return des.size
        return review.size
        return rating.size
    }

    override fun getItem(position: Int): Any {
        return images[position]
        return nama[position]
        return des[position]
        return review[position]
        return rating[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View
        val imageView: ImageView
        val namaa : TextView
        val deskripsi : TextView
        val revieww : TextView
        val ratingg : TextView

        if (convertView == null){
            view = LayoutInflater.from(context).inflate(R.layout.item_doctor, parent, false)
            imageView = view.findViewById(R.id.a)
            namaa = view.findViewById(R.id.b)
            deskripsi = view.findViewById(R.id.c)
            revieww = view.findViewById(R.id.d)
            ratingg = view.findViewById(R.id.f)
        } else{
            view = convertView
            imageView = view.findViewById(R.id.a)
            namaa = view.findViewById(R.id.b)
            deskripsi = view.findViewById(R.id.c)
            revieww = view.findViewById(R.id.d)
            ratingg = view.findViewById(R.id.f)
        }
        imageView.setImageResource(images[position])
        namaa.setText(nama[position])
        deskripsi.setText(des[position])
        revieww.setText(review[position])
        ratingg.setText(rating[position])
        return view
    }


}
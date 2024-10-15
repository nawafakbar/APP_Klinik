package com.nawaf.latihan27_sep.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import com.nawaf.latihan27_sep.R

class adaptericon(private val context: Context, private val images: Array<Int>): BaseAdapter() {
    override fun getCount(): Int {
        return images.size
    }

    override fun getItem(position: Int): Any {
        return images[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View
        val imageView: ImageView

        if (convertView == null){
            view = LayoutInflater.from(context).inflate(R.layout.item_menu, parent, false)
            imageView = view.findViewById(R.id.icon)
        } else{
            view = convertView
            imageView = view.findViewById(R.id.icon)
        }
        imageView.setImageResource(images[position])
        return view



    }
}
package com.alexblanco.cafeteria.adapterComida

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.alexblanco.cafeteria.Comida
import com.alexblanco.cafeteria.R
import com.bumptech.glide.Glide

class ComidaViewHolder(view: View):ViewHolder(view) {

    val name = view.findViewById<TextView>(R.id.nameComida)
    val price = view.findViewById<TextView>(R.id.priceComida)
    val photo = view.findViewById<ImageView>(R.id.photoComida)


    fun render(comidaModel: Comida){
        name.text = comidaModel.name
        price.text = comidaModel.price
        Glide.with(photo.context).load(comidaModel.photo).into(photo)
    }
}
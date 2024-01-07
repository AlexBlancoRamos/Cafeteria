package com.alexblanco.cafeteria.adapterBebida

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alexblanco.cafeteria.Bebida
import com.alexblanco.cafeteria.R

class BebidaAdapter(private val BebidaList:List<Bebida>) : RecyclerView.Adapter<BebidaViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BebidaViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return BebidaViewHolder(layoutInflater.inflate(R.layout.item_bebida, parent, false))
    }

    override fun getItemCount(): Int = BebidaList.size


    override fun onBindViewHolder(holder: BebidaViewHolder, position: Int) {
        val item = BebidaList[position]
        holder.render(item)
    }
}
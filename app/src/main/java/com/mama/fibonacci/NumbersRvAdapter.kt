package com.mama.fibonacci


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class NumbersRvAdapter (var fibonacci:List<Int>): RecyclerView.Adapter<NumbersViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.fibonacci_numbers,parent,false)
        return NumbersViewHolder(TextView)

    }


    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        holder.tvNumbers.text=data[position].toString()

    }
    override fun getItemCount(): Int {
        return fibonacci.size
    }

class NamesViewHolder(itemView:View):ViewHolder(itemView){
    var tvNumbers=itemView.findViewById<TextView>(R.id.tvNumbers)

}
}


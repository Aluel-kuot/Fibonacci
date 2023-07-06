package com.mama.fibonacci

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import java.math.BigInteger

class NumbersRvAdapter (var fibList:List<BigInteger>):RecyclerView.Adapter<fibViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): fibViewHolder {
        val itemView=
            LayoutInflater.from(parent.context).inflate(R.layout.fibonacci_numbers,parent,false)
 return fibViewHolder(itemView)

    }

    override fun getItemCount(): Int {
        return fibList.size
    }

    override fun onBindViewHolder(holder: fibViewHolder, position: Int) {
        var currentNumber=fibList.get(position).toString()
        holder.tvNumbers.text=currentNumber
    }

}
class fibViewHolder(var itemView: View):ViewHolder(itemView){
    var tvNumbers=itemView.findViewById<TextView>(R.id.tvNumbers)
}







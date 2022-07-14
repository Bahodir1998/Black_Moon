package com.example.blackmoon.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.blackmoon.databinding.HrItemBinding
import com.example.blackmoon.models.Symbol

class HorizontalAdapter(var list: List<Symbol>,var onItemClickListener: OnItemClickListener): RecyclerView.Adapter<HorizontalAdapter.Vh>() {

    inner class Vh(var hrItemBinding: HrItemBinding):RecyclerView.ViewHolder(hrItemBinding.root){

        fun onBind(symbol: Symbol){
            hrItemBinding.tv.setText(symbol.name)

            hrItemBinding.root.setOnClickListener {
                onItemClickListener.onItemClick(symbol)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(HrItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size

    interface OnItemClickListener{
        fun onItemClick(symbol: Symbol)
    }
}
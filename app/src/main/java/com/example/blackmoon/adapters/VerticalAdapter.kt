package com.example.blackmoon.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.blackmoon.databinding.VItemBinding

class VerticalAdapter(var list: List<com.example.blackmoon.database.Term>, val onMyItemClickListener: OnMyItemClickListener): RecyclerView.Adapter<VerticalAdapter.Vh>() {

    inner class Vh(var vItemBinding: VItemBinding): RecyclerView.ViewHolder(vItemBinding.root){

        fun onBind(term: com.example.blackmoon.database.Term){
            vItemBinding.tv.setText("# ${term.name}")
            vItemBinding.root.setOnClickListener {
                onMyItemClickListener.onMyItemClick(term)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(VItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size

    interface OnMyItemClickListener{
        fun onMyItemClick(term: com.example.blackmoon.database.Term)
    }
}
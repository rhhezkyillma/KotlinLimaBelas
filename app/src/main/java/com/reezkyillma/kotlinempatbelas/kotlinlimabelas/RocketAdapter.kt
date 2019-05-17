package com.reezkyillma.kotlinempatbelas.kotlinlimabelas

import android.content.Context
import android.support.v7.view.menu.MenuView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class RocketAdapter (private val context: Context, private val items: List<RocketAnimationItem>)
    :RecyclerView.Adapter<RocketAdapter.RocketViewHolder>(){
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RocketViewHolder {
        val view = LayoutInflater.from(p0.context).inflate(android.R.layout.simple_list_item_1,p0, false)
        return RocketViewHolder(view)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: RocketViewHolder, p1: Int) {
        holder.title.text = items[p1].title
        holder.setTitleOnClickListener(context, items)

    }


    class RocketViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        val title : TextView = itemView.findViewById(android.R.id.text1)
        fun setTitleOnClickListener(context: Context,
                                    items: List<RocketAnimationItem>){
            title.setOnClickListener {
                context.startActivity(items[adapterPosition].intent)
            }
        }
    }

}
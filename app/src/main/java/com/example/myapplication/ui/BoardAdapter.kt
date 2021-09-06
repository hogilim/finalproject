package com.example.myapplication.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class BoardAdapter(val context: Context, val items: ArrayList<BoardUnit>, val itemClick: (BoardUnit) -> Unit): RecyclerView.Adapter<BoardAdapter.Holder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.board_unit, parent, false)
        return Holder(view, itemClick)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(items[position], context)
    }
    inner class Holder(itemView: View?, itemClick: (BoardUnit) -> Unit): RecyclerView.ViewHolder(itemView!!){
        val dimage = itemView?.findViewById<ImageView>(R.id.image)
        val dname = itemView?.findViewById<TextView>(R.id.name)
        val dgender = itemView?.findViewById<TextView>(R.id.gender)
        val location = itemView?.findViewById<TextView>(R.id.location)
        val date = itemView?.findViewById<TextView>(R.id.date)

        fun bind(dog: BoardUnit, context: Context){
            if (dog.imgProfile != "") {
                val resourceId = context.resources.getIdentifier(dog.imgProfile, "drawable", context.packageName)
                dimage?.setImageResource(resourceId)
            } else {
                dimage?.setImageResource(R.mipmap.ic_launcher)
            }
            dname?.text = dog.name
            dgender?.text = dog.gender
            location?.text = " "+dog.location.gu+" "+dog.location.dong
            date?.text = dog.date.toString()

            itemView.setOnClickListener { itemClick(dog) }
        }
    }
}
package com.example.relojerialatamparte3.view.lobby.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.relojerialatamparte3.R

class CardAdapter (private val itemList:List<Item>):
    RecyclerView.Adapter<CardAdapter.ItemViewHolder>(){

    class ItemViewHolder(itemView: View, private val itemList: List<Item>) : RecyclerView.ViewHolder(itemView) {
        val itemImageView: ImageView = itemView.findViewById(R.id.itemImageView)
        val itemTitleView: TextView = itemView.findViewById(R.id.itemTitleView)
        val itemDescriptionView: TextView = itemView.findViewById(R.id.itemDescriptionView)

        init {
            itemView.setOnClickListener {
                val position = bindingAdapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val item = itemList[position]
                    val fragment = item.fragment
                    // Replace the current fragment with the new one
                    val fragmentManager = (itemView.context as AppCompatActivity).supportFragmentManager
                    fragmentManager.beginTransaction()
                        .replace(R.id.nav_host_Fragment, fragment)
                        .addToBackStack(null)
                        .commit()
                }
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_cards, parent, false)
        return ItemViewHolder(view, itemList)
    }
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = itemList[position]
        holder.itemImageView.setImageResource(item.imageResId)
        holder.itemTitleView.text = item.title
        holder.itemDescriptionView.text = item.description
    }
    override fun getItemCount(): Int {
        return itemList.size
    }
}
data class Item(val imageResId: Int, val title: String, val description: String, val fragment: Fragment) {
}
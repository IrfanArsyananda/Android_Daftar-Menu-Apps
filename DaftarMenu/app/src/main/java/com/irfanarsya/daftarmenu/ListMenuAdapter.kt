package com.irfanarsya.daftarmenu

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListMenuAdapter(val listMenu: ArrayList<Menu>) : RecyclerView.Adapter<ListMenuAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_menu, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val menu = listMenu[position]
        Glide.with(holder.itemView.context)
            .load(menu.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = menu.name
        holder.tvPrice.text = menu.price

        holder.itemView.setOnClickListener {
            //action klik
            val intent = Intent(holder.itemView.context, DetailActivity::class.java)
            intent.putExtra("namaMenu", menu.name)
            intent.putExtra("hargaMenu", menu.price)
            intent.putExtra("detailMenu", menu.detail)
            intent.putExtra("imgMenu", menu.url)

            holder.itemView.context.startActivity(intent)

        }

    }

    override fun getItemCount(): Int {
        return listMenu.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvPrice: TextView = itemView.findViewById(R.id.tv_item_price)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}
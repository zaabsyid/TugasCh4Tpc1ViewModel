package com.zahirar.tugasch4tpc1viewmodel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class BeritaAdapter(var listDataBerita: ArrayList<ListDataBerita>) : RecyclerView.Adapter<BeritaAdapter.ViewHolder>() {

    var onItemClick : ((ListDataBerita) -> Unit)? = null

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        var tvJudul = view.findViewById<TextView>(R.id.tv_judul_berita)
        var tvTgl = view.findViewById<TextView>(R.id.tv_tgl_berita)
        var tvJurnalis = view.findViewById<TextView>(R.id.tv_jurnalis)
        var tvIsi = view.findViewById<TextView>(R.id.tv_isi_berita)
        var imgBerita = view.findViewById<ImageView>(R.id.iv_berita)
        var cardViewBerita = view.findViewById<CardView>(R.id.cv_berita)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BeritaAdapter.ViewHolder {
        val v  = LayoutInflater.from(parent.context).inflate(R.layout.item_berita, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: BeritaAdapter.ViewHolder, position: Int) {
        holder.tvJudul.text = listDataBerita[position].judul
        holder.tvTgl.text = listDataBerita[position].tgl
        holder.tvJurnalis.text = listDataBerita[position].jurnalis
        holder.tvIsi.text = listDataBerita[position].isi
        holder.imgBerita.setImageResource(listDataBerita[position].gambar)
        holder.cardViewBerita.setOnClickListener{
            onItemClick?.invoke(listDataBerita[position])
        }
    }

    override fun getItemCount(): Int {
        return listDataBerita.size
    }

    fun setDataStudent(beritaDataList : ArrayList<ListDataBerita>){
        this.listDataBerita = beritaDataList
    }
}
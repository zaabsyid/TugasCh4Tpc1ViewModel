package com.zahirar.tugasch4tpc1viewmodel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var beritaViewModel : BeritaViewModel
    lateinit var beritaAdapter : BeritaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dataBerita()

        beritaViewModel = ViewModelProvider(this).get(BeritaViewModel::class.java)
        beritaViewModel.getBerita()
        beritaViewModel.beritaList.observe(this, Observer{
            beritaAdapter.setDataStudent(it as ArrayList<ListDataBerita>)
        })

        beritaAdapter.onItemClick = {
            val bundle = Bundle()
            bundle.putSerializable("dataBerita", it)

            val intent = Intent(this, DetailBeritaActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }

    fun dataBerita(){
        beritaAdapter = BeritaAdapter(ArrayList())
        var linearLayout = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rv_list_berita.layoutManager = linearLayout
        rv_list_berita.adapter = beritaAdapter
    }
}
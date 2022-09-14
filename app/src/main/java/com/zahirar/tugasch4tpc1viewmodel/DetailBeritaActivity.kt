package com.zahirar.tugasch4tpc1viewmodel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail_berita.*

class DetailBeritaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_berita)

        val getSerializableAlphabet = intent.getSerializableExtra("dataBerita") as ListDataBerita
//        val judul = getSerializableAlphabet.judul
//        val tgl = getSerializableAlphabet.tgl
//        val jurnalis = getSerializableAlphabet.jurnalis
//        val isi = getSerializableAlphabet.isi
//        val gambar = getSerializableAlphabet.gambar

        tv_judul_berita.text = getSerializableAlphabet.judul
        tv_tgl_berita.text = getSerializableAlphabet.tgl
        tv_jurnalis.text = getSerializableAlphabet.jurnalis
        tv_isi_berita.text = getSerializableAlphabet.isi
        iv_berita.setImageResource(getSerializableAlphabet.gambar)

        btn_back.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
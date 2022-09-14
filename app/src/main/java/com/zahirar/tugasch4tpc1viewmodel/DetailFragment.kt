package com.zahirar.tugasch4tpc1viewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_detail.*

class DetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val getSerializableAlphabet = arguments?.getSerializable("dataBerita") as ListDataBerita
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
            Navigation.findNavController(view).navigate(R.id.action_detailFragment_to_homeFragment)
        }
    }
}
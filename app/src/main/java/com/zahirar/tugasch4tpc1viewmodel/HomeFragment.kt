package com.zahirar.tugasch4tpc1viewmodel

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    lateinit var beritaViewModel : BeritaViewModel
    lateinit var beritaAdapter : BeritaAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dataBerita()

        beritaViewModel = ViewModelProvider(this).get(BeritaViewModel::class.java)
        beritaViewModel.getBerita()
        beritaViewModel.beritaList.observe(requireActivity()){
            beritaAdapter.setDataStudent(it as ArrayList<ListDataBerita>)
        }

        beritaAdapter.onItemClick = {
            beritaAdapter.onItemClick = {
                val sendData = Bundle()
                sendData.putSerializable("dataBerita", it)

                Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_detailFragment, sendData)
            }
        }
    }

    fun dataBerita(){
        beritaAdapter = BeritaAdapter(ArrayList())
        var linearLayout = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rv_list_berita.layoutManager = linearLayout
        rv_list_berita.adapter = beritaAdapter
    }
}
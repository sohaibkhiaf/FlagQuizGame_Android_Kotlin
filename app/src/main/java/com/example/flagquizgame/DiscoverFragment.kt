package com.example.flagquizgame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DiscoverFragment : Fragment() {

    private lateinit var rv : RecyclerView

    // initialization of shared preferences manager
    private lateinit var spm : SharedPreferencesManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_discover, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rv = view.findViewById<RecyclerView>(R.id.discoverFragment_rv_countries)

        spm = SharedPreferencesManager(requireContext())
        val countries = spm.getCountriesList()

        rv.layoutManager = LinearLayoutManager(requireContext())
        rv.adapter = CountriesRVAdapter(countries)

    }
}
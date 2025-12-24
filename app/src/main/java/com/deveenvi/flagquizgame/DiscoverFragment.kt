package com.deveenvi.flagquizgame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.LinearLayout
import androidx.core.widget.addTextChangedListener
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.deveenvi.flagquizgame.database.CountryDatabase
import kotlinx.coroutines.launch


class DiscoverFragment : Fragment() {

    private lateinit var rv : RecyclerView
    private lateinit var et : EditText
    private lateinit var ll : LinearLayout

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_discover, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rv = view.findViewById(R.id.discoverFragment_rv_countries)
        et = view.findViewById(R.id.discoverFragment_et_discoverNavBar)
        ll = view.findViewById(R.id.discoverFragment_ll_noResults)

        val db = CountryDatabase.getDatabase(requireContext())
        val countryDao = db.countryDao()

        lifecycleScope.launch {

            val countries = countryDao.getNextTenElements(1).toMutableList()

            rv.layoutManager = LinearLayoutManager(requireContext())
            rv.adapter = CountriesRVAdapter(countries, false, lifecycleScope)
            ll.visibility = View.GONE

            et.addTextChangedListener { editable ->
                val searchText = editable.toString()

                if (searchText.isEmpty()){
                    rv.adapter = CountriesRVAdapter(countries, false, lifecycleScope)
                    ll.visibility = View.GONE
                }else {
                    lifecycleScope.launch {
                        val countries = countryDao.searchByCountryName(searchText).toMutableList()
                        rv.adapter = CountriesRVAdapter(countries,true, lifecycleScope)

                        if (countries.isEmpty()) {
                            ll.visibility = View.VISIBLE
                        }else {
                            ll.visibility = View.GONE
                        }
                    }
                }

            }
        }

    }
}
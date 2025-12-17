package com.deveenvi.flagquizgame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.deveenvi.flagquizgame.database.CountryDatabase
import kotlinx.coroutines.launch


class DiscoverFragment : Fragment() {

    private lateinit var rv : RecyclerView

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

        val db = CountryDatabase.getDatabase(requireContext())
        val countryDao = db.countryDao()

        lifecycleScope.launch {

            val countries = countryDao.getNextTenElements(1).toMutableList()

            rv.layoutManager = LinearLayoutManager(requireContext())
            rv.adapter = CountriesRVAdapter(countries, lifecycleScope)
        }

    }
}
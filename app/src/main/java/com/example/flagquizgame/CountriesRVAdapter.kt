package com.example.flagquizgame

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class CountriesRVAdapter(val countries : List<Country> )
    : RecyclerView.Adapter<CountriesRVAdapter.CountryViewHolder>() {

    class CountryViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        val flag_iv = itemView.findViewById<ImageView>(R.id.countryRVItem_iv_flag)
        val name_tv = itemView.findViewById<TextView>(R.id.countryRVItem_tv_countryName)
        val area_tv = itemView.findViewById<TextView>(R.id.countryRVItem_tv_countryArea)
        val population_tv = itemView.findViewById<TextView>(R.id.countryRVItem_tv_countryPopulation)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.country_rv_item, parent, false)
        return CountryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        val country = countries[position]

        val flagResID = holder.flag_iv.context.resources
            .getIdentifier(country.flag, "drawable",
                holder.flag_iv.context.packageName)
        if (flagResID != 0) {
            holder.flag_iv.setImageResource(flagResID)
        }

        holder.name_tv.text = "${country.name}"
        holder.area_tv.text = country.area
        holder.population_tv.text = country.population

        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, country.code, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return countries.size
    }

}
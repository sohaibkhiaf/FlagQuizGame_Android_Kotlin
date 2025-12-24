package com.deveenvi.flagquizgame

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.LifecycleCoroutineScope
import androidx.recyclerview.widget.RecyclerView
import com.deveenvi.flagquizgame.database.Country
import com.deveenvi.flagquizgame.database.CountryDatabase
import kotlinx.coroutines.launch

class CountriesRVAdapter(var countries : MutableList<Country>, var searchMode: Boolean ,val lifecycleScope: LifecycleCoroutineScope )
    : RecyclerView.Adapter<CountriesRVAdapter.CountryViewHolder>() {

    class CountryViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        val flagIv = itemView.findViewById<ImageView>(R.id.countryRVItem_iv_flag)
        val nameTv = itemView.findViewById<TextView>(R.id.countryRVItem_tv_countryName)
        val areaTv = itemView.findViewById<TextView>(R.id.countryRVItem_tv_countryArea)
        val populationTv = itemView.findViewById<TextView>(R.id.countryRVItem_tv_countryPopulation)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.country_rv_item, parent, false)
        return CountryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        val country = countries[position]

        val flagResID = holder.flagIv.context.resources
            .getIdentifier(country.flag, "drawable",
                holder.flagIv.context.packageName)
        if (flagResID != 0) {
            holder.flagIv.setImageResource(flagResID)
        }

        holder.nameTv.text = country.name
        holder.areaTv.text = country.area
        holder.populationTv.text = country.population

        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, country.code, Toast.LENGTH_SHORT).show()
        }

        if (!searchMode){
            val currentItemID = position+1
            val nextItemID = currentItemID+1

            if ( (currentItemID) >= countries.size ){
                val db = CountryDatabase.getDatabase(holder.itemView.context)
                val countryDao = db.countryDao()

                lifecycleScope.launch {
                    countries = countryDao.getNextTenElements(nextItemID).toMutableList()
                    notifyItemRangeInserted(currentItemID, itemCount)
                    // Toast.makeText(holder.itemView.context, "laod", Toast.LENGTH_SHORT).show()
                }

            }
        }

    }

    override fun getItemCount(): Int {
        return countries.size
    }

}
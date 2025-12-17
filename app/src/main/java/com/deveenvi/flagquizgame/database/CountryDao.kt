package com.deveenvi.flagquizgame.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface CountryDao {

    @Insert
    suspend fun insertCountry(country: Country)

    @Query("SELECT * FROM countries")
    suspend fun getAllCountries(): List<Country>

    @Query("SELECT * FROM countries WHERE id < (:id+10)")
    suspend fun getNextTenElements(id: Int): List<Country>

    @Delete
    suspend fun deleteCountry(country: Country)

    @Query("SELECT COUNT(*) FROM countries")
    suspend fun getCount() : Int

    @Query("SELECT * FROM countries ORDER BY RANDOM() LIMIT 1")
    suspend fun getRandomCountry(): Country

    @Query("SELECT * FROM countries WHERE id NOT IN (:id1) ORDER BY RANDOM() LIMIT 1")
    suspend fun getRandomCountry(id1: Int): Country

    @Query("SELECT * FROM countries WHERE id NOT IN (:id1, :id2) ORDER BY RANDOM() LIMIT 1")
    suspend fun getRandomCountry(id1: Int, id2: Int): Country

    @Query("SELECT * FROM countries WHERE id NOT IN (:id1, :id2, :id3) ORDER BY RANDOM() LIMIT 1")
    suspend fun getRandomCountry(id1: Int, id2: Int, id3: Int): Country

    @Query("SELECT * FROM countries WHERE id NOT IN (:id1, :id2, :id3, :id4) ORDER BY RANDOM() LIMIT 1")
    suspend fun getRandomCountry(id1: Int, id2: Int, id3: Int, id4: Int): Country

}
package com.deveenvi.flagquizgame.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "countries")
data class Country (
    @PrimaryKey
    val id: Int,
    val name: String,
    val code: String ,
    val flag: String ,
    val area: String ,
    val population: String
)
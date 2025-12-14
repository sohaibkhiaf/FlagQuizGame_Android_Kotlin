package com.example.flagquizgame

import android.content.Context
import kotlin.random.Random

class SharedPreferencesManager (context: Context) {

    private val count : Int = 31

    private val preferences = context.getSharedPreferences("countries",
        Context.MODE_PRIVATE)

    fun initializeCountries() {
        val editor = preferences.edit()

        // Afghanistan
        editor.putString("name_1", "Afghanistan")
        editor.putString("code_1", "AF")
        editor.putString("flag_1", "flag_afghanistan")
        editor.putString("area_1", "652,230 km²")
        editor.putString("population_1", "41 million people")

        // Albania
        editor.putString("name_2", "Albania")
        editor.putString("code_2", "AL")
        editor.putString("flag_2", "flag_albania")
        editor.putString("area_2", "28,748 km²")
        editor.putString("population_2", "2.8 million people")

        // Algeria
        editor.putString("name_3", "Algeria")
        editor.putString("code_3", "DZ")
        editor.putString("flag_3", "flag_algeria")
        editor.putString("area_3", "2.382 million km²")
        editor.putString("population_3", "47.7 million people")

        // Andorra
        editor.putString("name_4", "Andorra")
        editor.putString("code_4", "AD")
        editor.putString("flag_4", "flag_andorra")
        editor.putString("area_4", "468 km²")
        editor.putString("population_4", "77 thousand people")

        // Angola
        editor.putString("name_5", "Angola")
        editor.putString("code_5", "AO")
        editor.putString("flag_5", "flag_angola")
        editor.putString("area_5", "1.246 million km²")
        editor.putString("population_5", "36 million people")

        // Antigua and Barbuda
        editor.putString("name_6", "Antigua and Barbuda")
        editor.putString("code_6", "AG")
        editor.putString("flag_6", "flag_antigua_and_barbuda")
        editor.putString("area_6", "442 km²")
        editor.putString("population_6", "93 thousand people")

        // Argentina
        editor.putString("name_7", "Argentina")
        editor.putString("code_7", "AR")
        editor.putString("flag_7", "flag_argentina")
        editor.putString("area_7", "2.780 million km²")
        editor.putString("population_7", "46 million people")

        // Armenia
        editor.putString("name_8", "Armenia")
        editor.putString("code_8", "AM")
        editor.putString("flag_8", "flag_armenia")
        editor.putString("area_8", "29,743 km²")
        editor.putString("population_8", "3 million people")

        // Australia
        editor.putString("name_9", "Australia")
        editor.putString("code_9", "AU")
        editor.putString("flag_9", "flag_australia")
        editor.putString("area_9", "7.692 million km²")
        editor.putString("population_9", "26 million people")

        // Austria
        editor.putString("name_10", "Austria")
        editor.putString("code_10", "AT")
        editor.putString("flag_10", "flag_austria")
        editor.putString("area_10", "83,879 km²")
        editor.putString("population_10", "9.1 million people")


        // Azerbaijan
        editor.putString("name_11", "Azerbaijan")
        editor.putString("code_11", "AZ")
        editor.putString("flag_11", "flag_azerbaijan")
        editor.putString("area_11", "86,600 km²")
        editor.putString("population_11", "10.3 million people")

        // Bahamas
        editor.putString("name_12", "Bahamas")
        editor.putString("code_12", "BS")
        editor.putString("flag_12", "flag_bahamas")
        editor.putString("area_12", "13,880 km²")
        editor.putString("population_12", "400 thousand people")

        // Bahrain
        editor.putString("name_13", "Bahrain")
        editor.putString("code_13", "BH")
        editor.putString("flag_13", "flag_bahrain")
        editor.putString("area_13", "778 km²")
        editor.putString("population_13", "1.5 million people")

        // Bangladesh
        editor.putString("name_14", "Bangladesh")
        editor.putString("code_14", "BD")
        editor.putString("flag_14", "flag_bangladesh")
        editor.putString("area_14", "148,460 km²")
        editor.putString("population_14", "173 million people")

        // Barbados
        editor.putString("name_15", "Barbados")
        editor.putString("code_15", "BB")
        editor.putString("flag_15", "flag_barbados")
        editor.putString("area_15", "430 km²")
        editor.putString("population_15", "281 thousand people")

        // Belarus
        editor.putString("name_16", "Belarus")
        editor.putString("code_16", "BY")
        editor.putString("flag_16", "flag_belarus")
        editor.putString("area_16", "207,600 km²")
        editor.putString("population_16", "9.2 million people")

        // Belgium
        editor.putString("name_17", "Belgium")
        editor.putString("code_17", "BE")
        editor.putString("flag_17", "flag_belgium")
        editor.putString("area_17", "30,528 km²")
        editor.putString("population_17", "11.7 million people")

        // Belize
        editor.putString("name_18", "Belize")
        editor.putString("code_18", "BZ")
        editor.putString("flag_18", "flag_belize")
        editor.putString("area_18", "22,966 km²")
        editor.putString("population_18", "420 thousand people")

        // Benin
        editor.putString("name_19", "Benin")
        editor.putString("code_19", "BJ")
        editor.putString("flag_19", "flag_benin")
        editor.putString("area_19", "114,763 km²")
        editor.putString("population_19", "13.5 million people")

        // Bhutan
        editor.putString("name_20", "Bhutan")
        editor.putString("code_20", "BT")
        editor.putString("flag_20", "flag_bhutan")
        editor.putString("area_20", "38,394 km²")
        editor.putString("population_20", "790 thousand people")

        // Bolivia
        editor.putString("name_21", "Bolivia")
        editor.putString("code_21", "BO")
        editor.putString("flag_21", "flag_bolivia")
        editor.putString("area_21", "1.099 million km²")
        editor.putString("population_21", "12.4 million people")

        // Bosnia and Herzegovina
        editor.putString("name_22", "Bosnia and Herzegovina")
        editor.putString("code_22", "BA")
        editor.putString("flag_22", "flag_bosnia_and_herzegovina")
        editor.putString("area_22", "51,209 km²")
        editor.putString("population_22", "3.2 million people")

        // Botswana
        editor.putString("name_23", "Botswana")
        editor.putString("code_23", "BW")
        editor.putString("flag_23", "flag_botswana")
        editor.putString("area_23", "581,730 km²")
        editor.putString("population_23", "2.6 million people")

        // Brazil
        editor.putString("name_24", "Brazil")
        editor.putString("code_24", "BR")
        editor.putString("flag_24", "flag_brazil")
        editor.putString("area_24", "8.516 million km²")
        editor.putString("population_24", "216 million people")

        // Brunei
        editor.putString("name_25", "Brunei")
        editor.putString("code_25", "BN")
        editor.putString("flag_25", "flag_brunei")
        editor.putString("area_25", "5,765 km²")
        editor.putString("population_25", "450 thousand people")

        // Bulgaria
        editor.putString("name_26", "Bulgaria")
        editor.putString("code_26", "BG")
        editor.putString("flag_26", "flag_bulgaria")
        editor.putString("area_26", "110,879 km²")
        editor.putString("population_26", "6.4 million people")

        // Burkina Faso
        editor.putString("name_27", "Burkina Faso")
        editor.putString("code_27", "BF")
        editor.putString("flag_27", "flag_burkina_faso")
        editor.putString("area_27", "272,967 km²")
        editor.putString("population_27", "23 million people")

        // Burundi
        editor.putString("name_28", "Burundi")
        editor.putString("code_28", "BI")
        editor.putString("flag_28", "flag_burundi")
        editor.putString("area_28", "27,834 km²")
        editor.putString("population_28", "13 million people")

        // Cambodia
        editor.putString("name_29", "Cambodia")
        editor.putString("code_29", "KH")
        editor.putString("flag_29", "flag_cambodia")
        editor.putString("area_29", "181,035 km²")
        editor.putString("population_29", "17 million people")

        // Cameroon
        editor.putString("name_30", "Cameroon")
        editor.putString("code_30", "CM")
        editor.putString("flag_30", "flag_cameroon")
        editor.putString("area_30", "475,442 km²")
        editor.putString("population_30", "28 million people")

        // Canada
        editor.putString("name_31", "Canada")
        editor.putString("code_31", "CA")
        editor.putString("flag_31", "flag_canada")
        editor.putString("area_31", "9.985 million km²")
        editor.putString("population_31", "40 million people")

        editor.apply()
    }



    fun getRandomCountry () : Country {
        val id = Random.nextInt(1, count+1)
        val name = preferences.getString("name_${id}", null)
        val code = preferences.getString("code_${id}", null)
        val flag = preferences.getString("flag_${id}", null)
        val area = preferences.getString("area_${id}", null)
        val population = preferences.getString("population_${id}", null)
        return Country(id, name, code, flag, area, population)
    }

    fun getRandomCountry (excluded: Int) : Country {
        var id = 0
        do {
            id = Random.nextInt(1, count+1)
        }while (id == excluded)

        val name = preferences.getString("name_${id}", null)
        val code = preferences.getString("code_${id}", null)
        val flag = preferences.getString("flag_${id}", null)
        val area = preferences.getString("area_${id}", null)
        val population = preferences.getString("population_${id}", null)
        return Country(id, name, code, flag, area, population)
    }

    fun getRandomCountry (excluded1: Int, excluded2: Int) : Country {
        var id = 0
        do {
            id = Random.nextInt(1, count+1)
        }while (id == excluded1 || id == excluded2)

        val name = preferences.getString("name_${id}", null)
        val code = preferences.getString("code_${id}", null)
        val flag = preferences.getString("flag_${id}", null)
        val area = preferences.getString("area_${id}", null)
        val population = preferences.getString("population_${id}", null)
        return Country(id, name, code, flag, area, population)
    }

    fun getCountriesList () : MutableList<Country> {
        val countries = mutableListOf<Country>()
        for (id in 1..count) {
            val name = preferences.getString("name_${id}", null)
            val code = preferences.getString("code_${id}", null)
            val flag = preferences.getString("flag_${id}", null)
            val area = preferences.getString("area_${id}", null)
            val population = preferences.getString("population_${id}", null)
            countries.add( Country(id, name, code, flag, area, population))
        }
        return countries
    }


}
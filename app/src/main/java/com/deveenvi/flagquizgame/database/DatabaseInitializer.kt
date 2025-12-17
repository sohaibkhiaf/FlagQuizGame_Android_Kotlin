package com.deveenvi.flagquizgame.database

import androidx.lifecycle.LifecycleCoroutineScope
import kotlinx.coroutines.launch

class DatabaseInitializer {

    fun initializeDatabase (countryDao: CountryDao, lifecycleScope: LifecycleCoroutineScope){

        lifecycleScope.launch {

            val count = countryDao.getCount()

            if (count == 0) {
                countryDao.insertCountry(
                    Country(
                        id= 1,
                        name = "Afghanistan",
                        code = "AF",
                        flag = "flag_afghanistan",
                        area = "652,230 km²",
                        population = "41 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id=2,
                        name = "Albania",
                        code = "AL",
                        flag = "flag_albania",
                        area = "28,748 km²",
                        population = "2.8 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id= 3,
                        name = "Algeria",
                        code = "DZ",
                        flag = "flag_algeria",
                        area = "2.382 million km²",
                        population = "47.7 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 4,
                        name = "Andorra",
                        code = "AD",
                        flag = "flag_andorra",
                        area = "468 km²",
                        population = "77 thousand people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id=5,
                        name = "Angola",
                        code = "AO",
                        flag = "flag_angola",
                        area = "1.246 million km²",
                        population = "36 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 6,
                        name = "Antigua and Barbuda",
                        code = "AG",
                        flag = "flag_antigua_and_barbuda",
                        area = "442 km²",
                        population = "93 thousand people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id =7,
                        name = "Argentina",
                        code = "AR",
                        flag = "flag_argentina",
                        area = "2.780 million km²",
                        population = "46 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 8,
                        name = "Armenia",
                        code = "AM",
                        flag = "flag_armenia",
                        area = "29,743 km²",
                        population = "3 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 9,
                        name = "Australia",
                        code = "AU",
                        flag = "flag_australia",
                        area = "7.692 million km²",
                        population = "26 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 10,
                        name = "Austria",
                        code = "AT",
                        flag = "flag_austria",
                        area = "83,879 km²",
                        population = "9.1 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 11,
                        name = "Azerbaijan",
                        code = "AZ",
                        flag = "flag_azerbaijan",
                        area = "86,600 km²",
                        population = "10.3 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id =12,
                        name = "Bahamas",
                        code = "BS",
                        flag = "flag_bahamas",
                        area = "13,880 km²",
                        population = "400 thousand people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id =13,
                        name = "Bahrain",
                        code = "BH",
                        flag = "flag_bahrain",
                        area = "778 km²",
                        population = "1.5 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 14,
                        name = "Bangladesh",
                        code = "BD",
                        flag = "flag_bangladesh",
                        area = "148,460 km²",
                        population = "173 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 15,
                        name = "Barbados",
                        code = "BB",
                        flag = "flag_barbados",
                        area = "430 km²",
                        population = "281 thousand people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 16,
                        name = "Belarus",
                        code = "BY",
                        flag = "flag_belarus",
                        area = "207,600 km²",
                        population = "9.2 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 17,
                        name = "Belgium",
                        code = "BE",
                        flag = "flag_belgium",
                        area = "30,528 km²",
                        population = "11.7 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 18,
                        name = "Belize",
                        code = "BZ",
                        flag = "flag_belize",
                        area = "22,966 km²",
                        population = "420 thousand people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 19,
                        name = "Benin",
                        code = "BJ",
                        flag = "flag_benin",
                        area = "114,763 km²",
                        population = "13.5 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 20,
                        name = "Bhutan",
                        code = "BT",
                        flag = "flag_bhutan",
                        area = "38,394 km²",
                        population = "790 thousand people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 21,
                        name = "Bolivia",
                        code = "BO",
                        flag = "flag_bolivia",
                        area = "1.099 million km²",
                        population = "12.4 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 22,
                        name = "Bosnia and Herzegovina",
                        code = "BA",
                        flag = "flag_bosnia_and_herzegovina",
                        area = "51,209 km²",
                        population = "3.2 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 23,
                        name = "Botswana",
                        code = "BW",
                        flag = "flag_botswana",
                        area = "581,730 km²",
                        population = "2.6 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 24,
                        name = "Brazil",
                        code = "BR",
                        flag = "flag_brazil",
                        area = "8.516 million km²",
                        population = "216 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 25,
                        name = "Brunei",
                        code = "BN",
                        flag = "flag_brunei",
                        area = "5,765 km²",
                        population = "450 thousand people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 26,
                        name = "Bulgaria",
                        code = "BG",
                        flag = "flag_bulgaria",
                        area = "110,879 km²",
                        population = "6.4 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 27,
                        name = "Burkina Faso",
                        code = "BF",
                        flag = "flag_burkina_faso",
                        area = "272,967 km²",
                        population = "23 million people"
                    )
                )
                countryDao.insertCountry(
                    Country(
                        id = 28,
                        name = "Burundi",
                        code = "BI",
                        flag = "flag_burundi",
                        area = "27,834 km²",
                        population = "13 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 29,
                        name = "Cambodia",
                        code = "KH",
                        flag = "flag_cambodia",
                        area = "181,035 km²",
                        population = "17 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 30,
                        name = "Cameroon",
                        code = "CM",
                        flag = "flag_cameroon",
                        area = "475,442 km²",
                        population = "28 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 31,
                        name = "Canada",
                        code = "CA",
                        flag = "flag_canada",
                        area = "9.985 million km²",
                        population = "40 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 32,
                        name = "Central African Republic",
                        code = "CF",
                        flag = "flag_central_african_republic",
                        area = "622,984 km²",
                        population = "5.6 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 33,
                        name = "Chad",
                        code = "TD",
                        flag = "flag_chad",
                        area = "1.284 million km²",
                        population = "18 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 34,
                        name = "Chile",
                        code = "CL",
                        flag = "flag_chile",
                        area = "756,102 km²",
                        population = "19.6 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 35,
                        name = "China",
                        code = "CN",
                        flag = "flag_china",
                        area = "9.597 million km²",
                        population = "1.41 billion people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 36,
                        name = "Colombia",
                        code = "CO",
                        flag = "flag_colombia",
                        area = "1.142 million km²",
                        population = "52 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 37,
                        name = "Comoros",
                        code = "KM",
                        flag = "flag_comoros",
                        area = "2,235 km²",
                        population = "850 thousand people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 38,
                        name = "Congo",
                        code = "CG",
                        flag = "flag_congo",
                        area = "342,000 km²",
                        population = "6 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 39,
                        name = "Costa Rica",
                        code = "CR",
                        flag = "flag_costa_rica",
                        area = "51,100 km²",
                        population = "5.2 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 40,
                        name = "Croatia",
                        code = "HR",
                        flag = "flag_croatia",
                        area = "56,594 km²",
                        population = "3.9 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 41,
                        name = "Cuba",
                        code = "CU",
                        flag = "flag_cuba",
                        area = "109,884 km²",
                        population = "11 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 42,
                        name = "Cyprus",
                        code = "CY",
                        flag = "flag_cyprus",
                        area = "9,251 km²",
                        population = "1.3 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 43,
                        name = "Czech Republic",
                        code = "CZ",
                        flag = "flag_czech_republic",
                        area = "78,866 km²",
                        population = "10.9 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 44,
                        name = "Denmark",
                        code = "DK",
                        flag = "flag_denmark",
                        area = "42,933 km²",
                        population = "5.9 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 45,
                        name = "Djibouti",
                        code = "DJ",
                        flag = "flag_djibouti",
                        area = "23,200 km²",
                        population = "1.1 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 46,
                        name = "Dominica",
                        code = "DM",
                        flag = "flag_dominica",
                        area = "751 km²",
                        population = "73 thousand people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 47,
                        name = "Dominican Republic",
                        code = "DO",
                        flag = "flag_dominican_republic",
                        area = "48,671 km²",
                        population = "11.3 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 48,
                        name = "Ecuador",
                        code = "EC",
                        flag = "flag_ecuador",
                        area = "276,841 km²",
                        population = "18 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 49,
                        name = "Egypt",
                        code = "EG",
                        flag = "flag_egypt",
                        area = "1.010 million km²",
                        population = "112 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 50,
                        name = "El Salvador",
                        code = "SV",
                        flag = "flag_el_salvador",
                        area = "21,041 km²",
                        population = "6.4 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 51,
                        name = "Equatorial Guinea",
                        code = "GQ",
                        flag = "flag_equatorial_guinea",
                        area = "28,051 km²",
                        population = "1.7 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 52,
                        name = "Eritrea",
                        code = "ER",
                        flag = "flag_eritrea",
                        area = "117,600 km²",
                        population = "3.7 million people"
                    )
                )
                countryDao.insertCountry(
                    Country(
                        id = 53,
                        name = "Estonia",
                        code = "EE",
                        flag = "flag_estonia",
                        area = "45,227 km²",
                        population = "1.3 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 54,
                        name = "Swaziland",
                        code = "SZ",
                        flag = "flag_swaziland",
                        area = "17,364 km²",
                        population = "1.2 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 55,
                        name = "Ethiopia",
                        code = "ET",
                        flag = "flag_ethiopia",
                        area = "1.104 million km²",
                        population = "128 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 56,
                        name = "Fiji",
                        code = "FJ",
                        flag = "flag_fiji",
                        area = "18,274 km²",
                        population = "930 thousand people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 57,
                        name = "Finland",
                        code = "FI",
                        flag = "flag_finland",
                        area = "338,455 km²",
                        population = "5.6 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 58,
                        name = "France",
                        code = "FR",
                        flag = "flag_france",
                        area = "551,695 km²",
                        population = "68 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 59,
                        name = "Gabon",
                        code = "GA",
                        flag = "flag_gabon",
                        area = "267,668 km²",
                        population = "2.4 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 60,
                        name = "Gambia",
                        code = "GM",
                        flag = "flag_gambia",
                        area = "11,295 km²",
                        population = "2.8 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 61,
                        name = "Georgia",
                        code = "GE",
                        flag = "flag_georgia",
                        area = "69,700 km²",
                        population = "3.7 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 62,
                        name = "Germany",
                        code = "DE",
                        flag = "flag_germany",
                        area = "357,022 km²",
                        population = "84 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 63,
                        name = "Ghana",
                        code = "GH",
                        flag = "flag_ghana",
                        area = "238,535 km²",
                        population = "34 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 64,
                        name = "Greece",
                        code = "GR",
                        flag = "flag_greece",
                        area = "131,957 km²",
                        population = "10.3 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 65,
                        name = "Grenada",
                        code = "GD",
                        flag = "flag_grenada",
                        area = "344 km²",
                        population = "126 thousand people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 66,
                        name = "Guatemala",
                        code = "GT",
                        flag = "flag_guatemala",
                        area = "108,889 km²",
                        population = "18 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 67,
                        name = "Guinea",
                        code = "GN",
                        flag = "flag_guinea",
                        area = "245,857 km²",
                        population = "14 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 68,
                        name = "Guinea-Bissau",
                        code = "GW",
                        flag = "flag_guinea_bissau",
                        area = "36,125 km²",
                        population = "2.1 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 69,
                        name = "Guyana",
                        code = "GY",
                        flag = "flag_guyana",
                        area = "214,969 km²",
                        population = "810 thousand people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 70,
                        name = "Haiti",
                        code = "HT",
                        flag = "flag_haiti",
                        area = "27,750 km²",
                        population = "11.5 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 71,
                        name = "Honduras",
                        code = "HN",
                        flag = "flag_honduras",
                        area = "112,492 km²",
                        population = "10.8 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 72,
                        name = "Hungary",
                        code = "HU",
                        flag = "flag_hungary",
                        area = "93,030 km²",
                        population = "9.6 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 73,
                        name = "Iceland",
                        code = "IS",
                        flag = "flag_iceland",
                        area = "103,000 km²",
                        population = "390 thousand people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 74,
                        name = "India",
                        code = "IN",
                        flag = "flag_india",
                        area = "3.287 million km²",
                        population = "1.43 billion people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 75,
                        name = "Indonesia",
                        code = "ID",
                        flag = "flag_indonesia",
                        area = "1.905 million km²",
                        population = "277 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 76,
                        name = "Iran",
                        code = "IR",
                        flag = "flag_iran",
                        area = "1.648 million km²",
                        population = "89 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 77,
                        name = "Iraq",
                        code = "IQ",
                        flag = "flag_iraq",
                        area = "438,317 km²",
                        population = "45 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 78,
                        name = "Ireland",
                        code = "IE",
                        flag = "flag_ireland",
                        area = "70,273 km²",
                        population = "5.3 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 79,
                        name = "Kosovo",
                        code = "XK",
                        flag = "flag_kosovo",
                        area = "10,887 km²",
                        population = "1.6 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 80,
                        name = "Italy",
                        code = "IT",
                        flag = "flag_italy",
                        area = "301,340 km²",
                        population = "59 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 81,
                        name = "Jamaica",
                        code = "JM",
                        flag = "flag_jamaica",
                        area = "10,991 km²",
                        population = "2.8 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 82,
                        name = "Japan",
                        code = "JP",
                        flag = "flag_japan",
                        area = "377,975 km²",
                        population = "124 million people"
                    )
                )
                countryDao.insertCountry(
                    Country(
                        id = 83,
                        name = "Jordan",
                        code = "JO",
                        flag = "flag_jordan",
                        area = "89,342 km²",
                        population = "11.3 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 84,
                        name = "Kazakhstan",
                        code = "KZ",
                        flag = "flag_kazakhstan",
                        area = "2.725 million km²",
                        population = "20 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 85,
                        name = "Kenya",
                        code = "KE",
                        flag = "flag_kenya",
                        area = "580,367 km²",
                        population = "55 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 86,
                        name = "Kiribati",
                        code = "KI",
                        flag = "flag_kiribati",
                        area = "811 km²",
                        population = "133 thousand people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 87,
                        name = "Kuwait",
                        code = "KW",
                        flag = "flag_kuwait",
                        area = "17,818 km²",
                        population = "4.3 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 88,
                        name = "Kyrgyzstan",
                        code = "KG",
                        flag = "flag_kyrgyzstan",
                        area = "199,951 km²",
                        population = "6.6 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 89,
                        name = "Laos",
                        code = "LA",
                        flag = "flag_laos",
                        area = "236,800 km²",
                        population = "7.5 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 90,
                        name = "Latvia",
                        code = "LV",
                        flag = "flag_latvia",
                        area = "64,589 km²",
                        population = "1.8 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 91,
                        name = "Lebanon",
                        code = "LB",
                        flag = "flag_lebanon",
                        area = "10,452 km²",
                        population = "6.8 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 92,
                        name = "Lesotho",
                        code = "LS",
                        flag = "flag_lesotho",
                        area = "30,355 km²",
                        population = "2.2 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 93,
                        name = "Liberia",
                        code = "LR",
                        flag = "flag_liberia",
                        area = "111,369 km²",
                        population = "5.3 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 94,
                        name = "Libya",
                        code = "LY",
                        flag = "flag_libya",
                        area = "1.760 million km²",
                        population = "6.9 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 95,
                        name = "Liechtenstein",
                        code = "LI",
                        flag = "flag_liechtenstein",
                        area = "160 km²",
                        population = "39 thousand people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 96,
                        name = "Lithuania",
                        code = "LT",
                        flag = "flag_lithuania",
                        area = "65,300 km²",
                        population = "2.8 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 97,
                        name = "Luxembourg",
                        code = "LU",
                        flag = "flag_luxembourg",
                        area = "2,586 km²",
                        population = "670 thousand people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 98,
                        name = "Madagascar",
                        code = "MG",
                        flag = "flag_madagascar",
                        area = "587,041 km²",
                        population = "28 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 99,
                        name = "Malawi",
                        code = "MW",
                        flag = "flag_malawi",
                        area = "118,484 km²",
                        population = "20 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 100,
                        name = "Malaysia",
                        code = "MY",
                        flag = "flag_malaysia",
                        area = "330,803 km²",
                        population = "33 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 101,
                        name = "Maldives",
                        code = "MV",
                        flag = "flag_maldives",
                        area = "300 km²",
                        population = "540 thousand people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 102,
                        name = "Mali",
                        code = "ML",
                        flag = "flag_mali",
                        area = "1.240 million km²",
                        population = "21 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 103,
                        name = "Malta",
                        code = "MT",
                        flag = "flag_malta",
                        area = "316 km²",
                        population = "520 thousand people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 104,
                        name = "Marshall Islands",
                        code = "MH",
                        flag = "flag_marshall_islands",
                        area = "181 km²",
                        population = "59 thousand people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 105,
                        name = "Mauritania",
                        code = "MR",
                        flag = "flag_mauritania",
                        area = "1.030 million km²",
                        population = "4.5 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 106,
                        name = "Mauritius",
                        code = "MU",
                        flag = "flag_mauritius",
                        area = "2,040 km²",
                        population = "1.3 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 107,
                        name = "Mexico",
                        code = "MX",
                        flag = "flag_mexico",
                        area = "1.964 million km²",
                        population = "129 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 108,
                        name = "Micronesia",
                        code = "FM",
                        flag = "flag_micronesia",
                        area = "702 km²",
                        population = "115 thousand people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 109,
                        name = "Moldova",
                        code = "MD",
                        flag = "flag_moldova",
                        area = "33,846 km²",
                        population = "2.6 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 110,
                        name = "Monaco",
                        code = "MC",
                        flag = "flag_monaco",
                        area = "2 km²",
                        population = "39 thousand people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 111,
                        name = "Mongolia",
                        code = "MN",
                        flag = "flag_mongolia",
                        area = "1.566 million km²",
                        population = "3.4 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 112,
                        name = "Montenegro",
                        code = "ME",
                        flag = "flag_montenegro",
                        area = "13,812 km²",
                        population = "622 thousand people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 113,
                        name = "Morocco",
                        code = "MA",
                        flag = "flag_morocco",
                        area = "446,550 km²",
                        population = "37 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 114,
                        name = "Mozambique",
                        code = "MZ",
                        flag = "flag_mozambique",
                        area = "801,590 km²",
                        population = "33 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 115,
                        name = "Myanmar",
                        code = "MM",
                        flag = "flag_myanmar",
                        area = "676,578 km²",
                        population = "54 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 116,
                        name = "Namibia",
                        code = "NA",
                        flag = "flag_namibia",
                        area = "824,292 km²",
                        population = "2.7 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 117,
                        name = "Nauru",
                        code = "NR",
                        flag = "flag_nauru",
                        area = "21 km²",
                        population = "10 thousand people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 118,
                        name = "Nepal",
                        code = "NP",
                        flag = "flag_nepal",
                        area = "147,516 km²",
                        population = "30 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 119,
                        name = "Netherlands",
                        code = "NL",
                        flag = "flag_netherlands",
                        area = "41,543 km²",
                        population = "17.6 million people"
                    )
                )
                countryDao.insertCountry(
                    Country(
                        id = 120,
                        name = "New Zealand",
                        code = "NZ",
                        flag = "flag_new_zealand",
                        area = "268,838 km²",
                        population = "5.2 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 121,
                        name = "Nicaragua",
                        code = "NI",
                        flag = "flag_nicaragua",
                        area = "130,375 km²",
                        population = "6.9 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 122,
                        name = "Niger",
                        code = "NE",
                        flag = "flag_niger",
                        area = "1.267 million km²",
                        population = "26 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 123,
                        name = "Nigeria",
                        code = "NG",
                        flag = "flag_nigeria",
                        area = "923,768 km²",
                        population = "223 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 124,
                        name = "North Korea",
                        code = "KP",
                        flag = "flag_north_korea",
                        area = "120,540 km²",
                        population = "25.7 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 125,
                        name = "North Macedonia",
                        code = "MK",
                        flag = "flag_north_macedonia",
                        area = "25,713 km²",
                        population = "2.1 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 126,
                        name = "Norway",
                        code = "NO",
                        flag = "flag_norway",
                        area = "385,207 km²",
                        population = "5.4 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 127,
                        name = "Oman",
                        code = "OM",
                        flag = "flag_oman",
                        area = "309,500 km²",
                        population = "5.5 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 128,
                        name = "Pakistan",
                        code = "PK",
                        flag = "flag_pakistan",
                        area = "881,913 km²",
                        population = "242 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 129,
                        name = "Palau",
                        code = "PW",
                        flag = "flag_palau",
                        area = "459 km²",
                        population = "21 thousand people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 130,
                        name = "Palestine",
                        code = "PS",
                        flag = "flag_palestine",
                        area = "6,020 km²",
                        population = "5.2 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 131,
                        name = "Panama",
                        code = "PA",
                        flag = "flag_panama",
                        area = "75,417 km²",
                        population = "4.5 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 132,
                        name = "Papua New Guinea",
                        code = "PG",
                        flag = "flag_papua_new_guinea",
                        area = "462,840 km²",
                        population = "9.3 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 133,
                        name = "Paraguay",
                        code = "PY",
                        flag = "flag_paraguay",
                        area = "406,752 km²",
                        population = "7.3 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 134,
                        name = "Peru",
                        code = "PE",
                        flag = "flag_peru",
                        area = "1.285 million km²",
                        population = "34 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 135,
                        name = "Philippines",
                        code = "PH",
                        flag = "flag_philippines",
                        area = "300,000 km²",
                        population = "114 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 136,
                        name = "Poland",
                        code = "PL",
                        flag = "flag_poland",
                        area = "312,696 km²",
                        population = "38 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 137,
                        name = "Portugal",
                        code = "PT",
                        flag = "flag_portugal",
                        area = "92,090 km²",
                        population = "10.3 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 138,
                        name = "Qatar",
                        code = "QA",
                        flag = "flag_qatar",
                        area = "11,586 km²",
                        population = "2.9 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 139,
                        name = "Romania",
                        code = "RO",
                        flag = "flag_romania",
                        area = "238,397 km²",
                        population = "19 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 140,
                        name = "Russia",
                        code = "RU",
                        flag = "flag_russia",
                        area = "17.1 million km²",
                        population = "144 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 141,
                        name = "Rwanda",
                        code = "RW",
                        flag = "flag_rwanda",
                        area = "26,338 km²",
                        population = "13.2 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 142,
                        name = "Saint Kitts and Nevis",
                        code = "KN",
                        flag = "flag_saint_kitts_and_nevis",
                        area = "261 km²",
                        population = "53 thousand people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 143,
                        name = "Saint Lucia",
                        code = "LC",
                        flag = "flag_saint_lucia",
                        area = "617 km²",
                        population = "180 thousand people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 144,
                        name = "Saint Vincent and the Grenadines",
                        code = "VC",
                        flag = "flag_saint_vincent_and_the_grenadines",
                        area = "389 km²",
                        population = "110 thousand people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 145,
                        name = "Samoa",
                        code = "WS",
                        flag = "flag_samoa",
                        area = "2,831 km²",
                        population = "210 thousand people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 146,
                        name = "San Marino",
                        code = "SM",
                        flag = "flag_san_marino",
                        area = "61 km²",
                        population = "34 thousand people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 147,
                        name = "São Tomé and Príncipe",
                        code = "ST",
                        flag = "flag_sao_tome_and_principe",
                        area = "964 km²",
                        population = "228 thousand people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 148,
                        name = "Saudi Arabia",
                        code = "SA",
                        flag = "flag_saudi_arabia",
                        area = "2.150 million km²",
                        population = "36 million people"
                    )
                )
                countryDao.insertCountry(
                    Country(
                        id = 149,
                        name = "Senegal",
                        code = "SN",
                        flag = "flag_senegal",
                        area = "196,722 km²",
                        population = "18 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 150,
                        name = "Serbia",
                        code = "RS",
                        flag = "flag_serbia",
                        area = "77,474 km²",
                        population = "6.7 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 151,
                        name = "Seychelles",
                        code = "SC",
                        flag = "flag_seychelles",
                        area = "455 km²",
                        population = "100 thousand people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 152,
                        name = "Sierra Leone",
                        code = "SL",
                        flag = "flag_sierra_leone",
                        area = "71,740 km²",
                        population = "8.1 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 153,
                        name = "Singapore",
                        code = "SG",
                        flag = "flag_singapore",
                        area = "728 km²",
                        population = "5.7 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 154,
                        name = "Slovakia",
                        code = "SK",
                        flag = "flag_slovakia",
                        area = "49,035 km²",
                        population = "5.5 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 155,
                        name = "Slovenia",
                        code = "SI",
                        flag = "flag_slovenia",
                        area = "20,273 km²",
                        population = "2.1 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 156,
                        name = "Solomon Islands",
                        code = "SB",
                        flag = "flag_solomon_islands",
                        area = "28,896 km²",
                        population = "741 thousand people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 157,
                        name = "Somalia",
                        code = "SO",
                        flag = "flag_somalia",
                        area = "637,657 km²",
                        population = "18 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 158,
                        name = "South Africa",
                        code = "ZA",
                        flag = "flag_south_africa",
                        area = "1.221 million km²",
                        population = "61 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 159,
                        name = "South Korea",
                        code = "KR",
                        flag = "flag_south_korea",
                        area = "100,210 km²",
                        population = "52 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 160,
                        name = "South Sudan",
                        code = "SS",
                        flag = "flag_south_sudan",
                        area = "619,745 km²",
                        population = "11 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 161,
                        name = "Spain",
                        code = "ES",
                        flag = "flag_spain",
                        area = "505,992 km²",
                        population = "47 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 162,
                        name = "Sri Lanka",
                        code = "LK",
                        flag = "flag_sri_lanka",
                        area = "65,610 km²",
                        population = "22 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 163,
                        name = "Sudan",
                        code = "SD",
                        flag = "flag_sudan",
                        area = "1.861 million km²",
                        population = "48 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 164,
                        name = "Suriname",
                        code = "SR",
                        flag = "flag_suriname",
                        area = "163,820 km²",
                        population = "0.6 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 165,
                        name = "Sweden",
                        code = "SE",
                        flag = "flag_sweden",
                        area = "450,295 km²",
                        population = "10.4 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 166,
                        name = "Switzerland",
                        code = "CH",
                        flag = "flag_switzerland",
                        area = "41,285 km²",
                        population = "8.7 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 167,
                        name = "Syria",
                        code = "SY",
                        flag = "flag_syria",
                        area = "185,180 km²",
                        population = "22 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 168,
                        name = "Taiwan",
                        code = "TW",
                        flag = "flag_taiwan",
                        area = "36,193 km²",
                        population = "23.5 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 169,
                        name = "Tajikistan",
                        code = "TJ",
                        flag = "flag_tajikistan",
                        area = "143,100 km²",
                        population = "10 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 170,
                        name = "Tanzania",
                        code = "TZ",
                        flag = "flag_tanzania",
                        area = "945,087 km²",
                        population = "63 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 171,
                        name = "Thailand",
                        code = "TH",
                        flag = "flag_thailand",
                        area = "513,120 km²",
                        population = "71 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 172,
                        name = "Timor-Leste",
                        code = "TL",
                        flag = "flag_timor_leste",
                        area = "14,874 km²",
                        population = "1.3 million people"
                    )
                )
                countryDao.insertCountry(
                    Country(
                        id = 173,
                        name = "Togo",
                        code = "TG",
                        flag = "flag_togo",
                        area = "56,785 km²",
                        population = "8.6 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 174,
                        name = "Tonga",
                        code = "TO",
                        flag = "flag_tonga",
                        area = "747 km²",
                        population = "107 thousand people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 175,
                        name = "Trinidad and Tobago",
                        code = "TT",
                        flag = "flag_trinidad_and_tobago",
                        area = "5,128 km²",
                        population = "1.4 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 176,
                        name = "Tunisia",
                        code = "TN",
                        flag = "flag_tunisia",
                        area = "163,610 km²",
                        population = "12 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 177,
                        name = "Turkey",
                        code = "TR",
                        flag = "flag_turkey",
                        area = "783,562 km²",
                        population = "87 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 178,
                        name = "Turkmenistan",
                        code = "TM",
                        flag = "flag_turkmenistan",
                        area = "488,100 km²",
                        population = "6.2 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 179,
                        name = "Tuvalu",
                        code = "TV",
                        flag = "flag_tuvalu",
                        area = "26 km²",
                        population = "12 thousand people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 180,
                        name = "Uganda",
                        code = "UG",
                        flag = "flag_uganda",
                        area = "241,038 km²",
                        population = "48 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 181,
                        name = "Ukraine",
                        code = "UA",
                        flag = "flag_ukraine",
                        area = "603,500 km²",
                        population = "44 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 182,
                        name = "United Arab Emirates",
                        code = "AE",
                        flag = "flag_united_arab_emirates",
                        area = "83,600 km²",
                        population = "9.9 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 183,
                        name = "United Kingdom",
                        code = "GB",
                        flag = "flag_united_kingdom",
                        area = "242,495 km²",
                        population = "67 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 184,
                        name = "United States",
                        code = "US",
                        flag = "flag_united_states",
                        area = "9.834 million km²",
                        population = "332 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 185,
                        name = "Uruguay",
                        code = "UY",
                        flag = "flag_uruguay",
                        area = "176,215 km²",
                        population = "3.5 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 186,
                        name = "Uzbekistan",
                        code = "UZ",
                        flag = "flag_uzbekistan",
                        area = "447,400 km²",
                        population = "36 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 187,
                        name = "Vanuatu",
                        code = "VU",
                        flag = "flag_vanuatu",
                        area = "12,189 km²",
                        population = "324 thousand people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 188,
                        name = "Vatican City",
                        code = "VA",
                        flag = "flag_vatican_city",
                        area = "0.44 km²",
                        population = "825 people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 189,
                        name = "Venezuela",
                        code = "VE",
                        flag = "flag_venezuela",
                        area = "912,050 km²",
                        population = "28 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 190,
                        name = "Vietnam",
                        code = "VN",
                        flag = "flag_vietnam",
                        area = "331,212 km²",
                        population = "99 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 191,
                        name = "Yemen",
                        code = "YE",
                        flag = "flag_yemen",
                        area = "527,968 km²",
                        population = "34 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 192,
                        name = "Zambia",
                        code = "ZM",
                        flag = "flag_zambia",
                        area = "752,618 km²",
                        population = "19 million people"
                    )
                )

                countryDao.insertCountry(
                    Country(
                        id = 193,
                        name = "Zimbabwe",
                        code = "ZW",
                        flag = "flag_zimbabwe",
                        area = "390,757 km²",
                        population = "15 million people"
                    )
                )
            }

        }
    }


}
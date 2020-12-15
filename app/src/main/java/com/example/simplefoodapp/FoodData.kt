package com.example.simplefoodapp

object FoodData {

    private val heroNames = arrayOf(
        "Gudek",
        "Soto Betawi",
        "Nasi Goreng",
        "Nasi Usuk",
        "Rawon",
        "Rendang",
        "Kerak Telor",
        "Sop Iga",
        "Sayur Asem",
        "Nasi Tumpeng")

    private val heroDetails = arrayOf(
        "Yogyakarta",
        "Jakarta",
        "_",
        "Jakarta",
        "Daerah Jawa",
        "Padang",
        "Jakarta",
        "-",
        "Daerah Jawa",
        "Daerah Jawa")

    private val heroesImages = intArrayOf(
        R.drawable.gudek,
        R.drawable.sotobetawi,
        R.drawable.nasigoreng,
        R.drawable.nasduk,
        R.drawable.rawon,
        R.drawable.rendnah,
        R.drawable.keraktelor,
        R.drawable.sopiga,
        R.drawable.sayurasem,
        R.drawable.tumpeng)

    val listData: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in heroNames.indices) {
                val hero = Food()
                hero.name = heroNames[position]
                hero.detail = heroDetails[position]
                hero.photo = heroesImages[position]
                list.add(hero)
            }
            return list
        }


}
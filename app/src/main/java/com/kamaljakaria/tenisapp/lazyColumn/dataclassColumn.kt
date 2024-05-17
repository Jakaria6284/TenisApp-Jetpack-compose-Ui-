package com.kamaljakaria.tenisapp.lazyColumn

import com.kamaljakaria.tenisapp.R

data class dataclassColumn(
    val name:String,
    val time:String,
    val image:Int
)

fun getAllDataa():List<dataclassColumn>
{
    return listOf<dataclassColumn>(

        dataclassColumn("Yoga & tenis","Feb27| 10:00-12:00", R.drawable.tenis2_t),
        dataclassColumn("Yoga & tenis","Feb27| 10:00-12:00", R.drawable.tenis3_t),
        dataclassColumn("Yoga & tenis","Feb27| 10:00-12:00", R.drawable.maritenisplayer_removebg_preview),
        dataclassColumn("Yoga & tenis","Feb27| 10:00-12:00", R.drawable.tenis2_t),
        dataclassColumn("Yoga & tenis","Feb27| 10:00-12:00", R.drawable.tenis3_t),
        dataclassColumn("Yoga & tenis","Feb27| 10:00-12:00", R.drawable.maritenisplayer_removebg_preview),

        dataclassColumn("Yoga & tenis","Feb27| 10:00-12:00", R.drawable.tenis2_t),
        dataclassColumn("Yoga & tenis","Feb27| 10:00-12:00", R.drawable.tenis3_t),
        dataclassColumn("Yoga & tenis","Feb27| 10:00-12:00", R.drawable.maritenisplayer_removebg_preview),



        )
}

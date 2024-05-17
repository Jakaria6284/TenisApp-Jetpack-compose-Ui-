package com.kamaljakaria.tenisapp.lezyRow

import com.kamaljakaria.tenisapp.R

data class lazyDataclass(
    val name:String,
    val event:String,
    val image:Int
)

fun getAllData():List<lazyDataclass>
{
    return listOf<lazyDataclass>(

        lazyDataclass("women's \nClub","2 event", R.drawable.maritenisplayer_removebg_preview),
        lazyDataclass("Men's \nClub","2 event", R.drawable.tenis2_t),
        lazyDataclass("Jakaria \nClub","2 event", R.drawable.tenis3_t),
        lazyDataclass("Ripon's \nClub","2 event", R.drawable.maritenisplayer_removebg_preview),
        lazyDataclass("women's \nClub","2 event", R.drawable.tenis2_t),
        lazyDataclass("Kamal's\n Club","2 event", R.drawable.maritenisplayer_removebg_preview),
        lazyDataclass("women's \nClub","2 event", R.drawable.tenis3_t),


    )
}

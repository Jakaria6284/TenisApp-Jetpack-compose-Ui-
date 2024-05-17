package com.kamaljakaria.tenisapp.lezyRow

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable

@Composable
fun lazyColmn()
{
    LazyRow (){

        val mylist= getAllData()
        itemsIndexed(mylist, itemContent = {index, item ->
            lazyRowItem(item=item)
        })
    }
}
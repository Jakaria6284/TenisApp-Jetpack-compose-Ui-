package com.kamaljakaria.tenisapp.lazyColumn

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable

@Composable
fun finalCoumn()
{
    LazyColumn {
        val mylist= getAllDataa()
        
        itemsIndexed(mylist, itemContent = {index, item ->  
            LAzyColumnItem(item = item)
        })
    }
}
package com.kamaljakaria.tenisapp.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import com.kamaljakaria.tenisapp.Component.welcome
import com.kamaljakaria.tenisapp.Component.welcomeTxt
import com.kamaljakaria.tenisapp.lazyColumn.finalCoumn
import com.kamaljakaria.tenisapp.lezyRow.lazyColmn
import com.kamaljakaria.tenisapp.lezyRow.lazyRowItem

@Composable
fun HomeScreen()
{
    Column(
        modifier= Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        welcome()
        welcomeTxt()
       lazyColmn()
        finalCoumn()

    }
}
package com.kamaljakaria.tenisapp.Component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun welcomeTxt()
{
    Box {
        Text(
            text = "Clubs",
            style = TextStyle(
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 28.sp,
                color = Color.Black
            ), modifier = Modifier.padding(start = 20.dp)


        )
    }
}
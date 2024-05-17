package com.kamaljakaria.tenisapp.Component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun welcome() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(start = 13.dp, top = 10.dp, end = 10.dp)
        )
        {

            IconButton(
                onClick = { /*TODO*/ }, modifier = Modifier
                    .clip(RoundedCornerShape(15.dp))
                    .background(Color.Black)


            ) {
                Icon(Icons.Filled.Menu, contentDescription = "navcon", tint = Color.White)

            }

            Spacer(
                modifier = Modifier.weight(1f)


            )

            IconButton(
                onClick = { /*TODO*/ }, modifier = Modifier
                    .clip(RoundedCornerShape(15.dp))
                    .background(Color(0x4AD6C7C7))


            ) {
                Icon(Icons.Filled.Search, contentDescription = "navcon", tint = Color.Black)

            }


        }

        Spacer(modifier = Modifier.height(15.dp))

    }
}


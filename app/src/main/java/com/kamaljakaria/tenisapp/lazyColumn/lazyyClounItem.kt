package com.kamaljakaria.tenisapp.lazyColumn

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LAzyColumnItem(item:dataclassColumn)
{

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 15.dp, bottom = 15.dp, top = 20.dp, end = 10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Box(
            modifier = Modifier
                .size(80.dp, 80.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .background(Color(0x79E6EDEE)),
            contentAlignment = Alignment.Center
        ) {
            Image(painter = painterResource(id = item.image), contentDescription ="j",
                contentScale = ContentScale.Crop
                )
        }

        Spacer(modifier = Modifier.weight(0.2f))

        Column {
            Text(
                text = "${item.name}",
                style = TextStyle(
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Normal,
                    fontSize = 18.sp,
                    color = Color.Black
                ),

            )
            Text(
                text = "${item.time}",
                style = TextStyle(
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Normal,
                    fontSize = 18.sp,
                    color = Color.Black
                ),

                )
        }
        Spacer(modifier = Modifier.weight(0.8f))

        Box (
            modifier = Modifier.clip(shape = CircleShape)
                .background(Color.Black)
                .padding(10.dp)
        ){
            Text(
                text = "$10",
                style = TextStyle(
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Normal,
                    fontSize = 18.sp,
                    color = Color.White
                ),

                )
        }

    }
}
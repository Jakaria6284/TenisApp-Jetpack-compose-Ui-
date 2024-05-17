package com.kamaljakaria.tenisapp.lezyRow

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kamaljakaria.tenisapp.R
import kotlin.random.Random


@Composable
fun lazyRowItem(item:lazyDataclass) {
    // Outer Box to control the position of the inner Box
    Box(
        modifier = Modifier

            .padding(start = 10.dp, top = 15.dp)
    ) {

        Box(
            modifier = Modifier
                .clip(shape = RoundedCornerShape(15.dp))
                .size(width = 300.dp, height = 400.dp)
                .background(randomColor()),
            contentAlignment = Alignment.Center
        ) {
            Row(
                modifier = Modifier.padding(start = 20.dp, top = 20.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        text = "${item.name}",
                        style = TextStyle(
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Medium,
                            fontSize = 28.sp,
                            color = Color.Black
                        ),
                        modifier = Modifier.padding(start = 20.dp)
                    )

                    Spacer(modifier = Modifier.height(15.dp))

                    Button(
                        onClick = { /* Your onClick logic here */ },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.White,
                            contentColor = Color.Black
                        ),
                        modifier = Modifier.height(40.dp)
                    ) {
                        Text(
                            text = "All level",
                            style = TextStyle(
                                fontStyle = FontStyle.Normal,
                                fontWeight = FontWeight.Normal,
                                fontSize = 20.sp,
                                color = Color.Black
                            ),
                            modifier = Modifier.padding(start = 20.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(180.dp))

                    Text(
                        text = "${item.event}",
                        style = TextStyle(
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Normal,
                            fontSize = 20.sp,
                            color = Color.Black
                        ),
                        modifier = Modifier.padding(start = 20.dp)
                    )
                }

                Image(
                    painter = painterResource(id = item.image),
                    contentDescription = "tennis player",
                    contentScale = ContentScale.Crop,

                )
            }
        }
    }


}

@Composable
fun randomColor(): Color {
    return Color(
        red = Random.nextFloat(),
        green = Random.nextFloat(),
        blue = Random.nextFloat(),
        alpha = 1.0f
    )
}



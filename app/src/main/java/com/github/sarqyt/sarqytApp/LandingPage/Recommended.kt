package com.github.sarqyt.sarqytApp.LandingPage

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.github.sarqyt.sarqytApp.R
import com.github.sarqyt.sarqytApp.ui.theme.color3

@Composable
fun Recommended(){
    Text(text = "Recommended", fontWeight = FontWeight.Bold, fontSize = 30.sp)
    Spacer(modifier = Modifier.height(20.dp))
    LazyRow(
        Modifier.height(400.dp),
        contentPadding = PaddingValues(horizontal = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            RecommendedItem(
                imagePainter = painterResource(id = R.drawable.grand_hotel_du_cap_ferrat),
                name = "Emeralda De Hotel",
                place = "Paris, France",
                star = 4.8,
                cost = "17.00K",
                backgroundColor = MaterialTheme.colors.primary
            )
        }
        item {
            RecommendedItem(
                imagePainter = painterResource(id = R.drawable.grand_hotel_du_cap_ferrat),
                name = "Emeralda De Hotel",
                place = "Paris, France",
                star = 5.0,
                cost = "15.00K",
                backgroundColor = MaterialTheme.colors.primary
            )
        }
        item {
            RecommendedItem(
                imagePainter = painterResource(id = R.drawable.grand_hotel_du_cap_ferrat),
                name = "Emeralda De Hotel",
                place = "Paris, France",
                star = 5.0,
                cost = "15.00K",
                backgroundColor = MaterialTheme.colors.primary
            )
        }
        item {
            RecommendedItem(
                imagePainter = painterResource(id = R.drawable.grand_hotel_du_cap_ferrat),
                name = "Emeralda De Hotel",
                place = "Paris, France",
                star = 5.0,
                cost = "15.00K",
                backgroundColor = MaterialTheme.colors.primary
            )
        }
    }
}

@Composable
fun RecommendedItem(
    name: String = "",
    place: String = "",
    star: Double = 0.0,
    cost: String = "",
    backgroundColor: Color = color3,
    imagePainter: Painter
) {
    Card(
        Modifier
            .width(300.dp)
            .clickable { },
        shape = RoundedCornerShape(30.dp),
        backgroundColor = backgroundColor,
        elevation = 10.dp
    ) {
        Image(
            painter = imagePainter, contentDescription = "",
            modifier = Modifier
                .fillMaxHeight(),
            alignment = Alignment.CenterEnd,
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .fillMaxWidth(1f)
        ) {
            Box(modifier = Modifier.padding(top = 30.dp, start = 200.dp)) {
                Row(
                    modifier = Modifier
                        .background(shape = RoundedCornerShape(16.dp), color = color3)
                        .padding(vertical = 6.dp, horizontal = 10.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.baseline_star_24),
                        contentDescription = "star"
                    )
                    Text(text = star.toString(), color = Color.White)
                }
            }
            Text(
                text = name,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 200.dp, start = 16.dp)
            )
            Text(text = place, modifier = Modifier.padding(start = 16.dp))
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)) {
                Image(painter = painterResource(id = R.drawable.baseline_tenge_white),
                    contentDescription = "Tenge",
                    Modifier
                        .size(17.dp)
                        .padding(top = 5.dp, start = 5.dp))
                Text(text = cost)
            }
        }
    }
}
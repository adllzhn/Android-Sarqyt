package com.github.sarqyt.sarqytApp.LandingPage

import androidx.compose.foundation.Image
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
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.github.sarqyt.sarqytApp.R
import com.github.sarqyt.sarqytApp.ui.theme.color2
import com.github.sarqyt.sarqytApp.ui.theme.color3

@Composable
fun HotelCard() {
    LazyRow(
        Modifier.height(300.dp),
        contentPadding = PaddingValues(horizontal = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            HotelItem(
                imagePainter = painterResource(id = R.drawable.grand_hotel_du_cap_ferrat),
                name = "Palazzo Hotel",
                city = "Almaty",
                backgroundColor = MaterialTheme.colors.primary
            )
        }
        item {
            HotelItem(
                imagePainter = painterResource(id = R.drawable.grand_hotel_du_cap_ferrat),
                name = "Palazzo Hotel",
                city = "Almaty",
                backgroundColor = MaterialTheme.colors.primary
            )
        }
        item {
            HotelItem(
                imagePainter = painterResource(id = R.drawable.grand_hotel_du_cap_ferrat),
                name = "Palazzo Hotel",
                city = "Almaty",
                backgroundColor = MaterialTheme.colors.primary
            )
        }
        item {
            HotelItem(
                imagePainter = painterResource(id = R.drawable.grand_hotel_du_cap_ferrat),
                name = "Palazzo Hotel",
                city = "Almaty",
                backgroundColor = MaterialTheme.colors.primary
            )
        }
        item {
            HotelItem(
                imagePainter = painterResource(id = R.drawable.grand_hotel_du_cap_ferrat),
                name = "Palazzo Hotel",
                city = "Almaty",
                backgroundColor = MaterialTheme.colors.primary
            )
        }
    }
}

@Composable
fun HotelItem(
    name: String = "",
    city: String = "",
    backgroundColor: Color = color2,
    imagePainter: Painter,
    starCount: Double = 4.8,
    reviews: Double = 4.56
) {
    Row(
        modifier = Modifier
            .fillMaxHeight()
            .width(350.dp)
    ) {
        Card(
            modifier = Modifier
                .width(400.dp)
                .height(120.dp)
                .fillMaxSize()
                .clickable { },
            shape = RoundedCornerShape(30.dp),
            contentColor = backgroundColor,
            elevation = 10.dp
        ) {
            Row(
                modifier = Modifier.fillMaxSize(), horizontalArrangement = Arrangement.spacedBy(
                    space = 30.dp,
                    alignment = Alignment.CenterHorizontally
                )
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxHeight(), contentAlignment = Alignment.Center
                ) {
                    Row {
                        Card(
                            modifier = Modifier
                                .size(100.dp), shape = RoundedCornerShape(30.dp)
                        ) {
                            Image(
                                painter = imagePainter, contentDescription = "",
                                modifier = Modifier, contentScale = ContentScale.Crop
                            )
                        }
                        Spacer(modifier = Modifier.width(10.dp))
                        Column(modifier = Modifier.padding(top = 15.dp)) {
                            Text(
                                text = name,
                                fontSize = 15.sp,
                                color = Color.Black,
                                fontStyle = FontStyle.Normal,
                                fontWeight = FontWeight.Bold
                            )
                            Spacer(modifier = Modifier.height(12.dp))
                            Text(text = city, color = Color.Gray)
                            Spacer(modifier = Modifier.height(12.dp))
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Image(
                                    painter = painterResource(id = R.drawable.baseline_star_rate_24),
                                    contentDescription = "",
                                    Modifier.size(10.dp)
                                )
                                Spacer(modifier = Modifier.width(5.dp))
                                Text(
                                    text = starCount.toString(),
                                    color = color3,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 10.sp
                                )
                                Spacer(modifier = Modifier.width(5.dp))
                                Text(
                                    text = "($reviews K reviews)",
                                    color = Color.Gray,
                                    fontSize = 10.sp
                                )
                            }
                        }
                    }
                }
                Spacer(
                    modifier = Modifier
                        .weight(1f)
                )
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 15.dp)
                ) {
                    Column() {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Image(
                                painter = painterResource(id = R.drawable.baseline_tenge_green),
                                contentDescription = "",
                                Modifier.size(15.dp)
                            )
                            Text(
                                text = "15.00K",
                                fontSize = 15.sp,
                                color = color3,
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Spacer(modifier = Modifier.height(20.dp))
                        Image(
                            painter = painterResource(id = R.drawable.baseline_bookmark_border_24),
                            contentDescription = "",
                            modifier = Modifier.padding(top = 10.dp, start = 40.dp).size(30.dp)
                        )
                    }
                }
            }
        }
    }
}
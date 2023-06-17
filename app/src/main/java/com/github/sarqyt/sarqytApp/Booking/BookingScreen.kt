package com.github.sarqyt.sarqytApp.Booking

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.github.sarqyt.sarqytApp.R
import com.github.sarqyt.sarqytApp.ui.theme.color3

@Composable
fun BookingScreen() {
        Column(modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(0.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start) {
            Card(
                Modifier
                    .width(300.dp)
                    .clickable { },
                shape = RoundedCornerShape(30.dp),
                backgroundColor = Color.White,
                elevation = 10.dp
            ) {
                Column(modifier = Modifier.fillMaxSize(1f)) {
                    Box(modifier = Modifier.padding(top = 30.dp, start = 40.dp)) {
                        Row(
                            modifier = Modifier
                                .background(shape = RoundedCornerShape(16.dp), color = color3)
                                .padding(vertical = 6.dp, horizontal = 10.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.baseline_arrow_back_24),
                                contentDescription = "back"
                            )
                        }
                    }
                    Image(
                        painter = painterResource(id = R.drawable.restorantgeorgia),
                        contentDescription = "Georgia restoran",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                            .clip(RoundedCornerShape(0.dp)),
                        contentScale = ContentScale.FillWidth
                    )
                }
                Row(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.baseline_location_on_24),
                        contentDescription = "Location"
                    )
                    Text(text = "Almaty, 9613 Bellevue St.Athens, GA 30605")
                }
            }
    }
}
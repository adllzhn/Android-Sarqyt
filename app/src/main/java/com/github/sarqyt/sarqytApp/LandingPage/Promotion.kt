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
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.github.sarqyt.sarqytApp.R
import com.github.sarqyt.sarqytApp.ui.theme.color2
import com.github.sarqyt.sarqytApp.ui.theme.color3

@Composable
fun Promotion() {
    Row(modifier = Modifier.fillMaxWidth()) {
        Text(text = "Promotion", fontWeight = FontWeight.Bold, fontSize = 30.sp)
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = "See all", fontSize = 20.sp,
            modifier = Modifier
                .clickable { },
            color = color3,
            textAlign = TextAlign.End
        )
    }
    Spacer(modifier = Modifier.height(20.dp))
    LazyRow(
        Modifier.height(300.dp),
        contentPadding = PaddingValues(horizontal = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            PromotionItem(
                imagePainter = painterResource(id = R.drawable.grand_hotel_du_cap_ferrat),
                name = "Emeralda De Hotel",
                backgroundColor = MaterialTheme.colors.primary
            )
        }
        item {
            PromotionItem(
                imagePainter = painterResource(id = R.drawable.grand_hotel_du_cap_ferrat),
                name = "Emeralda De Hotel",
                backgroundColor = MaterialTheme.colors.primary
            )
        }
        item {
            PromotionItem(
                imagePainter = painterResource(id = R.drawable.grand_hotel_du_cap_ferrat),
                name = "Emeralda De Hotel",
                backgroundColor = MaterialTheme.colors.primary
            )
        }
        item {
            PromotionItem(
                imagePainter = painterResource(id = R.drawable.grand_hotel_du_cap_ferrat),
                name = "Emeralda De Hotel",
                backgroundColor = MaterialTheme.colors.primary
            )
        }
        item {
            PromotionItem(
                imagePainter = painterResource(id = R.drawable.grand_hotel_du_cap_ferrat),
                name = "Emeralda De Hotel",
                backgroundColor = MaterialTheme.colors.primary
            )
        }
    }
}

@Composable
fun PromotionItem(
    name: String = "",
    backgroundColor: Color = color3,
    imagePainter: Painter
) {
    Column(modifier = Modifier
        .fillMaxHeight()
        .width(350.dp)) {
        Card(
            modifier = Modifier
                .width(400.dp)
                .height(200.dp)
                .fillMaxSize()
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
            Box(modifier = Modifier.fillMaxSize(1f), contentAlignment = Alignment.Center) {
                Text(
                    text = name, fontSize = 30.sp
                )
            }
        }
        Spacer(modifier = Modifier.height(12.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            Row {
                Image(
                    painter = painterResource(id = R.drawable.baseline_thumb_up_24),
                    contentDescription = "Like",
                    Modifier.size(25.dp)
                )
                Spacer(modifier = Modifier.width(6.dp))
                Text(text = "96%", fontSize = 18.sp)
                Spacer(modifier = Modifier.width(6.dp))
                Text(text = "(4.56K reviews)", Modifier.size(120.dp),
                    color = color2, textAlign = TextAlign.Center)
            }
            Spacer(modifier = Modifier.fillMaxWidth().weight(1f))
            Row {
                Image(
                    painter = painterResource(id = R.drawable.tenge),
                    contentDescription = "Tenge",
                    Modifier.size(16.dp).align(CenterVertically)
                )
                Spacer(modifier = Modifier.width(2.dp))
                Text("15.00 K", textAlign = TextAlign.Center)
            }
        }
    }
}
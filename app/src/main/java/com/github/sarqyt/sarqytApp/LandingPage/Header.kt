package com.github.sarqyt.sarqytApp.LandingPage

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.github.sarqyt.sarqytApp.R

@Composable
fun Header() {
    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(id = R.drawable.sarqyt_logo),
            contentDescription = "logo_Sarqyt",
            modifier = Modifier
                .padding(10.dp)
                .size(30.dp)
                .clip(RoundedCornerShape(20.dp))
        )
        Text(text = "Sarqyt", fontWeight = FontWeight.Bold, fontSize = 30.sp)
        Spacer(modifier = Modifier.weight(1f))
        Image(
            painter = painterResource(id = R.drawable.notification),
            contentDescription = "notification",
            modifier = Modifier.clickable { }
        )
        Image(
            painter = painterResource(id = R.drawable.baseline_bookmark_24),
            contentDescription = "bookmark",
            modifier = Modifier.clickable { }
        )
    }
}
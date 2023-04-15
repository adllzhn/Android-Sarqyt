package com.github.sarqyt.sarqytApp.LandingPage

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HelloUser() {
    Row(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = "Hello, Adilzhan\uD83D\uDC4F", fontWeight = FontWeight.Bold,
            fontSize = 30.sp, modifier = Modifier.padding(10.dp)
        )
    }
}
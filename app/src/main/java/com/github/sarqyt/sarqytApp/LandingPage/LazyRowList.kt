package com.github.sarqyt.sarqytApp.LandingPage

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.github.sarqyt.sarqytApp.ui.theme.color3

@Composable
fun LazyRowList() {
    val list = listOf(
        "Recommended", "Popular", "Trending", "Cost"
    )
    LazyRow(modifier = Modifier.fillMaxHeight().padding(start = 10.dp)) {
        items(items = list, itemContent = { item ->
            when (item) {
                "Recommended" -> {
                    Box(modifier = Modifier.fillMaxWidth().background(color = color3, shape = RoundedCornerShape(4.dp)).padding(horizontal = 10.dp, vertical = 10.dp)) {
                        Text(text = item, style = TextStyle(fontSize = 20.sp), color = Color.White)
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                }
                "Popular" -> {
                    Box(modifier = Modifier.fillMaxWidth().background(color = color3, shape = RoundedCornerShape(4.dp)).padding(horizontal = 10.dp, vertical = 10.dp)) {
                        Text(text = item, style = TextStyle(fontSize = 20.sp), color = Color.White)
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                }
                "Trending" -> {
                    Box(modifier = Modifier.fillMaxWidth().background(color = color3, shape = RoundedCornerShape(4.dp)).padding(horizontal = 10.dp, vertical = 10.dp)) {
                        Text(text = item, style = TextStyle(fontSize = 20.sp), color = Color.White)
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                }
                "Cost" -> {
                    Box(modifier = Modifier.fillMaxWidth().background(color = color3, shape = RoundedCornerShape(4.dp)).padding(horizontal = 10.dp, vertical = 10.dp)) {
                        Text(text = item, style = TextStyle(fontSize = 20.sp), color = Color.White)
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                }
                else -> {
                    Text(text = item, style = TextStyle(fontSize = 16.sp), color = color3)
                    Box(modifier = Modifier.fillMaxWidth().background(color = Color.White, shape = RoundedCornerShape(4.dp)).padding(horizontal = 10.dp, vertical = 10.dp)) {
                        Text(text = item, style = TextStyle(fontSize = 16.sp), color = color3)
                        Spacer(modifier = Modifier.width(10.dp))
                    }
                }
            }
        })
    }
}
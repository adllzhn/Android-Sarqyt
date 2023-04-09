package com.github.sarqyt.sarqytApp.LandingPage

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.github.sarqyt.sarqytApp.MainActivity
import com.github.sarqyt.sarqytApp.R
import com.github.sarqyt.sarqytApp.ui.theme.colorBackgroundTextField

@Composable
fun LandingPage() {
    var search by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize()) {
        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.sarqyt_logo),
                contentDescription = "logo_Sarqyt",
                modifier = Modifier
                    .padding(10.dp)
                    .size(30.dp)
                    .clip(RoundedCornerShape(20.dp))
            )
            Text(text = "Sarqyt", fontWeight = FontWeight.Medium)
            Spacer(modifier = Modifier.weight(1f))
            Image(
                painter = painterResource(id = R.drawable.notification),
                contentDescription = "notification"
            )
            Image(
                painter = painterResource(id = R.drawable.baseline_bookmark_24),
                contentDescription = "bookmark"
            )
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "Hello, Adilzhan\uD83D\uDC4F", fontWeight = FontWeight.Bold,
                fontSize = 30.sp, modifier = Modifier.padding(10.dp)
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            value = search,
            onValueChange = { search = it },
            placeholder = {
                Row(modifier = Modifier.fillMaxWidth()) {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_search_24),
                        contentDescription = "Search"
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text("Search")
                    Spacer(modifier = Modifier.weight(1f))
                    Image(
                        painter = painterResource(id = R.drawable.baseline_list_24),
                        contentDescription = "List"
                    )
                }
            },
            colors = TextFieldDefaults.textFieldColors(backgroundColor = colorBackgroundTextField)
        )
        Spacer(modifier = Modifier.height(20.dp))
        LazyRowList()
    }
}








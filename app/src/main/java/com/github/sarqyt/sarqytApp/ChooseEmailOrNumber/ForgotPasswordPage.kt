package com.github.sarqyt.sarqytApp.ChooseEmailOrNumber

import SelectableItem
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.github.sarqyt.sarqytApp.OTPview.ContentView
import com.github.sarqyt.sarqytApp.R
import com.github.sarqyt.sarqytApp.ui.theme.color1

@Composable
fun ForgotPasswordPage() {
    var selected by remember { mutableStateOf(true) }
    var selected2 by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        Image(
            painter = painterResource(id = R.drawable.the_padlock),
            contentDescription = "Podlock"
        )
        Text(text = "Select which contact details should we use to reset your password")
        Spacer(modifier = Modifier.height(16.dp))

        SelectableItem(
            selected = selected,
            title = "via SMS:",
            subtitle = "+ 7 - 777 - 77 - 77 ",
            onClick = {
                if (selected != true) {
                    selected = !selected
                    selected2 = !selected2
                }
            })
        Spacer(modifier = Modifier.height(20.dp))
        SelectableItem(
            selected = selected2,
            title = "via Email:",
            subtitle = "example@yourdomain.com",
            onClick = {
                if (selected2 != true) {
                    selected2 = !selected2
                    selected = !selected
                }
            })
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
                .align(Alignment.CenterHorizontally), onClick = {},
            colors = ButtonDefaults.buttonColors(backgroundColor = color1),
            shape = RoundedCornerShape(50)
        ) {
            Text(text = "Continue")
        }
    }
}
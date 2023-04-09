package com.github.sarqyt.sarqytApp

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.github.sarqyt.sarqytApp.ui.theme.color1

@Preview
@Composable
fun CreateYourAccount() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .verticalScroll(state = ScrollState(1))
    ) {
        Spacer(modifier = Modifier.height(70.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp)
        ) {
            Text(text = "Create Your", fontSize = 40.sp)
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp)
        ) {
            Text(text = "Account", fontSize = 40.sp)
        }
        Spacer(modifier = Modifier.height(40.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White), contentAlignment = Center
        ) {
            TextFieldViewEmail("Email")
        }
        Spacer(modifier = Modifier.height(20.dp))
        //password
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            TextFieldViewPassword(name = "Password", "password", "passwordVisibility")
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
        ) {
            val checkstate = remember {
                mutableStateOf(true)
            }
                Checkbox(checked = checkstate.value, onCheckedChange = { checkstate.value = it })
                Text(text = "Remember me")
        }
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp)
                .align(CenterHorizontally),onClick = {},
            colors = ButtonDefaults.buttonColors(backgroundColor = color1),
            shape = RoundedCornerShape(50)
        ) {
            Text(text = "Sign up")
        }
        Spacer(modifier = Modifier.height(20.dp))
        Box(modifier = Modifier.align(CenterHorizontally)) {
            Text(text = "or continue with")
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(modifier = Modifier.align(CenterHorizontally)) {
            Button(modifier = Modifier.size(50.dp), onClick = {},
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),) {
                Image(
                    painter = painterResource(id = R.drawable.facebook_logo),
                    contentDescription = "Facebook logo"
                )
            }
            Spacer(modifier = Modifier.width(20.dp))
            Button(modifier = Modifier.size(50.dp), onClick = {},
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),) {
                Image(
                    painter = painterResource(id = R.drawable.google_logo),
                    contentDescription = "Google logo"
                )
            }
            Spacer(modifier = Modifier.width(20.dp))
            Button(modifier = Modifier.size(50.dp), onClick = {},
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)) {
                Image(
                    painter = painterResource(id = R.drawable.apple_logo),
                    contentDescription = "Apple logo"
                )
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(modifier = Modifier.align(CenterHorizontally)) {
            Text(text = "Already have an account? ")
            Text(
                modifier = Modifier.clickable {}, text = "Sign in"
            )
        }
    }
}
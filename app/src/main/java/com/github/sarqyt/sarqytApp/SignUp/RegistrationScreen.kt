package com.github.sarqyt.sarqytApp

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.sarqyt.sarqytApp.ui.theme.color1
import com.github.sarqyt.sarqytApp.ui.theme.colorBackgroundTextField

@Preview(showBackground = true)
@Composable
fun RegistrationScreen() {
    // Define the registration fields
    var fullName by remember { mutableStateOf("") }
    var nickName by remember { mutableStateOf("") }
    var dateOfBirth by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var phoneNumber by rememberSaveable { mutableStateOf("") }
    var gender by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp, bottom = 40.dp)
            .verticalScroll(state = ScrollState(1)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ProfileScreen()
        OutlinedTextField(
            value = fullName,
            onValueChange = { email = it },
            placeholder = { Text("Full Name") },
            colors = TextFieldDefaults.textFieldColors(backgroundColor = colorBackgroundTextField),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = nickName,
            onValueChange = { nickName = it },
            placeholder = { Text("Nickname") },
            colors = TextFieldDefaults.textFieldColors(backgroundColor = colorBackgroundTextField),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = dateOfBirth,
            onValueChange = { dateOfBirth = it },
            placeholder = { Text("Date of Birth") },
            colors = TextFieldDefaults.textFieldColors(backgroundColor = colorBackgroundTextField),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            placeholder = { Text("Email") },
            colors = TextFieldDefaults.textFieldColors(backgroundColor = colorBackgroundTextField),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(10.dp))
        PhoneField(phoneNumber,
            mask = "+7-000-000-00-00",
            maskNumber = '0',
            onPhoneChanged = { phoneNumber = it })
        dropDownMenu()
        Spacer(modifier = Modifier.height(10.dp))
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
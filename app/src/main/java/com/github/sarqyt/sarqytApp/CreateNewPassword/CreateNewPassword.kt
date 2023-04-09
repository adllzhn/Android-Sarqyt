package com.github.sarqyt.sarqytApp.CreateNewPassword

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.github.sarqyt.sarqytApp.PopupCongratulation.CongratulationPopup
import com.github.sarqyt.sarqytApp.R
import com.github.sarqyt.sarqytApp.TextFieldViewPassword
import com.github.sarqyt.sarqytApp.ui.theme.color3

@Composable
fun CreateNewPassword() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 30.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(40.dp))
        Image(
            painter = painterResource(id = R.drawable.sheet_forgot_password),
            contentDescription = "Sheet"
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Create Your New Password", style = MaterialTheme.typography.subtitle1, modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp))
        TextFieldViewPassword(name = "New Password", "password1", "passwordVisibility1" )
        Spacer(modifier = Modifier.height(20.dp))
        TextFieldViewPassword(name = "Confirm Password", "password2", "passwordVisibility2")
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
        ) {
            val checkstate = remember {
                mutableStateOf(true)
            }
            Checkbox(checked = checkstate.value, onCheckedChange = { checkstate.value = it },
                colors = CheckboxDefaults.colors(color3))
            Text(text = "Remember me", fontWeight = FontWeight.Medium)
        }
        Spacer(modifier = Modifier.height(25.dp))
        val showPopup = remember {
            mutableStateOf(false)
        }
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 80.dp)
                .align(Alignment.CenterHorizontally), onClick = {showPopup.value = true},
            colors = ButtonDefaults.buttonColors(backgroundColor = color3),
            shape = RoundedCornerShape(50)
        ) {
            Text(text = "Continue", color = Color.White)
            if(showPopup.value)
                CongratulationPopup(onDismiss = {showPopup.value = false})
        }
    }
}
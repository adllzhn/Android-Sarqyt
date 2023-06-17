package com.github.sarqyt.sarqytApp.PopupCongratulation

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.github.sarqyt.sarqytApp.ui.theme.color3

@Composable
fun CongratulationPopup(onDismiss: () -> Unit) {
        AlertDialog(
            onDismissRequest = { onDismiss() },
            title = {
                Text(
                    text = "Condratulations!",
                    color = color3,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            },
            text = {
                Text(
                    text = "Your account is ready to use",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            },
            confirmButton = {
                Button(
                    colors = ButtonDefaults.buttonColors(backgroundColor = color3),
                    shape = RoundedCornerShape(50),
                    onClick = { onDismiss() },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 60.dp)
                ) {
                    Text(text = "Go to HomePage", color = Color.White)
                }
            }
        )
    }
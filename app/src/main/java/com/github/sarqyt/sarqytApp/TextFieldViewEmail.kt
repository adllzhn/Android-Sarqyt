package com.github.sarqyt.sarqytApp

import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
fun TextFieldViewEmail(name : String) {
    val textState = remember{ mutableStateOf("") }

    OutlinedTextField(
        value = textState.value, onValueChange = {
        textState.value = it
    },
    label = {
        Text(text = name)
    }
        )
}
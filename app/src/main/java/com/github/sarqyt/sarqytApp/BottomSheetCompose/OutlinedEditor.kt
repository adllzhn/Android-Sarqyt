package com.github.sarqyt.sarqytApp.BottomSheetCompose

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

@Composable
fun OutlinedEditor(Selected: (String) -> Unit) {
    var cityText by remember { mutableStateOf("") }
    var  showBottomSheet by remember { mutableStateOf(false) }
    var categoryText by remember { mutableStateOf("") }
    var ratingText by remember { mutableStateOf("") }

    if (showBottomSheet) {
        ListBottomSheet(
            citiesInKazakhstan,
            onCitySelected = { city ->
                cityText = city
                Selected(city)
                showBottomSheet = false
            },
            category,
            onCategorySelected = { category ->
                categoryText = category
                Selected(category)
                showBottomSheet = false
            },
            rating,
            onRatingSelected = { rating ->
                ratingText = rating
                Selected(rating)
                showBottomSheet = false
            },
            onDismissRequest = { showBottomSheet = false }
            )
    }

    OutlinedTextField(
        value = cityText,
        onValueChange = { cityText = it },
        label = { Text("Select a city") },
        leadingIcon = { Icon(Icons.Default.Search, contentDescription = "Search Icon") },
        trailingIcon = {
            IconButton(onClick = { showBottomSheet = true }) {
                Icon(Icons.Default.List, contentDescription = "Expand Icon")
            }
        },
        singleLine = true,
        modifier = Modifier.fillMaxWidth()
    )
}

val citiesInKazakhstan = listOf("Astana", "Almaty", "Shymkent", "Karaganda", "Aktobe", "Pavlodar", "Semey", "Oskemen", "Atyrau", "Kostanay")

val category = listOf("Recommended", "Top", "Trending", "5 star", "Econom")

val rating = listOf("5", "4", "3", "2", "1")
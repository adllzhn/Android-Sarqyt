package com.github.sarqyt.sarqytApp.BottomSheetCompose

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.github.sarqyt.sarqytApp.ui.theme.color3
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ListBottomSheet(
    cities: List<String>,
    onCitySelected: (String) -> Unit,
    category: List<String>,
    onCategorySelected: (String) -> Unit,
    rating: List<String>,
    onRatingSelected: (String) -> Unit,
    onDismissRequest: () -> Unit
) {
    val bottomSheetState = rememberBottomSheetState(BottomSheetValue.Collapsed)
    val scope = rememberCoroutineScope()
    var minValue by rememberSaveable { mutableStateOf("") }
    var maxValue by rememberSaveable { mutableStateOf("")}

    LaunchedEffect(Unit) {
        scope.launch { bottomSheetState.expand() }
    }

    BottomSheetScaffold(
        sheetContent = {

        },
        scaffoldState = rememberBottomSheetScaffoldState(
            bottomSheetState = bottomSheetState
        ),
        sheetBackgroundColor = MaterialTheme.colors.surface,
        sheetPeekHeight = 0.dp,
        modifier = Modifier
            .wrapContentHeight()
            .background(Color.Transparent)
            .clickable { onDismissRequest() }
    ) {

        Column(modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth()) {
            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                Text(text = "Filter Restaurant", style = typography.h6,
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(modifier = Modifier.fillMaxWidth()) {
                Text(text = "City", color = Color.Black, fontSize = 20.sp,
                    fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.weight(1f))
                Text(text = "See all", color = color3, fontSize = 15.sp,
                    fontWeight = FontWeight.Bold, modifier = Modifier.padding(15.dp))
            }
            LazyRow(
                contentPadding = PaddingValues(horizontal = 8.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp))
            {
                items(cities) { city ->
                    CityListItem(city, onCitySelected)
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(modifier = Modifier.fillMaxWidth()) {
                Text(text = "Category", color = Color.Black, fontSize = 20.sp,
                    fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.weight(1f))
                Text(text = "See all", color = color3, fontSize = 15.sp,
                    fontWeight = FontWeight.Bold, modifier = Modifier.padding(15.dp))
            }
            LazyRow(
                contentPadding = PaddingValues(horizontal = 8.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp))
            {
                items(category){category ->
                    CategoryListItem(category, onCategorySelected)
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterStart) {
                Text(
                    text = "Star Rating", color = Color.Black, fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            LazyRow(
                contentPadding = PaddingValues(horizontal = 8.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp))
            {
                items(rating) { rating ->
                    StarRating(rating, onRatingSelected)
                }
            }
        }
    }
}

@Composable
fun CityListItem(city: String, onClick: (String) -> Unit) {
    OutlinedButton(onClick = { onClick(city)}, shape = RoundedCornerShape(50)) {
        Text(text = city, color = color3)
    }
}

@Composable
fun CategoryListItem(category: String, onClick: (String) -> Unit) {
    OutlinedButton(onClick = { onClick(category)}, shape = RoundedCornerShape(50)) {
        Text(text = category, color = color3)
    }
}

@Composable
fun StarRating(rating: String, onClick: (String) -> Unit) {
    OutlinedButton(onClick = { onClick(rating)}, shape = RoundedCornerShape(50)) {
        Text(text = rating, color = color3)
    }
}
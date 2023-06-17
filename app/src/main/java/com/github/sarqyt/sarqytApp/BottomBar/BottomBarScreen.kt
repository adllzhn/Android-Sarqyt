package com.github.sarqyt.sarqytApp.BottomBar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
){
    object Home: BottomBarScreen(
        route = "home",
        title = "Home",
        icon = Icons.Default.Home
    )
    object Booking: BottomBarScreen(
        route = "booking",
        title = "Bookimg",
        icon = Icons.Default.Call
    )
    object Map: BottomBarScreen(
        route = "map",
        title = "Map",
        icon = Icons.Default.LocationOn
    )
    object Profile: BottomBarScreen(
        route = "profile",
        title = "Profile",
        icon = Icons.Default.Person
    )
}

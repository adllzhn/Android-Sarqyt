package com.github.sarqyt.sarqytApp.BottomBar

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.github.sarqyt.sarqytApp.Booking.BookingScreen
import com.github.sarqyt.sarqytApp.LandingPage.LandingPage
import com.github.sarqyt.sarqytApp.ProfileScreen
import com.github.sarqyt.sarqytApp.RegistrationScreen

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route) {
            LandingPage()
        }
        composable(route = BottomBarScreen.Booking.route) {
            BookingScreen()
        }
        composable(route = BottomBarScreen.Profile.route) {
            RegistrationScreen()
        }
    }
}
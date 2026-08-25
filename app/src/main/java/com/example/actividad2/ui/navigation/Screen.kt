package com.example.actividad2.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Medication
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.actividad2.R

sealed class Screen(val route: String) {
    object Login : Screen("login")
    object Today : Screen("today")
    object Medications : Screen("medications")
    object AddMedication : Screen("add_medication")
    object Settings : Screen("settings")
}

data class BottomNavItem(
    val screen: Screen,
    val labelRes: Int,
    val icon: ImageVector
)

val bottomNavItems = listOf(
    BottomNavItem(Screen.Today, R.string.nav_today, Icons.Filled.Home),
    BottomNavItem(Screen.Medications, R.string.nav_medications, Icons.Filled.Medication),
    BottomNavItem(Screen.AddMedication, R.string.nav_add, Icons.Filled.AddCircle),
    BottomNavItem(Screen.Settings, R.string.nav_settings, Icons.Filled.Settings)
)

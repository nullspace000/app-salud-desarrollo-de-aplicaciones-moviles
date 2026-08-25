package com.example.actividad2.ui.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.compose.runtime.getValue
import com.example.actividad2.R
import com.example.actividad2.ui.components.SereneBottomBar
import com.example.actividad2.ui.components.SereneTopBar
import com.example.actividad2.ui.components.SereneTopBarWithBack
import com.example.actividad2.ui.screens.addmedication.AddMedicationScreen
import com.example.actividad2.ui.screens.login.LoginScreen
import com.example.actividad2.ui.screens.medications.MedicationsScreen
import com.example.actividad2.ui.screens.settings.SettingsScreen
import com.example.actividad2.ui.screens.today.TodayScreen

private val routesWithChrome = setOf(
    Screen.Today.route,
    Screen.Medications.route,
    Screen.AddMedication.route,
    Screen.Settings.route
)

@Composable
fun SereneCareApp(navController: NavHostController = rememberNavController()) {
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = backStackEntry?.destination?.route
    val showChrome = currentRoute in routesWithChrome

    Scaffold(
        topBar = {
            if (currentRoute == Screen.AddMedication.route) {
                SereneTopBarWithBack(
                    title = stringResource(R.string.add_medication_top_bar_title),
                    onBack = { navController.popBackStack() }
                )
            } else if (showChrome) {
                SereneTopBar()
            }
        },
        bottomBar = {
            if (showChrome) {
                SereneBottomBar(
                    currentRoute = currentRoute,
                    onNavigate = { route ->
                        navController.navigate(route) {
                            popUpTo(Screen.Today.route) { saveState = true }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                )
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Login.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screen.Login.route) {
                LoginScreen(
                    onLoggedIn = {
                        navController.navigate(Screen.Today.route) {
                            popUpTo(Screen.Login.route) { inclusive = true }
                        }
                    }
                )
            }
            composable(Screen.Today.route) {
                TodayScreen()
            }
            composable(Screen.Medications.route) {
                MedicationsScreen(
                    onMedicationClick = { },
                    onAddNew = { navController.navigate(Screen.AddMedication.route) }
                )
            }
            composable(Screen.AddMedication.route) {
                AddMedicationScreen(onSaved = { navController.popBackStack() })
            }
            composable(Screen.Settings.route) {
                SettingsScreen()
            }
        }
    }
}

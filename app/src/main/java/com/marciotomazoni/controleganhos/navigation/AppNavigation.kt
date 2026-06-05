package com.marciotomazoni.controleganhos.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import com.marciotomazoni.controleganhos.DashboardScreen
import com.marciotomazoni.controleganhos.screens.NovoRegistroScreen

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "dashboard"
    ) {

        composable("dashboard") {

            DashboardScreen(
                onNovaCorridaClick = {
                    navController.navigate("novo_registro")
                }
            )

        }

        composable("novo_registro") {

            NovoRegistroScreen(
                onSalvar = {
                    navController.popBackStack()
                }
            )

        }

    }

}
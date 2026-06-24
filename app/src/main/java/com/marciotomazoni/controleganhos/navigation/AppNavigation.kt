package com.marciotomazoni.controleganhos.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import com.marciotomazoni.controleganhos.DashboardScreen
import com.marciotomazoni.controleganhos.screens.NovoRegistroScreen
import com.marciotomazoni.controleganhos.screens.NovaDespesaScreen

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
                    navController.navigate("nova_corrida")
                },

                onNovaDespesaClick = {
                    navController.navigate("nova_despesa")
                }

            )
        }

        composable("nova_corrida") {

            NovoRegistroScreen(
                onSalvar = {
                    navController.popBackStack()
                }
            )

        }

        composable("nova_despesa") {

            NovaDespesaScreen()

        }

    }

}
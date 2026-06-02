package com.marciotomazoni.controleganhos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.marciotomazoni.controleganhos.ui.theme.ControleGanhosTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {

            ControleGanhosTheme {

                Scaffold { paddingValues ->

                    DashboardScreen(
                        modifier = Modifier.padding(paddingValues)
                    )

                }

            }

        }

    }

}

@Composable
fun DashboardScreen(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "🚗 Controle de Ganhos",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(32.dp))

        Text("Ganhos Hoje: R$ 0,00")

        Spacer(modifier = Modifier.height(8.dp))

        Text("Gastos Hoje: R$ 0,00")

        Spacer(modifier = Modifier.height(8.dp))

        Text("Lucro Hoje: R$ 0,00")

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = { }
        ) {

            Text("Nova Corrida")

        }

    }

}
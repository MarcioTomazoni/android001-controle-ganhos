package com.marciotomazoni.controleganhos

import com.marciotomazoni.controleganhos.repository.RegistroRepository
import com.marciotomazoni.controleganhos.navigation.AppNavigation
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
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
                AppNavigation()
                }
            }
        }
    }

@Composable
fun DashboardScreen(
    modifier: Modifier = Modifier,
    onNovaCorridaClick: () -> Unit,
    onNovaDespesaClick: () -> Unit
) {

    val ganhos = RegistroRepository.registros.sumOf {
        it.ganhos
    }

    val despesas = RegistroRepository.registros.sumOf {
        it.combustivel + it.outrasDespesas
    }

    val lucro = ganhos - despesas

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

        Text("Ganhos Hoje: R$ %.2f".format(ganhos))

        Spacer(modifier = Modifier.height(8.dp))

        Text("Gastos Hoje: R$ %.2f".format(despesas))

        Spacer(modifier = Modifier.height(8.dp))

        Text("Lucro Hoje: R$ %.2f".format(lucro))

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = onNovaCorridaClick
        ) {

            Text("Registrar Dia")

        }

        Spacer(modifier = Modifier.height(12.dp))

        Button(
            onClick = onNovaDespesaClick
        ) {
            Text("Registrar Despesa")
        }

    }

}
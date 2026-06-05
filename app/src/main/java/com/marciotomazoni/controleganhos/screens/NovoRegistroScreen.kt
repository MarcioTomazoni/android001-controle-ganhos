package com.marciotomazoni.controleganhos.screens

import com.marciotomazoni.controleganhos.models.RegistroDiario
import com.marciotomazoni.controleganhos.repository.RegistroRepository
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun NovoRegistroScreen(
    onSalvar: () -> Unit
) {

    var data by remember { mutableStateOf("") }

    var kmRodados by remember { mutableStateOf("") }

    var ganhos by remember { mutableStateOf("") }

    var combustivel by remember { mutableStateOf("") }

    var outrasDespesas by remember { mutableStateOf("") }

    var observacao by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {

        Text(
            text = "🚗 Novo Registro Diário",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(24.dp))

        OutlinedTextField(
            value = data,
            onValueChange = { data = it },
            label = { Text("Data") }
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = kmRodados,
            onValueChange = { kmRodados = it },
            label = { Text("KM Rodados") }
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = ganhos,
            onValueChange = { ganhos = it },
            label = { Text("Ganhos") }
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = combustivel,
            onValueChange = { combustivel = it },
            label = { Text("Combustível") }
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = outrasDespesas,
            onValueChange = { outrasDespesas = it },
            label = { Text("Outras Despesas") }
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = observacao,
            onValueChange = { observacao = it },
            label = { Text("Observação") }
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {

                if (
                    data.isNotBlank() &&
                    kmRodados.isNotBlank() &&
                    ganhos.isNotBlank()
                ) {

                    RegistroRepository.registros.add(

                        RegistroDiario(
                            data = data,
                            kmRodados = kmRodados.toDouble(),
                            ganhos = ganhos.toDouble(),
                            combustivel = combustivel.toDoubleOrNull() ?: 0.0,
                            outrasDespesas = outrasDespesas.toDoubleOrNull() ?: 0.0,
                            observacao = observacao
                        )

                    )

                    onSalvar()

                    println(RegistroRepository.registros)

                }

            }
        ) {
            Text("Salvar")
        }

    }

}
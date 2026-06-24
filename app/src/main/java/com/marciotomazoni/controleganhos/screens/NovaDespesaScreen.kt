package com.marciotomazoni.controleganhos.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun NovaDespesaScreen() {

    var categoria by remember { mutableStateOf("") }

    var valor by remember { mutableStateOf("") }

    var observacao by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {

        Text(
            text = "💰 Nova Despesa",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(24.dp))

        OutlinedTextField(
            value = categoria,
            onValueChange = { categoria = it },
            label = { Text("Categoria") }
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = valor,
            onValueChange = { valor = it },
            label = { Text("Valor") }
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = observacao,
            onValueChange = { observacao = it },
            label = { Text("Observação") }
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = { }
        ) {
            Text("Salvar")
        }

    }

}
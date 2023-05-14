package com.example.greetingcard

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.text.input.*
import androidx.compose.ui.tooling.preview.*
import androidx.compose.ui.unit.*

@Composable
fun Facturacion1() {
    var name by remember { mutableStateOf("") }
    var num by remember { mutableStateOf("") }
    var dire by remember { mutableStateOf("") }
    var refe by remember { mutableStateOf("") }
    var hora by remember { mutableStateOf("") }
    Text(
        text = "1.",
        style = MaterialTheme.typography.h5,
        modifier = Modifier.padding(16.dp)
    )

    TextField(
    value = name,
    onValueChange = { name = it },
    label = { Text("Ingrese un texto") },
    modifier = Modifier
    .fillMaxWidth()
    .padding(16.dp)
    )

    TextField(
        value = num,
        onValueChange = { num = it },
        label = { Text("Ingrese un texto") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    )

    TextField(
        value = dire,
        onValueChange = { dire = it },
        label = { Text("Ingrese un texto") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    )

    TextField(
        value = refe,
        onValueChange = { refe = it },
        label = { Text("Ingrese un texto") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    )

    TextField(
        value = hora,
        onValueChange = { hora = it },
        label = { Text("Ingrese un texto") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    )




}
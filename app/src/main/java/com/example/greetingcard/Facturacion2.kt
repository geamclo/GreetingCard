package com.example.greetingcard

import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.*
import androidx.compose.material.*

enum class Gender {
    MALE, FEMALE
}

@Composable
fun Facturacion2 (selectedGender: Gender?, onGenderSelected: (Gender) -> Unit) {
    Text(
        text = "1.",
        style = MaterialTheme.typography.h5,
        modifier = Modifier.padding(16.dp)
    )
    Column {
        Text(
            text = "Seleccione su género:",
            style = MaterialTheme.typography.subtitle1,
            modifier = Modifier.padding(16.dp)
        )
        Row {
            RadioButton(
                selected = selectedGender == Gender.MALE,
                onClick = { onGenderSelected(Gender.MALE) },
                modifier = Modifier.padding(16.dp)
            )
            Text(
                text = "Masculino",
                style = MaterialTheme.typography.body1,
                modifier = Modifier.padding(vertical = 16.dp)
            )
        }
        Row {
            RadioButton(
                selected = selectedGender == Gender.FEMALE,
                onClick = { onGenderSelected(Gender.FEMALE) },
                modifier = Modifier.padding(16.dp)
            )
            Text(
                text = "Femenino",
                style = MaterialTheme.typography.body1,
                modifier = Modifier.padding(vertical = 16.dp)
            )
        }
    }
}

package com.example.greetingcard

import androidx.compose.ui.text.input.TransformedText

sealed class  Pantallas (val route: String){
    object Splashscreen: Pantallas("splash_screen")
    object Pantallaprincipal: Pantallas("pantalla_principal")
    object Login: Pantallas("login")
}
package com.example.greetingcard
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun Navegacion(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Pantallas.Splashscreen.route
    ){
        composable(Pantallas.Splashscreen.route){
            Splashscreen(navController = navController)
        }
        composable(Pantallas.Pantallaprincipal.route){
            Pantallaprincipal(navController = navController)
        }
        composable(Pantallas.Login.route){
            Login()
        }

    }
}

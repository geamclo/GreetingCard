package com.example.greetingcard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.OutlinedButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController



@Composable
fun Pantallaprincipal(navController: NavController){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(50.dp)
    ){
        Box(
            modifier = Modifier.background(Color.White),
            contentAlignment = Alignment.TopCenter
        ){
            Image(
                modifier = Modifier
                    .height(170.dp)
                    .width(380.dp),
                painter = painterResource(id = R.drawable.logotipo) ,
                contentDescription = "Mascotas",
                contentScale = ContentScale.Fit
            )
        }
        Spacer(modifier = Modifier.padding(1.dp))
        Text(
            text="Inicio de sesión",
            color= Color.Gray,
            fontSize = 25.sp
        )
        Column(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxSize()
                .wrapContentSize(Alignment.Center)
        ) {
            var text by remember {
                mutableStateOf("")
            }
            val password by remember {
                mutableStateOf("")
            }
            Text("Corre electronico", fontSize = 15.sp)
            Spacer(modifier = Modifier.padding(2.dp))
            OutlinedTextField(value = text, onValueChange = {text=it},
                placeholder = { Text(text = "Ingrese")}
            )
            Spacer(modifier = Modifier.padding(5.dp))
            Text("Contraseña", fontSize = 15.sp)
            Spacer(modifier = Modifier.padding(2.dp))
            OutlinedTextField(value = password, onValueChange = {text=it},
                placeholder = { Text(text = "Ingrese")}
            )
            Spacer(modifier = Modifier.padding(3.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
               ) {
                Button(onClick = { navController.navigate("Login") }) {
                    Text("Iniciar Sesión")
                }
                Spacer(modifier = Modifier.padding(2.dp))
                Spacer(modifier = Modifier.width(13.dp))
                Text("Iniciar Sesión con", fontSize = 16.sp)
                Spacer(modifier = Modifier.padding(2.dp))
                Row(){
                    OutlinedButton(onClick = { /*TODO*/ }) {
                        Text(text = "Facebook")
                    }
                    Spacer(modifier = Modifier.padding(4.dp))
                    OutlinedButton(onClick = { /*TODO*/ }) {
                        Text(text = "Google")
                    }
                }
                Spacer(modifier = Modifier.padding(4.dp))

                Row(){
                    Text("¿No tienes cuenta?", color = Color.Black,
                        fontSize = 15.sp)
                    Text("Registrarse",
                        color = Color.Blue,
                        fontSize = 15.sp,
                    )
                }
                Spacer(modifier = Modifier.padding(3.dp))
                Text(" ¿Olvidaste tu contraseña?",  fontSize = 15.sp, textAlign = TextAlign.Center)
            }
        }
    }
}






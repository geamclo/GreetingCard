package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greetingcard.ui.theme.GreetingCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Navegacion()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Surface(color = Color.White) {
        Text(text = "Hi, my name is $name!", modifier = Modifier.padding(24.dp))
    }
}
@Composable
fun Greeting2(name : String) {
    Text(text = "Hola $name")
}

@Composable
fun Greeting3(name : String) {
    Text(text = "Hola $name")
}

@Composable
fun Greeting4(name : String) {
    Text(text = "Hola $name")
}

@Composable
fun Greeting55(name : String) {
    Text(text = "Hola $name")
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GreetingCardTheme {
        Greeting("Geam")
        Greeting2("Maeg")
        Greeting3( "no calle")
        Greeting55(   "crespo")
        Greeting4( "cambios")
    }
}

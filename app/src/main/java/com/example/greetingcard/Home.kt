package com.example.greetingcard

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kotlinx.coroutines.delay

@Composable
fun Home() {

    val context = LocalContext.current
    var showMenu by remember {
        mutableStateOf(false)
    }



    TopAppBar(
        title = { Text(text = "MyTitle") },

        navigationIcon = {
            IconButton(onClick = { Toast.makeText(context, "Menu", Toast.LENGTH_SHORT).show() }) {
                Icon(Icons.Default.Menu, "Menu")
            }
        },
        actions = {
            IconButton(onClick = { Toast.makeText(context, "Menu", Toast.LENGTH_SHORT).show() }) {
                Icon(Icons.Default.Search, "Menu")
            }
            IconButton(onClick = { Toast.makeText(context, "Menu", Toast.LENGTH_SHORT).show() }) {
                Icon(Icons.Default.ShoppingCart, "Menu")
            }
            IconButton(onClick = { showMenu = !showMenu }) {
                Icon(Icons.Default.Settings, "Mas opciones")
            }
            DropdownMenu(
                expanded = showMenu,
                onDismissRequest = { showMenu = false },
                modifier = Modifier.width(150.dp)
            ) {
                DropdownMenuItem(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Filled.Person,
                        contentDescription = "OJALA"
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text("IDIOMA")

                }
                DropdownMenuItem(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Filled.Home,
                        contentDescription = "Home"
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text("Home")
                }
            }
        }


    )


    Card(modifier = Modifier
        .padding(100.dp)
        .clickable {}
        .fillMaxWidth(),
        elevation = 10.dp,
        shape = RoundedCornerShape(8.dp)
    ) {
        Column() {
            Image(painter = painterResource(id = R.drawable.logotipo), contentDescription = "DOS" ,
                modifier = Modifier
                    .padding(3.dp)
            )
            Column(modifier = Modifier
                .padding(1.dp)) {
                Text("CUIDADO",
                    style = MaterialTheme.typography.h3,
                    modifier = Modifier.padding(bottom = 2.dp),
                    textAlign = TextAlign.Center)
                Text("CUIDADO",
                    style = MaterialTheme.typography.h5,)
            }

        }


    }
}
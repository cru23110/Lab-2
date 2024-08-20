package com.example.lab2juancruz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lab2juancruz.ui.theme.Lab2JuanCruzTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab2JuanCruzTheme {
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
    var counter by remember { mutableIntStateOf(0) }

    // Pantalla principal con un botón y un contador
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Has presionado el botón $counter veces")

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            // Incrementar el contador cuando se presiona el botón
            counter++
        }) {
            Text("Presióname")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Lab2JuanCruzTheme {
        MyApp()
    }
}

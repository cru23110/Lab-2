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
    // `counter` es una variable que guarda el número de veces que se ha presionado el botón
    var counter by remember { mutableIntStateOf(0) }

    // Column organiza los elementos verticalmente
    Column(
        modifier = Modifier.fillMaxSize(), // Hace que la columna ocupe todo el espacio disponible
        horizontalAlignment = Alignment.CenterHorizontally, // Alinea el contenido horizontalmente al centro
        verticalArrangement = Arrangement.Center // Alinea el contenido verticalmente al centro
    ) {
        // Muestra el texto que indica cuántas veces se ha presionado el botón
        Text(text = "Has presionado el botón $counter veces")

        // Añade un espacio de 16dp entre el texto y el botón
        Spacer(modifier = Modifier.height(16.dp))

        // Botón que incrementa el contador cuando se presiona
        Button(onClick = {
            counter++ // Incrementa el contador
        }) {
            Text("Presióname") // Texto que se muestra en el botón
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

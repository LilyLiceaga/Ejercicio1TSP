package com.example.ejercicio1tsp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ejercicio1tsp.ui.theme.Ejercicio1TSPTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ejercicio1TSPTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CourseCertificate("Lily")
                }
            }
        }
    }
}

@Composable
fun CourseCertificate(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.Center
    ){
        Box(
        ){
            Image(
                painter =
                painterResource(id = R.drawable.escudounam_azul),
                contentDescription = null

            )
            Text(
                text = "Universidad Nacional Autónoma de México",
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = modifier
            )
            Image(
                painter =
                painterResource(id = R.drawable.escudofi_azul),
                contentDescription = null)
                modifier = modifier
                horizontalArrangement = Arrangement.Horizontal
        }
        Text(
            text = "This certificate is presented to: ",
        )

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Ejercicio1TSPTheme {
        CourseCertificate("Lily")
    }
}
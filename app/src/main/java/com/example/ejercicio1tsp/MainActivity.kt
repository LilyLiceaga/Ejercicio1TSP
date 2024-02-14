package com.example.ejercicio1tsp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.geometry.Size
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
                    CourseCertificate("Liliana Liceaga Sanchez", 15, "Big Data")
                }
            }
        }
    }
}

@Composable
fun CourseCertificate(name: String, number: Int, course: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            //.fillMaxSize()
            .padding(25.dp)
    ){

        Box{
            Row(
                modifier = modifier.padding(35.dp, 0.dp)
            ){
                Image(
                    painter =
                    painterResource(id = R.drawable.escudounam_azul),
                    contentDescription = null,
                    modifier = modifier
                        .size(50.dp, 50.dp)
                        .align(Alignment.CenterVertically)
                )
                Text(
                    text = "UNAM",
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                        .align(Alignment.CenterVertically)
                        .padding(30.dp, 0.dp)
                )
                Image(
                    painter =
                    painterResource(id = R.drawable.escudofi_azul),
                    contentDescription = null,
                    modifier = modifier
                        .size(50.dp, 50.dp)
                        .align(Alignment.CenterVertically)
                )
            }
        }
        Box{
            Image(
                painter =
                painterResource(id = R.drawable.escudounam_azul),
                contentDescription = null,
                modifier = modifier
                    .fillMaxWidth()
                    .padding(0.dp,5.dp,0.dp,0.dp),
                alpha = 0.3f
            )
            Column (
                modifier = modifier
                    .fillMaxWidth()
            ){
                Text(
                    text = "This certificate is presented to",
                    textAlign = TextAlign.Center,
                    fontSize = 13.sp,
                    modifier = modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(0.dp, 12.dp, 0.dp, 0.dp)
                )
                Text(
                    text = name,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp,
                    modifier = modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(0.dp, 12.dp, 0.dp, 0.dp)
                )
                Text(
                    text = "has completed a $number hour course on",
                    textAlign = TextAlign.Center,
                    fontSize = 13.sp,
                    modifier = modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(0.dp, 12.dp, 0.dp, 0.dp)
                )
                Text(
                    text = course,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 20.sp,
                    modifier = modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(0.dp, 12.dp, 0.dp, 0.dp)
                )
            }
        }
        Row{
            Spacer(
                modifier = Modifier.width(20.dp)
            )
            Image(
                painter =
                painterResource(id = R.drawable.firma1_e1_tsp),
                contentDescription = null,
                modifier = modifier
                    .size(100.dp,75.dp)
            )
            Spacer(
                modifier = Modifier.width(100.dp)
            )
            Image(
                painter =
                painterResource(id = R.drawable.firma2_e1_tsp),
                contentDescription = null,
                modifier = modifier
                    .size(100.dp, 75.dp)
            )
        }
        Row{
            Spacer(
                modifier = Modifier.width(20.dp)
            )
            Text(
                text = "Victor Molina Estevez",
                fontSize = 9.sp
                )
            
            Spacer(modifier = Modifier.width(100.dp))
            Text(
                text = "Adrian Delgado Patiño",
                fontSize = 9.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Ejercicio1TSPTheme {
        CourseCertificate("Liliana Liceaga Sánchez", 15, "Machine Learning")
    }
}
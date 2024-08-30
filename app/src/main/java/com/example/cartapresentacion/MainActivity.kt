package com.example.cartapresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column


import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartapresentacion.ui.theme.CartaPresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartaPresentacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize()
                    ,
                    color = MaterialTheme.colorScheme.background,

                ) {
                    Greeting("Manuel Vizcardo","Carta presentacion")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String,tittle:String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.android_logo)
    Box(modifier = Modifier.padding(100.dp),
        contentAlignment = Alignment.Center


    ){
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,


        ) {

            Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(190.dp, 190.dp)
                    .align(Alignment.CenterHorizontally).
                background(color = Color(0xFF7F8891)
                ),



            )
            Text(
                text = name,
                fontSize = 35.sp,
                lineHeight = 50.sp,
                textAlign = TextAlign.Center ,
                modifier = Modifier

                    .align(alignment = Alignment.CenterHorizontally),


            )
            Text(
                text = tittle,
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(3.dp)
                    .align(alignment = Alignment.CenterHorizontally),
                color = Color(0xFF33AC2F)
            )

        }

    }
    PersonalData(number = "+51 910 181 867", email =
    "manuel.vizcardo@unmsm.edu.pe", dev_ ="Android Developer" ,modifier=Modifier)
}
@Composable
fun PersonalData(number:String , email:String, dev_:String,modifier: Modifier){
    Box(modifier = Modifier.
        padding(top = 300.dp)
            .padding(horizontal = 100.dp)
        ,
        contentAlignment = Alignment.Center,



    ) {
    Column (modifier=Modifier.padding(top = 340.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,){
        Text(
            text = number,
            fontSize = 12.sp,
            modifier = Modifier
                .padding(3.dp)
                .align(alignment = Alignment.CenterHorizontally),
            color = Color(0xFF4D65C4)
        )
        Text(
            text = email,
            fontSize = 12.sp,
            modifier = Modifier
                .padding(3.dp)
                .align(alignment = Alignment.CenterHorizontally),
            color = Color(0xFF4D65C4)
        )
        Text(
            text = dev_,
            fontSize = 12.sp,
            modifier = Modifier
                .padding(3.dp)
                .align(alignment = Alignment.CenterHorizontally),
            color = Color(0xFF4D65C4)
        )
    }
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CartaPresentacionTheme {

        Greeting("Manuel Vizcardo","App Card")

    }
}
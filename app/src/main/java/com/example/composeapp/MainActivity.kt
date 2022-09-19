package com.example.composeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeapp.ui.theme.ComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        MyImage()
                        MyText()
                        emoji()
                        Text(text = "Jetpack Compose"
                        ,Modifier.padding(10.dp),
                        fontSize = 30.sp,
                        fontWeight = FontWeight.SemiBold
                        )

                    }
                }
            }
        }
    }
}
@Composable
fun MyText()
{
    Text(
        text="Priyanshu Prasad",
        Modifier.padding(10.dp),
       color = Color.Blue,
        fontSize = 22.sp,
        fontWeight = FontWeight.SemiBold

    )
}
@Composable
fun emoji()
{
    Image(painter = painterResource(id = R.drawable.newimage), contentDescription ="Emoji" ,
    modifier = Modifier
        .padding(20.dp)
        .width(150.dp)
        .height(150.dp))
}
@Composable
fun MyImage()
{
    Image(painter = painterResource(id = R.drawable.download),
        contentDescription ="Jetpack logo",
        modifier = Modifier
            .padding(20.dp)
            .width(400.dp)
            .height(400.dp)

    )
}
@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true,
widthDp=390,
heightDp = 800

)
@Composable
fun DefaultPreview() {
    ComposeAppTheme {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            MyImage()
            MyText()
            emoji()
            Text(text = "Jetpack Compose"
                ,Modifier.padding(10.dp),
                fontSize = 30.sp,
                fontWeight = FontWeight.SemiBold)
        }

    }
}
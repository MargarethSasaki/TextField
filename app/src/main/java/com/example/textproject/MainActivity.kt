package com.example.textproject
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.textproject.ui.theme.TextProjectTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            textfield()
            ScreenContent()
        }


    }
}
@Composable
fun textfield(){
    var txtf by remember {
        mutableStateOf("")
    }
    TextField(value = txtf, onValueChange = {txtf = it},
        modifier = Modifier.fillMaxWidth().background(Color(191, 168, 233, 255)),
        placeholder = {Text(text = "Digite seu nome:")}

    )
    textfield()
}

@Composable
fun ScreenContent(){
    Box (modifier = Modifier
        .fillMaxSize()
        .background(Color(191, 168, 233, 255))){


    }


}




@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TextProjectTheme {
        textfield()
        ScreenContent()
    }
}
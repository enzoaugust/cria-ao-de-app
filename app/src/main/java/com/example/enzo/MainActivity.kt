package com.example.enzo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.enzo.ui.theme.EnzoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EnzoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Blue
                ) {
                    PlanoDeFundo()
                }
            }
        }
    }
}

@Composable
fun PlanoDeFundo(){
    Image(
        painter = painterResource(id = R.drawable.androidparty),
        contentDescription = null,
        contentScale = ContentScale.Crop

    )
Cabecalho(
    nomeCompleto = "Enzo Augusto",
    cargo = "aluno"
)

}
@Composable
fun Cabecalho(nomeCompleto:String,cargo:String,modifier:Modifier=Modifier) {


    Column() {
        Text(
            text = nomeCompleto,
            modifier = modifier
        )
        Text(
            text = cargo,
            modifier = modifier
        )
    }


}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    EnzoTheme {
        PlanoDeFundo()
    }
}
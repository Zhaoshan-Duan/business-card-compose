package com.example.business_card_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.business_card_compose.ui.theme.BusinesscardcomposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinesscardcomposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NameCard(
                        image = painterResource(R.drawable.img_20220508_213707),
                        name = stringResource(R.string.name_string),
                        title = stringResource(R.string.title_string)
                    )
                }
            }
        }
    }
}

@Composable
private fun NameCard(image: Painter, name: String, title: String, modifier: Modifier = Modifier) {
    Column(
       verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            image,
            contentDescription = null
        )
        Text(
            text = name

        )
        Text(
            text = title
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinesscardcomposeTheme {
        NameCard(
           image = painterResource(R.drawable.img_20220508_213707),
            name = stringResource(R.string.name_string),
            title = stringResource(R.string.title_string)
        )
    }
}
package com.example.gitnore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite

import androidx.compose.material.icons.filled.Place

import androidx.compose.material3.Icon

import androidx.compose.material3.NavigationRail
import androidx.compose.material3.NavigationRailItem


import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import com.example.gitnore.ui.theme.GitnoreTheme
import java.lang.reflect.Modifier

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GitnoreTheme {
                 NavigationRailControl()


            }
        }
    }
}

@Composable
fun NavigationRailControl() {
    NavigationRail(
        contentColor = Color.Gray
    ) {
        NavigationRailItem(
            selected = true,
            onClick = { /* Handle click */ },
            label = { Text("Favorites", color = Color.Black) },
            icon = {
                Icon(
                    Icons.Filled.Favorite,
                    contentDescription = "Favorites",
                    tint = Color.Red
                )
            }
        )
        NavigationRailItem(
            selected = false,
            onClick = { /* Handle click */ },
            label = { Text("Places", color = Color.Gray) },
            icon = {
                Icon(
                    Icons.Filled.Place,
                    contentDescription = "Places",
                    tint = Color.Gray
                )
            }
        )
    }
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NavigationRailControl()
}
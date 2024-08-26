package com.example.gitnore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Snackbar

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

import androidx.compose.ui.tooling.preview.Preview

import com.example.gitnore.ui.theme.GitnoreTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GitnoreTheme {
                 SnackbarControl()


            }
        }
    }
}

@Composable
fun SnackbarControl() {
    var showSnackbar by remember { mutableStateOf(false) }
    Button(onClick = { showSnackbar = true }) {
        Text("Snackbar")
    }
    if (showSnackbar) {
        Snackbar(
            action = {
                Button(onClick = { showSnackbar = false }) {
                    Text("Dismiss")
                }
            }
        ) { Text("This is a Snackbar.") }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SnackbarControl()
}
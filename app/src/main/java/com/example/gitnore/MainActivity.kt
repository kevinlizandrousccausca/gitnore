package com.example.gitnore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gitnore.ui.theme.GitnoreTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GitnoreTheme {
                ScaffoldExample()


            }
        }
    }
}

@Composable
fun ScaffoldExample() {
    Scaffold(
        topBar = {
            Text("Top Bar", modifier = Modifier.padding(16.dp))
        }
    ) { paddingValues ->
        Text("Content", modifier = Modifier.padding(paddingValues))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ScaffoldExample()
}
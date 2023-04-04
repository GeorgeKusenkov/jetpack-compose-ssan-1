package com.example.jetpack_compose_ssan_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpack_compose_ssan_1.ui.theme.Jetpackcomposessan1Theme
import com.example.jetpack_compose_ssan_1.ui.theme.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jetpackcomposessan1Theme {
                Row(
                    modifier = Modifier
                        .height(500.dp)
                        .width(500.dp)
                        .background(Color.LightGray),
                    horizontalArrangement = Arrangement.Start,
                ) {
                    CustomItem(weight = 3f, color = MaterialTheme.colorScheme.secondary)
                    CustomItem(weight = 1f)
                }
            }
        }
    }
}

@Composable
fun RowScope.CustomItem(weight: Float, color: Color = MaterialTheme.colorScheme.primary) {
    Surface(
        modifier = Modifier
            .width(50.dp)
            .height(100.dp)
            .weight(weight),
        color = color) {

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Jetpackcomposessan1Theme {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            CustomItem(weight = 3f, color = MaterialTheme.colorScheme.secondary)
            CustomItem(weight = 1f)
        }
    }
}
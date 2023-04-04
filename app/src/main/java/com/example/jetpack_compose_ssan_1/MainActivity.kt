package com.example.jetpack_compose_ssan_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack_compose_ssan_1.ui.theme.Jetpackcomposessan1Theme
import com.example.jetpack_compose_ssan_1.ui.theme.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jetpackcomposessan1Theme {

                    Column(modifier = Modifier.fillMaxSize()) {
                        Text(
                            text = stringResource(id = R.string.app_name),
                            modifier = Modifier
                                .background(MaterialTheme.colorScheme.primary)
                                .padding(16.dp)
                        )
                    }

            }
        }
    }
}

@Composable
fun Greeting() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .background(Color.Blue),
            contentAlignment = Alignment.Center
//                .width(100.dp)
//                .height(100.dp)
//                .verticalScroll(rememberScrollState())
        ) {
            Box(modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .background(Color.Green))
            Text(text = "I love Android", fontSize = 60.sp)
        }
    }
}

@Composable
fun CustomText(){
    Text(
        text = stringResource(id = R.string.app_name),
        modifier = Modifier
            //Важно знать, что от последовательности зависит как закрасится элемент
            //Если паддинг поставить вперед, то отступы не закрасятся
            .background(MaterialTheme.colorScheme.primary)
            .padding(16.dp)
            .width(300.dp),
        color = Color.White,
        fontSize = MaterialTheme.typography.bodyLarge.fontSize,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Black,
        textAlign = TextAlign.End
    )
}

@Composable
fun CustomText2() {
    Text(
        buildAnnotatedString {
            withStyle(style = ParagraphStyle(textAlign = TextAlign.Center)) {
                withStyle(style = SpanStyle(
                    color = MaterialTheme.colorScheme.primary,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Black
                )) {
                    append("A")
                }
                append("B")
                append("C")
                append("D")
            }

        }, modifier = Modifier.width(200.dp)
    )
}

@Composable
fun CustomText3() {
    Text(text = "Hello world".repeat(20), maxLines = 2, overflow = TextOverflow.Ellipsis)
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Jetpackcomposessan1Theme {
        Column(modifier = Modifier.fillMaxSize()) {
            CustomText3()
        }
    }
}
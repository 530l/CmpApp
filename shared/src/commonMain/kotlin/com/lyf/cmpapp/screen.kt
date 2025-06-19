package com.lyf.cmpapp

// shared/src/commonMain/kotlin/com/example/shared/Greeting.kt
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

/**
 * HelloCmp 这个页面可以共享给 ios，android
 */
@Composable
fun HelloCmp(name: String) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Hello, $name!",
            style = TextStyle(fontSize = 24.sp)
        )
    }
}

package com.medium

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        state = WindowState(width = 400.dp, height = 300.dp),
        title = "Medium"
    ) {
        Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
            Text(
                text = "Hello World",
                fontSize = 30.sp,
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }
}

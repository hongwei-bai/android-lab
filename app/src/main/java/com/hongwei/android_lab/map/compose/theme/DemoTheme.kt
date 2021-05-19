package com.hongwei.android_lab.map.compose.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun DemoTheme(
    colors: Colors = MaterialTheme.colors,
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = colors,
        typography = DemoTypography,
        shapes = MaterialTheme.shapes,
        content = content
    )
}

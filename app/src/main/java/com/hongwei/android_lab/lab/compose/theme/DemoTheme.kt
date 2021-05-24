package com.hongwei.android_lab.lab.compose.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun DemoTheme(
    themeId: ThemeId,
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    when (themeId) {
        ThemeId.Horror -> MaterialTheme(
            colors = if (darkTheme) darkColors(
                primary = HorrorDarkPurple,
                onPrimary = HorrorRed,
                secondary = HorrorDarkPurple,
                onSecondary = HorrorRed,
                background = Color.Black,
                onBackground = HorrorRed,
                surface = HorrorLightPurple
            ) else lightColors(
                primary = HorrorDarkPurple,
                onPrimary = HorrorRed,
                secondary = HorrorPurple,
                onSecondary = HorrorRed,
                background = HorrorLightPurple,
                onBackground = HorrorPurple,
                surface = HorrorLightPurple
            ),
            typography = DemoHorrorTypography,
            shapes = MaterialTheme.shapes,
            content = content
        )
        ThemeId.Happy -> MaterialTheme(
            colors = if (darkTheme) darkColors(
                primary = HappyPurple,
                onPrimary = Color.White,
                secondary = Color.Black,
                onSecondary = HappyCyan,
                background = HappyOrange,
                surface = HappyOrange
            ) else lightColors(
                primary = HappyOrange,
                onPrimary = Color.White,
                secondary = HappyCyan,
                onSecondary = Color.Black,
                background = HappyYellow,
                surface = HappyYellow
            ),
            typography = DemoHappyTypography,
            shapes = MaterialTheme.shapes,
            content = content
        )
        ThemeId.Demo -> MaterialTheme(
            colors = if (darkTheme) darkColors(
                primary = Color.Black,
                onPrimary = Color.Yellow,
                secondary = Color.Black,
                onSecondary = Color.Yellow,
                background = Grey80
            ) else lightColors(
                primary = Color.White,
                onPrimary = Color.Black,
                secondary = Color.White,
                onSecondary = Color.Black,
                background = Grey05
            ),
            typography = DemoTypography,
            shapes = MaterialTheme.shapes,
            content = content
        )
        else -> MaterialTheme(
            colors = if (darkTheme) darkColors() else lightColors(),
            typography = MaterialTheme.typography,
            shapes = MaterialTheme.shapes,
            content = content
        )
    }
}

enum class ThemeId {
    Default, Demo, Horror, Happy
}

package com.hongwei.android_lab.lab.compose.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.hongwei.android_lab.R

val DemoTypography = Typography(
    defaultFontFamily = FontFamily.SansSerif,

    h1 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    ),
    h2 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp
    ),
    h3 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),
    h4 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp
    ),
    h5 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp
    ),
    h6 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp
    ),
    subtitle1 = TextStyle(
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp
    ),
    subtitle2 = TextStyle(
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp
    ),
    body1 = TextStyle(
        fontWeight = FontWeight.Light,
        fontSize = 16.sp
    ),
    body2 = TextStyle(
        fontWeight = FontWeight.Light,
        fontSize = 14.sp
    ),
    button = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 13.sp
    ),
    overline = TextStyle(
        fontWeight = FontWeight.Light,
        fontSize = 12.sp
    )
)

val DemoHorrorTypography = Typography(
    defaultFontFamily = FontFamily(Font(R.font.creepster, FontWeight.Light)),

    h5 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 19.sp
    ),
    h6 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 17.sp
    ),
    body1 = TextStyle(
        fontWeight = FontWeight.Light,
        fontSize = 19.sp
    ),
    body2 = TextStyle(
        fontWeight = FontWeight.Light,
        fontSize = 17.sp
    )
)

val DemoHappyTypography = Typography(
    defaultFontFamily = FontFamily(Font(R.font.chelsea_market, FontWeight.Light)),

    h5 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp
    ),
    h6 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp
    ),
    body1 = TextStyle(
        fontWeight = FontWeight.Light,
        fontSize = 16.sp
    ),
    body2 = TextStyle(
        fontWeight = FontWeight.Light,
        fontSize = 14.sp
    )
)
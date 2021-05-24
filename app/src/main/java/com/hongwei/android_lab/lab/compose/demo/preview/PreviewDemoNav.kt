package com.hongwei.android_lab.lab.compose.demo.preview

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController


@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
fun GreetingsStudent(navController: NavController? = null) {
    Text(text = "Hello NavController!")
}
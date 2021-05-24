package com.hongwei.android_lab.lab.compose.demo.preview

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider


@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
fun Greetings(@PreviewParameter(DemoNamesProvider::class) name: String) {
    Text(text = "Hello $name!")
}

class DemoNamesProvider : PreviewParameterProvider<String> {
    override val values = listOf("Hongwei").asSequence()
    override val count: Int = values.count()
}
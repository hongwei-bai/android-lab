package com.hongwei.android_lab.lab.compose.demo.preview

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider


//@Preview
//@Composable
//fun GreetingsStudent(
//    @PreviewParameter(DemoStudentProvider::class) student: Student,
//    @PreviewParameter(DemoWeatherProvider::class) weather: String
//) {
//    Text(text = "Hello! ${student.grade} grade student ${student.name}. It's a $weather day!")
//}
//
//class DemoWeatherProvider : PreviewParameterProvider<String> {
//    override val values = listOf("Sunny").asSequence()
//    override val count: Int = values.count()
//}

@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
fun GreetingsStudent(
    @PreviewParameter(DemoStudentProvider::class) student: Student,
    weather: String = "Sunny"
) {
    Text(text = "Hello! ${student.grade} grade student ${student.name}. It's a $weather day!")
}
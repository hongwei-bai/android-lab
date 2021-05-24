package com.hongwei.android_lab.lab.compose.demo.preview

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider


@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
fun GreetingsStudent(@PreviewParameter(DemoStudentProvider::class) student: Student) {
    Text(text = "Hello! ${student.grade} grade student ${student.name}")
}

data class Student(
    val name: String,
    val grade: Int
)

class DemoStudentProvider : PreviewParameterProvider<Student> {
    override val values = listOf(Student("Hongwei", 3)).asSequence()
    override val count: Int = values.count()
}
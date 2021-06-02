package com.hongwei.android_lab.lab.compose.demo

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.hongwei.android_lab.lab.compose.demo.dataflow.DataFlowDemo
import com.hongwei.android_lab.lab.compose.demo.helloworld.HelloWorld
import com.hongwei.android_lab.lab.compose.demo.modifier.ModifierDemo
import com.hongwei.android_lab.lab.compose.demo.preview.Greetings
import com.hongwei.android_lab.lab.compose.demo.recomposition.RecompositionDemo
import com.hongwei.android_lab.lab.compose.demo.reuse.ReuseDemo
import com.hongwei.android_lab.lab.compose.demo.theming.Theming
import com.hongwei.android_lab.lab.compose.demo.theming.ThemingDemo
import com.hongwei.android_lab.lab.compose.view.RatesPage

@Composable
fun DemoContent() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "content") {
        composable("content") {
            ContentList(navController)
        }
        composable("hello") {
            HelloWorld()
        }
        composable("preview") {
            Greetings("Hongwei")
        }
        composable("recomposition") {
            RecompositionDemo()
        }
        composable("theming") {
            Theming()
        }
        composable("themingSample") {
            ThemingDemo()
        }
        composable("modifier") {
            ModifierDemo()
        }
        composable("dataflow") {
            DataFlowDemo()
        }
        composable("reusability") {
            ReuseDemo()
        }
        composable("irt") {
            RatesPage()
        }
    }
}

@Composable
fun ContentList(navController: NavController) {
    Column(modifier = Modifier.verticalScroll(ScrollState(0))) {
        demoSections.forEach {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .clickable {
                        navController.navigate(it.route)
                    }
                    .height(64.dp)
                    .padding(horizontal = 16.dp)
            ) {
                Text(
                    text = it.label,
                    style = MaterialTheme.typography.subtitle1,
                    color = MaterialTheme.colors.primary
                )
            }
            Divider()
        }
    }
}

val demoSections = listOf(
    DemoSection.HelloWorld,
    DemoSection.Preview,
    DemoSection.Recomposition,
    DemoSection.Theming,
    DemoSection.ThemingSample,
    DemoSection.ModifierDemo,
    DemoSection.DataFlow,
    DemoSection.Reusability,
    DemoSection.IRTRebuild
)

sealed class DemoSection(val route: String, val label: String) {
    object HelloWorld : DemoSection("hello", "Hello world")
    object Preview : DemoSection("preview", "Preview")
    object Recomposition : DemoSection("recomposition", "Recomposition")
    object Theming : DemoSection("theming", "Theming")
    object ThemingSample : DemoSection("themingsample", "Theming Sample")
    object ModifierDemo : DemoSection("modifier", "Modifier Demo")
    object DataFlow : DemoSection("dataflow", "Data Flow")
    object Reusability : DemoSection("reusability", "Reusability")
    object IRTRebuild : DemoSection("irt", "Rebuild rates & info page with Jetpack Compose")
}
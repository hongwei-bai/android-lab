package com.hongwei.android_lab.lab.compose.demo.slot

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.Scaffold
import androidx.compose.material.ScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun ScaffoldDemo() {
    val navController = rememberNavController()
    Scaffold(bottomBar = { BottomNavBar(navController) }) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            // content ...
        }
    }
}

@Composable
fun BottomNavBar(navController: NavHostController) {
    BottomNavigation {
        // ...
    }
}
package com.hongwei.android_lab.lab.compose.demo.theming

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltNavGraphViewModel
import com.hongwei.android_lab.lab.compose.demo.share.ConfigurationView
import com.hongwei.android_lab.lab.compose.theme.DemoTheme
import com.hongwei.android_lab.lab.compose.theme.ThemeId

@Composable
fun Theming() {
    val viewModel = hiltNavGraphViewModel<DemoThemingViewModel>()
    val darkMode by viewModel.onDarkMode.observeAsState()
    val theme by viewModel.themeId.observeAsState()
    DemoTheme(themeId = theme ?: ThemeId.Default, darkTheme = darkMode ?: false) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(ScrollState(0))
        ) {
            ConfigurationView(themeId = theme ?: ThemeId.Default,
                onSelect = {
                    viewModel.switchTheme(it)
                }, onDarkModeOn = {
                    viewModel.setDarkMode(it)
                })
            StyleScreen()
        }
    }
}
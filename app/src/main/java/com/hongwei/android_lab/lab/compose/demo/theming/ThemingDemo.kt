package com.hongwei.android_lab.lab.compose.demo.theming

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.hilt.navigation.compose.hiltNavGraphViewModel
import com.hongwei.android_lab.lab.compose.demo.share.ConfigurationView
import com.hongwei.android_lab.lab.compose.theme.DemoTheme
import com.hongwei.android_lab.lab.compose.theme.ThemeId
import com.hongwei.android_lab.lab.compose.view.RatesPage

@Composable
fun ThemingDemo() {
    val viewModel = hiltNavGraphViewModel<DemoThemingViewModel>()
    val darkMode by viewModel.onDarkMode.observeAsState()
    val theme by viewModel.themeId.observeAsState()
    Column {
        DemoTheme(themeId = theme ?: ThemeId.Default, darkTheme = darkMode ?: false) {
            ConfigurationView(themeId = theme ?: ThemeId.Default,
                onSelect = {
                    viewModel.switchTheme(it)
                }, onDarkModeOn = {
                    viewModel.setDarkMode(it)
                })
            RatesPage()
        }
    }
}
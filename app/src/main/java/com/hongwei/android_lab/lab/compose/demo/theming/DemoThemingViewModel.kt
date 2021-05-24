package com.hongwei.android_lab.lab.compose.demo.theming

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hongwei.android_lab.lab.compose.theme.ThemeId
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DemoThemingViewModel @Inject constructor() : ViewModel() {
    val onDarkMode: MutableLiveData<Boolean> = MutableLiveData()

    val themeId: MutableLiveData<ThemeId> = MutableLiveData()

    fun switchTheme(value: Int) {
        themeId.postValue(
            when (value) {
                1 -> ThemeId.Demo
                2 -> ThemeId.Happy
                3 -> ThemeId.Horror
                else -> ThemeId.Default
            }
        )
    }

    fun setDarkMode(isDark: Boolean) {
        onDarkMode.postValue(isDark)
    }
}
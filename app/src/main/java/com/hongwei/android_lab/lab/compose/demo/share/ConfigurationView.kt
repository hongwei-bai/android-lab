package com.hongwei.android_lab.lab.compose.demo.share

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.RadioButton
import androidx.compose.material.Switch
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.hongwei.android_lab.lab.compose.theme.ThemeId

@Composable
fun ConfigurationView(themeId: ThemeId, onSelect: (Int) -> Unit, onDarkModeOn: (Boolean) -> Unit) {
    val switchOn = remember { mutableStateOf(false) }
    Row(
        modifier = Modifier
            .height(40.dp)
    ) {
        Text(text = "Theme: ")
        RadioButton(selected = themeId == ThemeId.Default, onClick = {
            onSelect.invoke(0)
        })
        RadioButton(selected = themeId == ThemeId.Demo, onClick = {
            onSelect.invoke(1)
        })
        RadioButton(selected = themeId == ThemeId.Happy, onClick = {
            onSelect.invoke(2)
        })
        RadioButton(selected = themeId == ThemeId.Horror, onClick = {
            onSelect.invoke(3)
        })

        Spacer(modifier = Modifier.size(40.dp))
        Text(text = "Dark Mode: ")
        Switch(
            checked = switchOn.value,
            onCheckedChange = {
                switchOn.value = it
                onDarkModeOn.invoke(it)
            })
    }
}
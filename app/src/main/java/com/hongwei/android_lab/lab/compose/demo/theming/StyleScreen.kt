package com.hongwei.android_lab.lab.compose.demo.theming

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.unit.dp
import com.hongwei.android_lab.lab.compose.demo.share.ColorsDemoSection
import com.hongwei.android_lab.lab.compose.demo.share.SectionHeader

@Composable
fun StyleScreen() {
    Column(
        modifier = Modifier.background(color = MaterialTheme.colors.background),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SectionHeader("Typography")
        Text(
            text = "h1",
            style = MaterialTheme.typography.h1,
            color = MaterialTheme.colors.onBackground
        )
        Text(
            text = "h2",
            style = MaterialTheme.typography.h2,
            color = MaterialTheme.colors.onBackground
        )
        Text(
            text = "h3",
            style = MaterialTheme.typography.h3,
            color = MaterialTheme.colors.onBackground
        )
        Text(
            text = "h4",
            style = MaterialTheme.typography.h4,
            color = MaterialTheme.colors.onBackground
        )
        Text(
            text = "h5",
            style = MaterialTheme.typography.h5,
            color = MaterialTheme.colors.onBackground
        )
        Text(
            text = "h6",
            style = MaterialTheme.typography.h6,
            color = MaterialTheme.colors.onBackground
        )
        Text(
            text = "subtitle1",
            style = MaterialTheme.typography.subtitle1,
            color = MaterialTheme.colors.onBackground
        )
        Text(
            text = "subtitle2",
            style = MaterialTheme.typography.subtitle2,
            color = MaterialTheme.colors.onBackground
        )
        Text(
            text = "body1",
            style = MaterialTheme.typography.body1,
            color = MaterialTheme.colors.onBackground
        )
        Text(
            text = "body2",
            style = MaterialTheme.typography.body2,
            color = MaterialTheme.colors.onBackground
        )
        Text(
            text = "caption",
            style = MaterialTheme.typography.caption,
            color = MaterialTheme.colors.onBackground
        )
        Text(
            text = "button",
            style = MaterialTheme.typography.button,
            color = MaterialTheme.colors.onBackground
        )
        Text(
            text = "overline",
            style = MaterialTheme.typography.overline,
            color = MaterialTheme.colors.onBackground
        )
        Spacer(modifier = Modifier.size(5.dp))
        SectionHeader("Colors")
        ColorsDemoSection()
    }
}
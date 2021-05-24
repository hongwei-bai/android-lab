package com.hongwei.android_lab.lab.compose.view

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RatesDetailHeader(header: RatesHeaderViewObject?, modifier: Modifier = Modifier) {
    if (header == null) {
        Placeholder(modifier = modifier.height(60.dp))
    } else {
        Column(modifier.fillMaxWidth()) {
            Text(
                text = "Your interest rates",
                style = MaterialTheme.typography.h5,
                color = MaterialTheme.colors.onSecondary
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = "Variable interest rates are subject to change at any time.",
                style = MaterialTheme.typography.body2,
                color = MaterialTheme.colors.onSecondary
            )
        }
    }
}
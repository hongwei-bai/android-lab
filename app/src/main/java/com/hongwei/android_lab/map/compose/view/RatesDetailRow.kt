package com.hongwei.android_lab.map.compose.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RatesDetailRowBold(caption: String, number: String) =
    RatesDetailRow(caption, number, true)

@Composable
fun RatesDetailRow(caption: String, number: String, isBold: Boolean = false) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp, vertical = 2.dp)
    ) {
        Text(
            text = caption,
            style = if (isBold) MaterialTheme.typography.h6 else MaterialTheme.typography.body2
        )
        Text(
            text = number,
            style = if (isBold) MaterialTheme.typography.h6 else MaterialTheme.typography.body2
        )
    }
}
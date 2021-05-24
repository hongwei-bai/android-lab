package com.hongwei.android_lab.lab.compose.view

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.hongwei.android_lab.lab.compose.view.RatesBreakdownViewObject.RateWithBonusViewObject


@Composable
fun RatesDetailExpandableItem(ratesBreakdown: RatesBreakdownViewObject?) {
    (ratesBreakdown as? RateWithBonusViewObject)?.run {
        val expandState = remember { mutableStateOf(false) }
        Column(modifier = Modifier.fillMaxWidth()) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .clickable { expandState.value = !expandState.value }
                .padding(
                    start = 24.dp,
                    end = 24.dp,
                    top = 24.dp,
                    bottom = if (expandState.value) 12.dp else 24.dp
                )
            ) {
                Text(
                    text = tierTitle!!,
                    style = MaterialTheme.typography.h6,
                    color = MaterialTheme.colors.onSecondary
                )
            }
            if (expandState.value) {
                RatesDetailRow(firstRateCaption, firstRateValue)
                RatesDetailRow(secondRateCaption, secondRateValue)
                RatesDetailRowBold(totalRateCaption, totalRateValue)
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}
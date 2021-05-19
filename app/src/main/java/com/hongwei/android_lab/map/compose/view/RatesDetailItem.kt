package com.hongwei.android_lab.map.compose.view

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.hongwei.android_lab.map.compose.view.RatesBreakdownViewObject.RateNoBonusViewObject
import com.hongwei.android_lab.map.compose.view.RatesBreakdownViewObject.RateWithBonusViewObject

@Composable
fun RatesDetailItem(ratesBreakdown: RatesBreakdownViewObject?) {
    when (ratesBreakdown) {
        is RateNoBonusViewObject -> Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 24.dp)
        ) {
            if (ratesBreakdown.tierTitle != null) {
                Text(
                    text = ratesBreakdown.tierTitle,
                    style = MaterialTheme.typography.h6,
                    modifier = Modifier.padding(horizontal = 24.dp)
                )
                Spacer(modifier = Modifier.height(8.dp))
            }
            RatesDetailRow(
                ratesBreakdown.rateCaption,
                ratesBreakdown.rateValue,
                ratesBreakdown.tierTitle == null
            )
        }
        is RateWithBonusViewObject -> Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 24.dp)
        ) {
            RatesDetailRow(ratesBreakdown.firstRateCaption, ratesBreakdown.firstRateValue)
            RatesDetailRow(ratesBreakdown.secondRateCaption, ratesBreakdown.secondRateValue)
            RatesDetailRowBold(
                ratesBreakdown.totalRateCaption,
                ratesBreakdown.totalRateValue
            )
        }
        else -> {

        }
    }
}
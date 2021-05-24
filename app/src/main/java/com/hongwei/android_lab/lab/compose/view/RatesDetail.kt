package com.hongwei.android_lab.lab.compose.view

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.hongwei.android_lab.lab.compose.theme.Grey20

@SuppressLint("NewApi")
@Composable
fun RatesDetail(rates: RatesDetailViewObject?) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
            .clip(RoundedCornerShape(4.dp))
            .background(color = MaterialTheme.colors.secondary)
            .padding(vertical = 24.dp)
    ) {
        RatesDetailHeader(rates?.header, modifier = Modifier.padding(horizontal = 24.dp))

        rates?.rates?.forEach {
            if (it.isExpandable()) {
                RatesDetailExpandableItem(ratesBreakdown = it)
            } else {
                RatesDetailItem(ratesBreakdown = it)
            }
            Divider(
                color = Grey20,
                thickness = 0.75.dp
            )
        }

        RatesDetailFooter(rates?.footer)
    }
}

data class RatesDetailViewObject(
    val header: RatesHeaderViewObject,
    val rates: List<RatesBreakdownViewObject>,
    val footer: List<FooterItemViewObject>? = null
)

data class RatesHeaderViewObject(
    val headerTitle: String,
    val headerDescription: String
)

sealed class RatesBreakdownViewObject {
    data class RateNoBonusViewObject(
        val tierTitle: String? = null,
        val rateCaption: String,
        val rateValue: String
    ) : RatesBreakdownViewObject()

    data class RateWithBonusViewObject(
        val tierTitle: String? = null,
        val firstRateCaption: String,
        val firstRateValue: String,
        val secondRateCaption: String,
        val secondRateValue: String,
        val totalRateCaption: String,
        val totalRateValue: String
    ) : RatesBreakdownViewObject()

    fun isExpandable(): Boolean =
        when (this) {
            is RateWithBonusViewObject -> tierTitle != null
            else -> false
        }
}

data class FooterItemViewObject(
    val text: String,
    val isBulletPoint: Boolean = false
)

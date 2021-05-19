package com.hongwei.android_lab.map.compose.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.hongwei.android_lab.map.compose.view.AccountHeaderViewObject
import com.hongwei.android_lab.map.compose.view.RatesBreakdownViewObject.RateNoBonusViewObject
import com.hongwei.android_lab.map.compose.view.RatesBreakdownViewObject.RateWithBonusViewObject
import com.hongwei.android_lab.map.compose.view.RatesDetailViewObject
import com.hongwei.android_lab.map.compose.view.RatesHeaderViewObject
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import javax.inject.Inject

@HiltViewModel
class RatesViewModel @Inject constructor() : ViewModel() {
    val account: LiveData<AccountHeaderViewObject?> = liveData {
        emit(null)
        delay(200)
        emit(AccountHeaderViewObject("Netbank Saver", "Netbank Saver", "$8.66"))
    }

    val rates: LiveData<RatesDetailViewObject?> = liveData {
        emit(null)
        delay(3000)
//        emit(FLAT_RATES_WITH_BONUS_SAMPLE)
//        emit(FLAT_RATES_SAMPLE)
//        emit(TIER_RATES_NO_BONUS_SAMPLE)
        emit(TIER_RATES_WITH_BONUS_SAMPLE)
    }

    companion object {
        private val TIER_RATES_WITH_BONUS_SAMPLE = RatesDetailViewObject(
            header = RatesHeaderViewObject(
                headerTitle = "Your interest rate",
                headerDescription = "Variable interest rates are subject to change at any time."
            ),
            rates = listOf(
                RateWithBonusViewObject(
                    tierTitle = "Balance less than \$50,000:",
                    firstRateCaption = "Standard variable rate",
                    firstRateValue = "0.10% p.a.",
                    secondRateCaption = "Bonus variable rate",
                    secondRateValue = "0.40% p.a.",
                    totalRateCaption = "Total interest rate",
                    totalRateValue = "0.50% p.a."
                ),
                RateWithBonusViewObject(
                    tierTitle = "Balances between \$50,000 - \$249,999.99:",
                    firstRateCaption = "Standard variable rate",
                    firstRateValue = "0.10% p.a.",
                    secondRateCaption = "Bonus variable rate",
                    secondRateValue = "0.40% p.a.",
                    totalRateCaption = "Total interest rate",
                    totalRateValue = "0.50% p.a."
                ),
                RateWithBonusViewObject(
                    tierTitle = "Balances between \$250,000 - \$949,999.99:",
                    firstRateCaption = "Standard variable rate",
                    firstRateValue = "0.10% p.a.",
                    secondRateCaption = "Bonus variable rate",
                    secondRateValue = "0.40% p.a.",
                    totalRateCaption = "Total interest rate",
                    totalRateValue = "0.50% p.a."
                ),
                RateWithBonusViewObject(
                    tierTitle = "Balances \$1,000,000 and over:",
                    firstRateCaption = "Standard variable rate",
                    firstRateValue = "0.10% p.a.",
                    secondRateCaption = "Bonus variable rate",
                    secondRateValue = "0.40% p.a.",
                    totalRateCaption = "Total interest rate",
                    totalRateValue = "0.50% p.a."
                )
            )
        )

        private val TIER_RATES_NO_BONUS_SAMPLE = RatesDetailViewObject(
            header = RatesHeaderViewObject(
                headerTitle = "Your interest rate",
                headerDescription = "Variable interest rates are subject to change at any time."
            ),
            rates = listOf(
                RateNoBonusViewObject(
                    tierTitle = "Balance less than \$50,000:",
                    rateCaption = "Total interest rate",
                    rateValue = "0.05% p.a."
                ),
                RateNoBonusViewObject(
                    tierTitle = "Balances between \$50,000 - \$249,999.99:",
                    rateCaption = "Total interest rate",
                    rateValue = "0.05% p.a."
                ),
                RateNoBonusViewObject(
                    tierTitle = "Balances between \$250,000 - \$949,999.99:",
                    rateCaption = "Total interest rate",
                    rateValue = "0.05% p.a."
                ),
                RateNoBonusViewObject(
                    tierTitle = "Balances \$1,000,000 and over:",
                    rateCaption = "Total interest rate",
                    rateValue = "0.05% p.a."
                )
            )
        )

        private val FLAT_RATES_SAMPLE = RatesDetailViewObject(
            header = RatesHeaderViewObject(
                headerTitle = "Your interest rate",
                headerDescription = "Variable interest rates are subject to change at any time."
            ),
            rates = listOf(
                RateNoBonusViewObject(
                    rateCaption = "Total interest rate",
                    rateValue = "0.05% p.a."
                )
            )
        )

        private val FLAT_RATES_WITH_BONUS_SAMPLE = RatesDetailViewObject(
            header = RatesHeaderViewObject(
                headerTitle = "Your interest rate",
                headerDescription = "Variable interest rates are subject to change at any time."
            ),
            rates = listOf(
                RateWithBonusViewObject(
                    firstRateCaption = "Standard variable rate",
                    firstRateValue = "0.10% p.a.",
                    secondRateCaption = "Bonus variable rate",
                    secondRateValue = "0.40% p.a.",
                    totalRateCaption = "Total interest rate",
                    totalRateValue = "0.50% p.a."
                )
            )
        )
    }
}
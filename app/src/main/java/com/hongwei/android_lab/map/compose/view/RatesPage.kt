package com.hongwei.android_lab.map.compose.view

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltNavGraphViewModel
import com.hongwei.android_lab.map.compose.theme.Grey05
import com.hongwei.android_lab.map.compose.viewmodel.RatesViewModel

@Composable
fun RatesPage() {
    val viewModel = hiltNavGraphViewModel<RatesViewModel>()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Grey05)
            .verticalScroll(ScrollState(0))
    ) {
        AccountHeader(
            account = viewModel.account.observeAsState().value
        )
        RatesDetail(
            rates = viewModel.rates.observeAsState().value
        )
    }

}
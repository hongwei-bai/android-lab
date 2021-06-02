package com.hongwei.android_lab.lab.compose.demo.dataflow

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.hilt.navigation.compose.hiltNavGraphViewModel


@Composable
fun DataFlowDemo() {
    val viewModel = hiltNavGraphViewModel<DataFlowDemoViewModel>()
    val accountName by viewModel.accountName.observeAsState()
    Column {
        DataFlowDemoNoViewModel(accountName)
    }
}

@Composable
fun DataFlowDemo1() {
    val viewModel = hiltNavGraphViewModel<DataFlowDemoViewModel>()
    Text(text = viewModel.accountName.observeAsState().value ?: "Null")
}

@Composable
fun DataFlowDemo2() {
    val viewModel = hiltNavGraphViewModel<DataFlowDemoViewModel>()
    val accountName by viewModel.accountName.observeAsState()
    Text(text = "Kotlin delegate: ${accountName ?: "Null"}")
}

@Composable
fun DataFlowDemo3() {
    val viewModel = hiltNavGraphViewModel<DataFlowDemoViewModel>()
    val accountName by viewModel.accountNameFromFlow.observeAsState()
    Text(text = "From flow: ${accountName ?: "Null"}")
}

@Composable
fun DataFlowDemo4() {
    val viewModel = hiltNavGraphViewModel<DataFlowDemoViewModel>()
    val accountName by viewModel.accountNameFromRx.observeAsState()
    Text(text = "From rx: ${accountName ?: "Null"}")
}

@Composable
fun DataFlowDemoNoViewModel(accountName: String?) {
    accountName?.let {
        Text(text = accountName)
    }
}

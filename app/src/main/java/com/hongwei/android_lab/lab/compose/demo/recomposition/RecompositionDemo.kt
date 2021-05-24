package com.hongwei.android_lab.lab.compose.demo.recomposition

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltNavGraphViewModel

@Preview
@Composable
fun RecompositionDemo() {
    val viewModel = hiltNavGraphViewModel<DemoRecompositionViewModel>()
    val account by viewModel.account.observeAsState()
    DemoAccountView(account)
}

@Composable
fun DemoAccountView(account: DemoAccount?) {
    Log.d("bbbb", "DemoAccountView recomposition: $account")
    account?.let {
        Column {
            DemoAccountHeader(account)
            DemoBalance(account.balance)
        }
    }
}

@Composable
fun DemoAccountHeader(account: DemoAccount?) {
    Log.d("bbbb", "DemoAccountHeader recomposition: $account")
    account?.let {
        Text(text = account.accountName)
        Text(text = account.accountType)
    }
}

@Composable
fun DemoBalance(balance: String?) {
    Log.d("bbbb", "DemoBalance recomposition: $balance")
    balance?.let {
        Row {
            Text(text = "Balance:")
            Text(text = balance)
        }
    }
}

data class DemoAccount(
    val accountName: String,
    val accountType: String,
    val balance: String
)
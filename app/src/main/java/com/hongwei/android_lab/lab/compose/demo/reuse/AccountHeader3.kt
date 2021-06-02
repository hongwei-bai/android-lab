package com.hongwei.android_lab.lab.compose.demo.reuse

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.hongwei.android_lab.R


@Composable
fun AccountHeader3(
    account: AccountHeaderViewObject3?,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .background(color = MaterialTheme.colors.primary)
            .padding(32.dp)
            .then(modifier)
    ) {
        if (account == null) {
            Placeholder3(modifier = Modifier.height(120.dp))
        } else {
            Text(
                text = account.accountNickName,
                style = MaterialTheme.typography.h6,
                color = MaterialTheme.colors.onPrimary
            )
            Text(
                text = account.accountType,
                style = MaterialTheme.typography.body2,
                color = MaterialTheme.colors.onPrimary
            )
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = stringResource(id = R.string.rates_balance),
                    style = MaterialTheme.typography.body1,
                    color = MaterialTheme.colors.onPrimary
                )
                Text(
                    text = account.balance,
                    style = MaterialTheme.typography.body2,
                    color = MaterialTheme.colors.onPrimary
                )
            }
        }
    }
}

@Composable
fun Placeholder3(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
    ) {
        Text(
            text = stringResource(id = R.string.rates_loading),
            color = MaterialTheme.colors.onSecondary
        )
    }
}

data class AccountHeaderViewObject3(
    val accountNickName: String,
    val accountType: String,
    val balance: String
)
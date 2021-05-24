package com.hongwei.android_lab.lab.compose.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.dp
import com.hongwei.android_lab.R


class AccountProvider : PreviewParameterProvider<AccountHeaderViewObject?> {
    override val values =
        sequenceOf(AccountHeaderViewObject("Netbank Saver", "Netbank Saver", "$8.66"))
    override val count: Int = values.count()
}

@Preview
@Composable
fun AccountHeader(@PreviewParameter(AccountProvider::class) account: AccountHeaderViewObject?) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .background(color = MaterialTheme.colors.primary)
            .padding(32.dp)
    ) {
        if (account == null) {
            Placeholder(modifier = Modifier.height(120.dp))
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

data class AccountHeaderViewObject(
    val accountNickName: String,
    val accountType: String,
    val balance: String
)
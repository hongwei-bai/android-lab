package com.hongwei.android_lab.lab.compose.demo.reuse

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.hongwei.android_lab.lab.compose.theme.HappyGreen
import com.hongwei.android_lab.lab.compose.theme.HorrorRed

@Composable
fun ReuseDemo() {
    val cardInfo = CardInfoViewObject(
        cardName = "Netbank Saver",
        cardDescription = "My Netbank Saver"
    )

    val account2 = AccountHeaderViewObject2("Netbank Saver", "Netbank Saver", "$8.66")
    val account3 = AccountHeaderViewObject3("Netbank Saver", "Netbank Saver", "$8.66")
    val account4 = AccountHeaderViewObject4("Netbank Saver", "Netbank Saver", "$8.66")

    Column {
        CardContainer(
            cardInfo = cardInfo,
            modifier = Modifier.background(color = HappyGreen)
        ) {
            Divider(modifier = Modifier.background(color = HorrorRed).height(2.dp))
            Text(text = "Hello I am Content")
        }

        AccountHeader2(
            account = account2
        )
        AccountHeader3(
            account = account3,
            modifier = Modifier.background(color = HappyGreen)
        )
        AccountHeader4(
            account = account4,
            modifier = Modifier.background(color = HappyGreen)
        )
    }


}
package com.hongwei.android_lab.lab.compose.demo.modifier

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.hongwei.android_lab.R
import com.hongwei.android_lab.lab.compose.theme.HappyGreen
import com.hongwei.android_lab.lab.compose.theme.HappyPurple

@Composable
fun ModifierDemo() {
    Column {
        ModifierDemo2()
        ModifierDemo3()
        ModifierDemo4()
    }
}

@Composable
fun ModifierDemo2() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
            .background(color = HappyGreen)
            .clickable { doNothing() }
    ) {
        Text(
            text = stringResource(id = R.string.hello_world),
            style = MaterialTheme.typography.body1,
            color = HappyPurple
        )
    }
}

@Composable
fun ModifierDemo3() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = HappyGreen)
            .clickable { doNothing() }
            .padding(20.dp)
    ) {
        Text(
            text = stringResource(id = R.string.hello_world),
            style = MaterialTheme.typography.body1,
            color = HappyPurple
        )
    }
}

@Composable
fun ModifierDemo4() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
            .background(color = HappyGreen)
            .clickable { doNothing() }
            .padding(20.dp)
    ) {
        Text(
            text = stringResource(id = R.string.hello_world),
            style = MaterialTheme.typography.body1,
            color = HappyPurple
        )
    }
}

@Composable
fun ModifierDemo1() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)
            .clip(RoundedCornerShape(4.dp))
            .background(color = HappyGreen)
    ) {
        Text(
            text = stringResource(id = R.string.hello_world),
            style = MaterialTheme.typography.body1,
            color = HappyPurple
        )
    }
}

private fun doNothing() {

}
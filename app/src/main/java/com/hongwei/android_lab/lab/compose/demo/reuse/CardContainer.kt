package com.hongwei.android_lab.lab.compose.demo.reuse

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.unit.dp

@Composable
fun CardContainer(
    cardInfo: CardInfoViewObject,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Column(modifier = modifier) {
        Text(text = "Card Name: ${cardInfo.cardName}", style = MaterialTheme.typography.subtitle1)
        Text(
            text = "Card Desc: ${cardInfo.cardDescription}",
            style = MaterialTheme.typography.body2
        )
        Spacer(modifier = Modifier.size(8.dp))
        Layout(
            modifier = modifier,
            content = content
        ) { measurables, constraints ->
            // Don't constrain child views further, measure them with given constraints
            // List of measured children
            val placeables = measurables.map { measurable ->
                // Measure each children
                measurable.measure(constraints)
            }

            // Set the size of the layout as big as it can
            layout(constraints.maxWidth, constraints.maxHeight / 8) {
                // Track the y co-ord we have placed children up to
                var yPosition = 0

                // Place children in the parent layout
                placeables.forEach { placeable ->
                    // Position item on the screen
                    placeable.placeRelative(x = 0, y = yPosition)

                    // Record the y co-ord placed up to
                    yPosition += placeable.height
                }
            }
        }
    }
}

data class CardInfoViewObject(
    val cardName: String,
    val cardDescription: String
)
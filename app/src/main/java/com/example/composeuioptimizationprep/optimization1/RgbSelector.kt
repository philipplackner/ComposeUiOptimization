package com.example.composeuioptimizationprep.optimization1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun RgbSelector(
    color: Color,
    onColorClick: (Color) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(color)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(onClick = {
                onColorClick(Color.Red)
            }) {
                Text(text = "Red")
            }
            Button(onClick = {
                onColorClick(Color.Green)
            }) {
                Text(text = "Green")
            }
            Button(onClick = {
                onColorClick(Color.Blue)
            }) {
                Text(text = "Blue")
            }
        }
    }
}
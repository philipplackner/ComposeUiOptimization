package com.example.composeuioptimizationprep.optimization2

import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun WelcomeViewAlternative(
    username: String,
) {
    Text(text = "Welcome $username!")
}
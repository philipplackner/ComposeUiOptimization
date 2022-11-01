package com.example.composeuioptimizationprep

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.composeuioptimizationprep.optimization1.MainViewModel
import com.example.composeuioptimizationprep.optimization1.RgbSelector
import com.example.composeuioptimizationprep.optimization3.CustomGrid
import com.example.composeuioptimizationprep.optimization3.FeedViewModel
import com.example.composeuioptimizationprep.ui.theme.ComposeUiOptimizationPrepTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeUiOptimizationPrepTheme {
//                val viewModel = viewModel<MainViewModel>()
//                val changeColorLambda = remember<(Color) -> Unit> {
//                    {
//                        viewModel.changeColor(it)
//                    }
//                }
//                var color by remember {
//                    mutableStateOf(Color.Red)
//                }
//                Box(
//                    modifier = Modifier.fillMaxSize(),
//                    contentAlignment = Alignment.Center
//                ) {
//                    RgbSelector(
//                        color = viewModel.color,
//                        onColorClick = {
//                            color = it
//                        }
//                    )
//                }

                val viewModel = viewModel<FeedViewModel>()
                val feeds = viewModel.feeds

                Column(
                    modifier = Modifier.fillMaxSize()
                ) {
                    CustomGrid(
                        feeds = feeds,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Button(onClick = viewModel::rearrangeFeeds) {
                        Text(text = "Shuffle feeds")
                    }
                }
            }
        }
    }
}
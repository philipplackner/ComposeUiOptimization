package com.example.composeuioptimizationprep.optimization3

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import java.util.*
import kotlin.random.Random

class FeedViewModel: ViewModel() {

    var feeds by mutableStateOf(
        (1..3).map {
            VideoFeed(
                id = UUID.randomUUID().toString(),
                username = "User $it",
                backgroundColor = Color(Random.nextLong(0xFFFFFFFF))
            )
        }
    )
        private set

    fun rearrangeFeeds() {
        feeds = feeds.shuffled()
    }
}
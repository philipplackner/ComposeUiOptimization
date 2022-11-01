package com.example.composeuioptimizationprep.optimization3

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

data class VideoFeed(
    val id: String,
    val username: String,
    val backgroundColor: Color
)

@Composable
fun CustomGrid(
    feeds: List<VideoFeed>,
    modifier: Modifier = Modifier
) {
    val firstRowFeeds = remember(feeds) {
        feeds.take(2)
    }
    val secondRowTracks = remember(feeds) {
        feeds.takeLast(1)
    }
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            firstRowFeeds.forEach { feed ->
                key(feed.id) {
                    VideoFeedView(feed = feed)
                }
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            secondRowTracks.forEach { feed ->
                key(feed.id) {
                    VideoFeedView(feed = feed)
                }
            }
        }
    }
}

@Composable
fun VideoFeedView(
    feed: VideoFeed,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .size(150.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(feed.backgroundColor)
    ) {
        Text(text = feed.username)
    }
}
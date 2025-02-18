package com.gc.docswallet.presentation.common

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp
import com.gc.docswallet.ui.pink
import org.jetbrains.compose.ui.tooling.preview.Preview


//
// Created by Code For Android on 11/02/25.
// Copyright (c) 2025 CFA. All rights reserved.
//

@Composable
fun WavySpacer(
    modifier: Modifier = Modifier,
    waveAmplitude: Float = 30f, // Height of the wave
    waveFrequency: Float = 40f, // Width of one wave
    color: Color = Color.Black,
    strokeWidth: Float = 2f
) {
    Canvas(modifier = modifier) {
        val path = Path()
        val width = size.width
        val height = size.height

        path.moveTo(0f, height / 2)

        var x = 0f
        while (x < width) {
            path.relativeQuadraticTo(
                waveFrequency / 2, -waveAmplitude,
                waveFrequency, 0f
            )
            x += waveFrequency
        }

        drawPath(
            path = path,
            color = color,
            style = Stroke(width = strokeWidth)
        )
    }
}


@Composable
fun SoundWaveSpacer(
    modifier: Modifier = Modifier,
    waveAmplitude: Float = 10f, // Controls the height of the waves
    waveFrequency: Float = 40f, // Controls the width of each wave segment
    color: Color = Color.Black,
    strokeWidth: Float = 4f
) {
    Canvas(modifier = modifier) {
        val path = Path()
        val width = size.width
        val height = size.height / 2

        path.moveTo(0f, height) // Start from center height

        var x = 0f
        var isUp = true // Flag to alternate between up and down waves

        while (x < width) {
            val controlX = x + waveFrequency / 2
            val controlY = if (isUp) height - waveAmplitude else height + waveAmplitude
            val endX = x + waveFrequency
            val endY = height

            path.quadraticTo(controlX, controlY, endX, endY)

            x += waveFrequency
            isUp = !isUp // Alternate between up and down
        }

        drawPath(
            path = path,
            color = color,
            style = Stroke(width = strokeWidth)
        )
    }
}


@Composable
fun SoftWaveBox(
    modifier: Modifier = Modifier,
    waveAmplitude: Float = 10f, // Controls the height of the waves
    waveFrequency: Float = 40f, // Controls the width of each wave segment
    waveColor: Color = Color.Black,
    backgroundColor: Color = Color.Gray,
    strokeWidth: Float = 4f,
    view: @Composable () -> Unit = {}
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(200.dp),
        contentAlignment = Alignment.Center// Fixed box height
    ) {
        Canvas(modifier = Modifier.matchParentSize()) {
            val path = Path()
            val width = size.width
            val waveHeight = waveAmplitude * 2 // Keep wave height proportional
            val height = size.height

            path.moveTo(0f, waveHeight) // Start at wave baseline

            var x = 0f
            var isUp = true // Alternate up/down waves

            while (x < width) {
                val controlX = x + waveFrequency / 2
                val controlY = if (isUp) waveAmplitude else waveHeight + waveAmplitude
                val endX = x + waveFrequency
                val endY = waveHeight

                path.quadraticTo(controlX, controlY, endX, endY)

                x += waveFrequency
                isUp = !isUp // Flip wave direction
            }

            // Close the shape to form the rest of the box
            path.lineTo(width, height) // Right side down
            path.lineTo(0f, height) // Left side down
            path.close()

            // Fill the rectangular part
            drawPath(
                path = path,
                color = backgroundColor,
                style = Fill
            )

            // Draw the wave stroke outline
            drawPath(
                path = path,
                color = waveColor,
                style = Stroke(width = strokeWidth)
            )
        }
        view()
    }
}

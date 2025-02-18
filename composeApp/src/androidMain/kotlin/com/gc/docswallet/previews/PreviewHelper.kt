package com.gc.docswallet.previews

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gc.docswallet.presentation.common.SoftWaveBox
import com.gc.docswallet.presentation.common.WithOutBackgroundItem
import com.gc.docswallet.ui.pink


//
// Created by Code For Android on 11/02/25.
// Copyright (c) 2025 CFA. All rights reserved.
//

@Preview(showBackground = true)
@Composable
fun PreviewSoftWaveBox() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        SoftWaveBox(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp), // Fixed box size
            waveAmplitude = 15f,
            waveFrequency = 50f,
            waveColor = Color.Black,
            backgroundColor = pink
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Content Below the Soft Wave Box", fontSize = 18.sp)
    }
}


@Preview
@Composable
fun PreviewItem(){
    WithOutBackgroundItem()
}
package com.gc.docswallet.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.gc.docswallet.presentation.common.SoundWaveSpacer
import com.gc.docswallet.presentation.common.WavySpacer
import com.gc.docswallet.ui.pink
import com.gc.docswallet.utils.ChewyFontFamily


//
// Created by Code For Android on 11/02/25.
// Copyright (c) 2025 CFA. All rights reserved.
//

@Composable
fun MainScreenView() {

    Box(
        modifier = Modifier.fillMaxSize().background(pink).statusBarsPadding()
    ) {

        Text(
            text = "DocsWallet",
            color = Color.White,
            fontSize = MaterialTheme.typography.headlineLarge.fontSize,
            fontFamily = ChewyFontFamily(),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.TopCenter)
        )

        SoundWaveSpacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(20.dp) // Adjust height to fit wave better
        )
    }


}
package com.gc.docswallet.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gc.docswallet.presentation.common.SoftWaveBox
import com.gc.docswallet.presentation.common.SoundWaveSpacer
import com.gc.docswallet.presentation.common.WavySpacer
import com.gc.docswallet.ui.pink
import com.gc.docswallet.ui.yellow
import com.gc.docswallet.utils.ChewyFontFamily
import com.gc.docswallet.utils.FeaturesList
import com.gc.docswallet.utils.responsiveFontSize
import com.gc.docswallet.utils.responsiveHeaderFontSize


//
// Created by Code For Android on 11/02/25.
// Copyright (c) 2025 CFA. All rights reserved.
//

@Composable
fun MainScreenView() {

    Box(
        modifier = Modifier.fillMaxSize().background(pink).statusBarsPadding()
    ) {

        Column(
            modifier = Modifier.fillMaxWidth().align(Alignment.TopCenter),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "DocsWallet",
                color = Color.White,
                fontSize = responsiveHeaderFontSize().sp,
                fontFamily = ChewyFontFamily(),
                fontWeight = FontWeight.Bold,
            )


            LazyColumn {
                items(FeaturesList.features) { feature ->
                    Text(
                        text = feature,
                        color = Color.White,
                        fontSize = responsiveFontSize().sp,
                        fontFamily = ChewyFontFamily(),
                        fontWeight = FontWeight.Bold,
                    )

                }
            }

         Button(
             onClick = { /*TODO*/ },
             modifier = Modifier

         )   {
             Text("Download")

         }

        }

        SoftWaveBox(
            modifier = Modifier
                .fillMaxWidth()
                .height(600.dp)
                .align(Alignment.BottomCenter),
            waveAmplitude = 15f,
            waveFrequency = 50f,
            waveColor = Color.Black,
            backgroundColor = yellow
        )
    }


}
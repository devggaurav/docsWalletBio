package com.gc.docswallet.presentation.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gc.docswallet.ui.yellow
import com.gc.docswallet.utils.OverLockFontFamily
import com.gc.docswallet.utils.responsiveFontSize
import docswalletinfo.composeapp.generated.resources.Res
import docswalletinfo.composeapp.generated.resources.search_rbg
import org.jetbrains.compose.resources.painterResource


//
// Created by Code For Android on 18/02/25.
// Copyright (c) 2025 CFA. All rights reserved.
//

@Composable
fun WithOutBackgroundItem(
    feature: String = "Search from all docs"
) {

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            contentAlignment = Alignment.Center
        ) {

            Text(
                text = feature,
                color = Color.White,
                fontSize = responsiveFontSize().sp,
                fontFamily = OverLockFontFamily(),
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(vertical = 2.dp)
            )


        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            contentAlignment = Alignment.Center
        ) {

            Image(
                painter = painterResource(Res.drawable.search_rbg),
                contentDescription = "image"
            )


        }


    }

}

@Composable
fun WithBackgroundItem(
    feature: String = "Search from all docs"
) {

    SoftWaveBoxWithTopBottom (
        modifier = Modifier
            .fillMaxWidth()
            .height(550.dp),
        waveAmplitude = 15f,
        waveFrequency = 50f,
        waveColor = Color.Black,
        backgroundColor = yellow
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {


            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                contentAlignment = Alignment.Center
            ) {

                Image(
                    painter = painterResource(Res.drawable.search_rbg),
                    contentDescription = "image"
                )


            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                contentAlignment = Alignment.Center
            ) {

                Text(
                    text = feature,
                    color = Color.White,
                    fontSize = responsiveFontSize().sp,
                    fontFamily = OverLockFontFamily(),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(vertical = 2.dp)
                )


            }


        }
    }

}
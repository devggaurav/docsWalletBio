package com.gc.docswallet.presentation.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.max
import androidx.compose.ui.unit.sp
import com.gc.docswallet.Platform
import com.gc.docswallet.getPlatform
import com.gc.docswallet.ui.yellow
import com.gc.docswallet.utils.OverLockFontFamily
import com.gc.docswallet.utils.responsiveFontSize
import com.gc.docswallet.utils.responsiveHeight
import docswalletinfo.composeapp.generated.resources.Res
import docswalletinfo.composeapp.generated.resources.search_rbg
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource


//
// Created by Code For Android on 18/02/25.
// Copyright (c) 2025 CFA. All rights reserved.
//

@Composable
fun WithOutBackgroundItem(
    feature: String = "Search from all docs",
    res: DrawableResource = Res.drawable.search_rbg
) {

    BoxWithConstraints(
        modifier = Modifier.fillMaxWidth()
    ) {
        val screenWidth = maxWidth

        Row(
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f),
                contentAlignment = Alignment.Center
            ) {

                Text(
                    text = feature,
                    color = Color.White,
                    fontSize = responsiveFontSize(screenWidth).sp,
                    fontFamily = OverLockFontFamily(),
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    maxLines = 3,
                    modifier = Modifier.fillMaxHeight()
                )


            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                contentAlignment = Alignment.Center
            ) {

                Image(
                    painter = painterResource(res),
                    contentDescription = "image"
                )


            }


        }

    }
}


@Composable
fun WithBackgroundItem(
    feature: String = "Search from all docs",
    res: DrawableResource = Res.drawable.search_rbg
) {
    val platform = remember { getPlatform() }

    BoxWithConstraints(
        modifier = Modifier.fillMaxWidth()
    ) {
        val screenWidth = maxWidth

        SoftWaveBoxWithTopBottom(
            modifier = Modifier
                .fillMaxWidth()
                .height(responsiveHeight().dp),
            waveAmplitude = 15f,
            waveFrequency = 50f,
            waveColor = Color.Black,
            backgroundColor = yellow
        ) {

            Row(
                modifier = Modifier.fillMaxWidth().padding(16.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {


                Box(
                    modifier = Modifier
                        .fillMaxWidth().padding(10.dp)
                        .weight(1f),
                    contentAlignment = Alignment.Center
                ) {

                    Image(
                        painter = painterResource(res),
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
                        fontSize = responsiveFontSize(screenWidth).sp,
                        fontFamily = OverLockFontFamily(),
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(vertical = 2.dp, horizontal = 16.dp)
                    )


                }


            }
        }

    }
}
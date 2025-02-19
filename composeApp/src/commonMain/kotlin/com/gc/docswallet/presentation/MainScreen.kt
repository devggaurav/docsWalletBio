package com.gc.docswallet.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gc.docswallet.presentation.common.HandleIntentButton
import com.gc.docswallet.presentation.common.SoftWaveBox
import com.gc.docswallet.presentation.common.SoundWaveSpacer
import com.gc.docswallet.presentation.common.WavySpacer
import com.gc.docswallet.presentation.common.WithBackgroundItem
import com.gc.docswallet.presentation.common.WithOutBackgroundItem
import com.gc.docswallet.ui.pink
import com.gc.docswallet.ui.yellow
import com.gc.docswallet.utils.ChewyFontFamily
import com.gc.docswallet.utils.FeaturesList
import com.gc.docswallet.utils.OverLockFontFamily
import com.gc.docswallet.utils.responsiveFontSize
import com.gc.docswallet.utils.responsiveHeaderFontSize
import org.koin.compose.viewmodel.koinViewModel


//
// Created by Code For Android on 11/02/25.
// Copyright (c) 2025 CFA. All rights reserved.
//

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreenView(
    viewModel: MainViewModel = koinViewModel()
) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column(
                        modifier = Modifier.fillMaxWidth().wrapContentHeight(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "DocsWallet",
                            color = Color.Black,
                            fontSize = responsiveHeaderFontSize().sp,
                            fontFamily = ChewyFontFamily(),
                            fontWeight = FontWeight.Bold,

                            )

                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = pink
                )
            )
        },
        bottomBar = {
            Column(modifier = Modifier.navigationBarsPadding()) {
                Button(
                    onClick = { viewModel.openUrl() },
                    modifier = Modifier

                ) {
                    Text("Download")

                }
            }
        },
        modifier = Modifier,
        containerColor = pink,
        contentWindowInsets = WindowInsets.safeDrawing
    ) { paddingValues ->
        Column(
            modifier = Modifier.fillMaxSize().background(pink)
                .padding(paddingValues = paddingValues).padding(top = paddingValues.calculateTopPadding())
        ) {

            Column(
                modifier = Modifier.fillMaxWidth().wrapContentHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {


                LazyColumn(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    item {
                        SoundWaveSpacer(modifier = Modifier.fillMaxWidth().padding(top = 5.dp))
                    }
                    items(FeaturesList.features) { feature ->

                        if (!feature.showBackground) {
                            WithOutBackgroundItem(feature.features, feature.image)
                        } else {
                            WithBackgroundItem(feature.features, feature.image)
                        }


                    }
                }


            }


        }
    }


}
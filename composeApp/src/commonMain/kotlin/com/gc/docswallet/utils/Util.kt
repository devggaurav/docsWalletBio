package com.gc.docswallet.utils

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.gc.docswallet.Platform
import com.gc.docswallet.getPlatform
import org.jetbrains.compose.resources.Font
import docswalletinfo.composeapp.generated.resources.Res
import docswalletinfo.composeapp.generated.resources.overlock_BoldItalic
import docswalletinfo.composeapp.generated.resources.pacifico_Regular


//
// Created by Code For Android on 11/02/25.
// Copyright (c) 2025 CFA. All rights reserved.
//

@Composable
fun ChewyFontFamily() = FontFamily(Font(Res.font.pacifico_Regular))

@Composable
fun OverLockFontFamily() = FontFamily(Font(Res.font.overlock_BoldItalic))


@Composable
fun responsiveFontSize(windowWidth : Dp): Float {


    val platform = remember { getPlatform() }

    return when (platform) {
        Platform.Web -> when {
            windowWidth < 600.dp -> 40f
            windowWidth < 900.dp -> 55f
            windowWidth < 1200.dp -> 65f
            else -> 70f
        }
        Platform.Desktop -> when {
            windowWidth < 1024.dp -> 16f
            windowWidth < 1440.dp -> 18f
            else -> 20f
        }
        else -> when {  // Mobile
            windowWidth < 360.dp -> 16f
            windowWidth < 480.dp -> 18f
            windowWidth < 600.dp -> 20f
            else -> 22f
        }
    }
}


@Composable
fun responsiveHeaderFontSize(): Float {
    val platform = remember { getPlatform() }
    return when (platform) {
        Platform.Web -> 62f // Tablets or Web
        Platform.Desktop -> 34f // Larger phones
        else -> 30f // Default for small screens
    }
}

@Composable
fun responsiveHeaderHeight(): Float {
    val platform = remember { getPlatform() }
    return when (platform) {
        Platform.Web -> 85f // Tablets or Web
        Platform.Desktop -> 38f // Larger phones
        else -> 50f // Default for small screens
    }
}

@Composable
fun responsiveHeight(): Float {
    val platform = remember { getPlatform() }
    return when (platform) {
        Platform.Web -> 500f // Tablets or Web
        Platform.Desktop -> 400f // Larger phones
        else -> 300f // Default for small screens
    }
}
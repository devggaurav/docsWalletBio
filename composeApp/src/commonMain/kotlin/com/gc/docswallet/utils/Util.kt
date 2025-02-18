package com.gc.docswallet.utils

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
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
fun responsiveFontSize(): Float {
    val platform = remember { getPlatform() }
    return when (platform) {
        Platform.Web -> 64f // Tablets or Web
        Platform.Desktop -> 18f // Larger phones
        else -> 16f // Default for small screens
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
fun responsiveHeight(): Float {
    val platform = remember { getPlatform() }
    return when (platform) {
        Platform.Web -> 500f // Tablets or Web
        Platform.Desktop -> 400f // Larger phones
        else -> 300f // Default for small screens
    }
}
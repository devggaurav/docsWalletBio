package com.gc.docswallet

import androidx.compose.ui.window.ComposeUIViewController
import com.gc.docswallet.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = { initKoin() }
) { App() }
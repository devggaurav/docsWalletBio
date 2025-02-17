package com.gc.docswallet

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.gc.docswallet.di.initKoin

fun main() = application {
    initKoin()
    Window(
        onCloseRequest = ::exitApplication,
        title = "DocsWalletInfo",
    ) {
        App()
    }
}
package com.gc.docswallet.presentation.common

import kotlinx.browser.window

actual class HandleIntentButton {
    actual fun openPlayStore(url: String) {
        window.open(url, "_blank")
    }

}
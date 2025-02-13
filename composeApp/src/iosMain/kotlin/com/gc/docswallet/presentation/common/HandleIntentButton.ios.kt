package com.gc.docswallet.presentation.common

import platform.Foundation.NSURL
import platform.UIKit.UIApplication

actual class HandleIntentButton {
    actual fun openPlayStore(url: String) {

        val link = NSURL.URLWithString(url)
        link?.let {
            UIApplication.sharedApplication.openURL(it)
        }
    }

}
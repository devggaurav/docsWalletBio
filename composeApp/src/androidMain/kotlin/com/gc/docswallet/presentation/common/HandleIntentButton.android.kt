package com.gc.docswallet.presentation.common

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri

actual class HandleIntentButton(val context: Context) {

    actual fun openPlayStore(url: String) {
        require(url.isNotBlank()) { "Package name cannot be empty or blank" }

        try {
            context.startActivity(createPlayStoreIntent("com.gc.docswallet"))
        } catch (e: ActivityNotFoundException) {
            context.startActivity(createWebIntent("com.gc.docswallet"))
        }
    }

    private fun createPlayStoreIntent(packageName: String): Intent {
        return Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse("market://details?id=$packageName")
            setPackage("com.android.vending")
        }
    }

    private fun createWebIntent(packageName: String): Intent {
        return Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse("https://play.google.com/store/apps/details?id=$packageName")
        }
    }

}
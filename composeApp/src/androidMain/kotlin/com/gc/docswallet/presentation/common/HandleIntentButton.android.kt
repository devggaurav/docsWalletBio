package com.gc.docswallet.presentation.common

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri

actual class HandleIntentButton(val context: Context) {

    val appContext = context.applicationContext

    actual fun openPlayStore(url: String) {
        require(url.isNotBlank()) { "Package name cannot be empty or blank" }

        try {
            appContext.startActivity(createPlayStoreIntent("com.gc.docswallet"))
        } catch (e: ActivityNotFoundException) {
            appContext.startActivity(createWebIntent("com.gc.docswallet"))
        }
    }

    private fun createPlayStoreIntent(packageName: String): Intent {
        return Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse("market://details?id=$packageName")
            flags = Intent.FLAG_ACTIVITY_NEW_TASK
            setPackage("com.android.vending")
        }
    }

    private fun createWebIntent(packageName: String): Intent {
        return Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse("https://play.google.com/store/apps/details?id=$packageName")
            flags = Intent.FLAG_ACTIVITY_NEW_TASK
        }
    }

}
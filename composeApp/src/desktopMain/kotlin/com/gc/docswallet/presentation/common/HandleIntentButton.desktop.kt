package com.gc.docswallet.presentation.common

import com.sun.jndi.toolkit.url.Uri
import java.awt.Desktop
import java.net.URI


actual class HandleIntentButton {
    actual fun openPlayStore(url: String) {

        val desktop = Desktop.getDesktop()
        desktop.browse(URI.create(url))
    }

}
package com.gc.docswallet.presentation

import androidx.lifecycle.ViewModel
import com.gc.docswallet.presentation.common.HandleIntentButton


//
// Created by Code For Android on 13/02/25.
// Copyright (c) 2025 CFA. All rights reserved.
//

class MainViewModel(
    private val handleIntentButton: HandleIntentButton
) : ViewModel() {
    val url = "https://play.google.com/store/apps/details?id=com.gc.documentwallet"

    fun openUrl() {
        handleIntentButton.openPlayStore(url)
    }
}
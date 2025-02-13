package com.gc.docswallet

import android.app.Application
import com.gc.docswallet.di.initKoin
import org.koin.android.ext.koin.androidContext


//
// Created by Code For Android on 13/02/25.
// Copyright (c) 2025 CFA. All rights reserved.
//

class MainApp : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@MainApp)
        }
    }
}
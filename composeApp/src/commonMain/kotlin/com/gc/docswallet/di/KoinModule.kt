package com.gc.docswallet.di

import org.koin.core.KoinApplication
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module
import com.gc.docswallet.presentation.MainViewModel

//
// Created by Code For Android on 13/02/25.
// Copyright (c) 2025 CFA. All rights reserved.
//

val sharedModule = module {
    viewModelOf(::MainViewModel)
}

expect val targetModule: Module

fun initKoin(KoinApplication: (KoinApplication.() -> Unit)? = null) {

    startKoin {
        KoinApplication?.invoke(this)
        modules(targetModule, sharedModule)
    }


}
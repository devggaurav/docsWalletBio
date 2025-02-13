package com.gc.docswallet.di

import com.gc.docswallet.presentation.common.HandleIntentButton
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.Module
import org.koin.dsl.module

actual val targetModule: Module = module {
    single<HandleIntentButton> { HandleIntentButton(context = androidContext()) }
}

package com.gc.docswallet

enum class Platform {
    Android,
    IOS,
    Desktop,
    Web,

}

expect fun getPlatform(): Platform
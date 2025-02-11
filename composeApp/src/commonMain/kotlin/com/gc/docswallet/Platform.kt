package com.gc.docswallet

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
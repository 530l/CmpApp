package com.lyf.cmpapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
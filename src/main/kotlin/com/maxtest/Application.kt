package com.maxtest

import com.maxtest.data.module as dataModule
import com.maxtest.web.module as webModule
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    dataModule()
    webModule()
}

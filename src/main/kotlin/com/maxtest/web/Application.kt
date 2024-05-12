package com.maxtest.web

import com.maxtest.data.database.Database
import com.maxtest.web.route.carRoutes
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        carRoutes()
    }
}

fun Application.configureSerialization() {
    install(ContentNegotiation) {
        json()
    }
}

fun Application.module() {
//    val config = environment.config // Retrieve Ktor application configuration
//    Database.connect(config) // Manually initialize the database connection

    configureRouting()
    configureSerialization()
}
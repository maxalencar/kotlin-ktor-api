package com.maxtest.data.database

import com.mongodb.client.MongoClients
import com.mongodb.client.MongoDatabase
import io.ktor.server.config.*

object Database {
    private lateinit var client: com.mongodb.client.MongoClient
    lateinit var database: MongoDatabase

    fun connect(config: ApplicationConfig) {
        val connectionString = config.property("ktor.mongodb.uri").getString()
        client = MongoClients.create(connectionString)
        database = client.getDatabase(config.property("ktor.mongodb.database").getString())
    }

    fun disconnect() {
        client.close()
    }

    fun getDatabaseInstance(): MongoDatabase {
        return database
    }
}
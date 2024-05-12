package com.maxtest.service

import com.maxtest.data.model.Car
import com.maxtest.data.repository.CarRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.bson.Document

class CarService(private val carRepository: CarRepository) {
    // Create new car
    suspend fun create(car: Car): String = withContext(Dispatchers.IO) {
        carRepository.create(car)
    }

    // Read a car
    suspend fun read(id: String): Car? = withContext(Dispatchers.IO) {
        carRepository.read(id)
    }

    // Update a car
    suspend fun update(id: String, car: Car): Document? = withContext(Dispatchers.IO) {
        carRepository.update(id, car)
    }

    // Delete a car
    suspend fun delete(id: String): Document? = withContext(Dispatchers.IO) {
        carRepository.delete(id)
    }
}
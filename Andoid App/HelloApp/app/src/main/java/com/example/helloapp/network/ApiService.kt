package com.example.helloapp.network

import com.example.helloapp.model.User
import retrofit2.http.GET

interface ApiService {
    @GET("api/users")  // Use your actual endpoint
    suspend fun getUsers(): List<User>
}

package com.satwanjyu.recipe.data.remote

import retrofit2.http.GET

interface MealDbService {
    // categories
    @GET("categories.php")
    suspend fun getCategories(): Categories
}
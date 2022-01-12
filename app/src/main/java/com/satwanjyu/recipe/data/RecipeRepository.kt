package com.satwanjyu.recipe.data

import android.util.Log
import com.satwanjyu.recipe.data.remote.Categories
import com.satwanjyu.recipe.data.remote.MealDbService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.delay
import javax.inject.Inject

class RecipeRepository @Inject constructor(
    private val mealDbService: MealDbService
){

    val remoteCategoriesFlow: Flow<Categories> = flow {
        while (true) {
            emit(mealDbService.getCategories())
            Log.d("RecipeRepository", "Emit categories")
            delay(5000L)
        }
    }
}
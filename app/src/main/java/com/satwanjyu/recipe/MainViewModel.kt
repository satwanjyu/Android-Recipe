package com.satwanjyu.recipe

import androidx.lifecycle.ViewModel
import com.satwanjyu.recipe.data.RecipeRepository
import com.satwanjyu.recipe.data.remote.Category
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val recipeRepository: RecipeRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(UiState.Idle)
    val uiState: StateFlow<UiState> = _uiState


}

sealed class UiState {
    object Idle : UiState()
    object Error : UiState()
    data class Success(val categories: List<Category>) : UiState()
    data class Loading(val categories: List<Category>) : UiState()
}
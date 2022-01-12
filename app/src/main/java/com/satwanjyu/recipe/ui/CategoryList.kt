package com.satwanjyu.recipe.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.satwanjyu.recipe.data.remote.Categories
import com.satwanjyu.recipe.data.remote.Category

@Composable
fun CategoriesList(categories: Categories) {
    LazyColumn {
        items(categories.categories) {
            CategoryItem(it)
        }
    }
}

@Composable
fun CategoryItem(category: Category) {
    Text(text = category.strCategory)
}
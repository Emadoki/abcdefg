package com.example.hilttest.data

import com.squareup.moshi.Json

data class Todo(
    @field:Json(name = "userId") val userId: Int = 0,
    @field:Json(name = "id") val id: Int = 0,
    @field:Json(name = "title") val title: String = "",
    @field:Json(name = "completed") val isCompleted: Boolean = false
)
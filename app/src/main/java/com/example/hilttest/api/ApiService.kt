package com.example.hilttest.api

import com.example.hilttest.data.Todo
import io.reactivex.rxjava3.core.Maybe
import retrofit2.http.GET

interface ApiService {

    @GET("/todos")
    fun getTodoList(): Maybe<List<Todo>>
}
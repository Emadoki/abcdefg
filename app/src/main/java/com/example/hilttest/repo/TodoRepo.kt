package com.example.hilttest.repo

import com.example.hilttest.api.ApiService

class TodoRepo(private val api: ApiService) {

    fun getTodoList() = api.getTodoList()
}
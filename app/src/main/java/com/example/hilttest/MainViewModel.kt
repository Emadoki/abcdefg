package com.example.hilttest

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hilttest.data.TodoViewModel
import com.example.hilttest.repo.TodoRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repo: TodoRepo): ViewModel() {

    val liveData = MutableLiveData<List<TodoViewModel>>()

    fun loadTodoList() {
        repo.getTodoList()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                liveData.postValue(it.map { todo ->
                    TodoViewModel(todo.title)
                })
            }
    }
}
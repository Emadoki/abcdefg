package com.example.hilttest

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.hilttest.data.TodoViewModel

object ViewBindingAdapter {

    @JvmStatic
    @BindingAdapter("todoViewModel")
    fun bindTodoViewModel(view: RecyclerView?, list: List<TodoViewModel>?) {
        view?.let {
            val adapter = getOrCreateAdapter(view)
            list?.let {
                adapter.setList(list)
            }
        }
    }

    private fun getOrCreateAdapter(recyclerView: RecyclerView): TodoAdapter {
        return if (recyclerView.adapter != null && recyclerView.adapter is TodoAdapter) {
            recyclerView.adapter as TodoAdapter
        } else {
            val adapter = TodoAdapter()
            recyclerView.adapter = adapter
            adapter
        }
    }
}
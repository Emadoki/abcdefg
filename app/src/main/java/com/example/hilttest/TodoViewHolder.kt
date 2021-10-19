package com.example.hilttest

import androidx.recyclerview.widget.RecyclerView
import com.example.hilttest.data.TodoViewModel
import com.example.hilttest.databinding.ItemTodoBinding

class TodoViewHolder(private val binding: ItemTodoBinding): RecyclerView.ViewHolder(binding.root) {

    fun bind(data: TodoViewModel) {
        // master go again
        binding.setVariable(BR.todoViewModel, data)
        binding.executePendingBindings()
    }
}
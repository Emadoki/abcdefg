package com.example.hilttest

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hilttest.data.TodoViewModel
import com.example.hilttest.databinding.ItemTodoBinding

class TodoAdapter: RecyclerView.Adapter<TodoViewHolder>() {

    private val list = ArrayList<TodoViewModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val flag = false
        return TodoViewHolder(
            ItemTodoBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                flag
            )
        )
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount() = list.size

    fun setList(temp: List<TodoViewModel>) {
        list.clear()
        list.addAll(temp)
        this.notifyDataSetChanged()
    }
}
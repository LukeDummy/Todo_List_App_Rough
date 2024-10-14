package com.likhit.todolistapprough.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.likhit.todolistapprough.Todo
import kotlinx.coroutines.flow.Flow

@Dao
interface TodoDao {

    @Query("SELECT * FROM Todo ORDER BY createdAt DESC")
    fun getAllTodos(): Flow<List<Todo>>

    @Insert
    fun addTodo(todo: Todo)

    @Query("DELETE FROM Todo WHERE id = :id")
    fun deleteTodo(id: Int)

}
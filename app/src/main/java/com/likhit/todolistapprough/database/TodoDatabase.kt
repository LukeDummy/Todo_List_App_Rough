package com.likhit.todolistapprough.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.likhit.todolistapprough.Todo

@Database(
    entities = [Todo::class],
    version = 1
)
@TypeConverters(Converters::class)
abstract class TodoDatabase: RoomDatabase() {

    companion object{
        const val NAME = "TodoDB"
    }

    abstract fun getTodoDao(): TodoDao

}
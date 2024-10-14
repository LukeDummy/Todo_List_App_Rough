package com.likhit.todolistapprough

import android.app.Application
import androidx.room.Room
import com.likhit.todolistapprough.database.TodoDatabase

class MainApplication: Application() {

    companion object {
        lateinit var todoDatabase: TodoDatabase
    }

    override fun onCreate() {
        super.onCreate()
        todoDatabase = Room.databaseBuilder(
            applicationContext,
            TodoDatabase::class.java,
            TodoDatabase.NAME
        ).build()
    }
}
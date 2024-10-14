package com.likhit.todolistapprough

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import com.likhit.todolistapprough.ui.theme.TodoListAppRoughTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val todoViewModel = ViewModelProvider(this)[TodoViewModel::class.java]

        enableEdgeToEdge()
        setContent {
            TodoListAppRoughTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TodoListPage(
                        modifier = Modifier.padding(innerPadding),
                        viewModel = todoViewModel
                    )
                }
            }
        }
    }
}
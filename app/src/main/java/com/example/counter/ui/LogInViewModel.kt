package com.example.counter.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class LogInViewModel : ViewModel() {
    var state: LogInState by mutableStateOf( LogInState())
        private set

    fun onUpdateEmail(value: String) {
        state = state.copy(
            email = value
        )
    }

    fun onUpdatePassword(value: String){
        state = state.copy(
            password = value
        )
    }
}
package com.example.counter.ui

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import com.example.counter.ui.theme.CounterTheme

@Composable
fun LogIn(
    state: LogInState,
    onEmailChange: (String) -> Unit,
    onPasswordChange: (String) -> Unit
){
    SideEffect {
        Log.d("TAG", "Email: ${state.email}\nPassword: ${state.password}")
    }

    val context = LocalContext.current

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize()
    ) {
        TextField(
            value = state.email,
            placeholder = {
                          Text(text = "Email")
            },
            onValueChange = {email -> onEmailChange(email)},
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            value = state.firstName,
            placeholder = {
                Text(text = "First Name")
            },
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            value = state.password,
            placeholder = {
                          Text(text = "Password")
            },
            onValueChange = {password -> onPasswordChange(password)},
            modifier = Modifier.fillMaxWidth()

        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {
                Toast.makeText(
                    context,
                    "Email : ${state.email} \nPassword : ${state.password}\nFirst Name : ${state.firstName}",
                    Toast.LENGTH_SHORT).show()
            },
            modifier = Modifier.fillMaxWidth()
            ) {
            Text(
                text = "SUBMIT"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LogInPreview(){
    CounterTheme {
//        LogIn( state = v)
    }
}
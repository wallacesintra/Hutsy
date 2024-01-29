package com.example.counter.ui

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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.counter.ui.theme.CounterTheme

@Composable
fun LogIn(){
    val context = LocalContext.current
    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize()
    ) {
        TextField(
            value = email,
            placeholder = {
                          Text(text = "Email")
            },
            onValueChange = {email = it},
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            value = password,
            placeholder = {
                          Text(text = "Password")
            },
            onValueChange = {password = it},
            modifier = Modifier.fillMaxWidth()

        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {
                Toast.makeText(
                    context,
                    "Email : $email \npassword : $password",
                    Toast.LENGTH_SHORT).show()
            },
//            modifier = Modifier.fillMaxWidth()
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
        LogIn()
    }
}
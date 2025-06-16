package com.example.helloapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.example.helloapp.ui.theme.HelloAppTheme


import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items

import androidx.compose.runtime.collectAsState
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.helloapp.model.User
import com.example.helloapp.viewmodel.UserViewModel

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloAppTheme {
                Surface {
                    UserListScreen()
                    //SecondScreen()
                }
            }
        }
    }
}

@Composable
fun UserListScreen(userViewModel: UserViewModel = viewModel()) {
    val users = userViewModel.users.collectAsState().value

    LazyColumn {
        items(users) { user ->
            UserItem(user)
        }
    }
}

@Composable
fun UserItem(user: User) {
    Text(text = "ID: ${user.id}, Name: ${user.username},Password:${user.password}")
}

@Preview(showBackground = true)
@Composable
fun PreviewUserItem() {
    UserItem(User(1, "John Doe","123456"));
}
@Composable
fun SecondScreen() {
    val context = LocalContext.current
    Text(text = "Welcome to Second Activity!")
    Button(onClick = {
        Toast.makeText(context, "Navigating to First Activity", Toast.LENGTH_SHORT).show()
        context.startActivity(Intent(context, MainActivity::class.java))
    }) {
        Text("Go to Main Activity")
    }
}

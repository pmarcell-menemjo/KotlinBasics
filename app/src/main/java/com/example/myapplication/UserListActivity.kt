package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adapter.UserAdapter
import com.example.myapplication.model.User

class UserListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_list)

        val users = listOf(
            User("Gipsz Jakab", "gj@email.hu", R.drawable.user),
            User("Kovács Péter", "peter.kovacs@email.com", R.drawable.user),
            User("Nagy Anna", "anna.nagy@email.com", R.drawable.user),
            User("Szabó László", "laszlo.szabo@email.com", R.drawable.user),
            User("Varga Judit", "judit.varga@email.com", R.drawable.user),
            User("Kovács Péter", "peter.kovacs@email.com", R.drawable.user),
            User("Nagy Anna", "anna.nagy@email.com", R.drawable.user),
            User("Szabó László", "laszlo.szabo@email.com", R.drawable.user),
            User("Varga Judit", "judit.varga@email.com", R.drawable.user),
            User("Kovács Péter", "peter.kovacs@email.com", R.drawable.user),
            User("Nagy Anna", "anna.nagy@email.com", R.drawable.user),
            User("Szabó László", "laszlo.szabo@email.com", R.drawable.user),
            User("Varga Judit", "judit.varga@email.com", R.drawable.user),
            User("Kovács Péter", "peter.kovacs@email.com", R.drawable.user),
            User("Nagy Anna", "anna.nagy@email.com", R.drawable.user),
            User("Szabó László", "laszlo.szabo@email.com", R.drawable.user),
            User("Varga Judit", "judit.varga@email.com", R.drawable.user)
        )

        val recyclerView: RecyclerView = findViewById(R.id.userListRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = UserAdapter(users)

    } //oncreate
}
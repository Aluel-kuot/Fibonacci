package com.mama.fibonacci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvNumbers: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        var adapter = Nums(listOf(0, 1, 1, 1, 2, 3, 5, 8, 21, 34))
        recyclerView.adapter = adapter
        adapter.data = listOf(0, 1, 1, 1, 2, 3, 5, 8, 21, 34)
    }

        }


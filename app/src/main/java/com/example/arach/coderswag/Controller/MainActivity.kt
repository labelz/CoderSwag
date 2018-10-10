package com.example.arach.coderswag.Controller

import Adepter.CategoryAdapter
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.arach.coderswag.R
import com.example.arach.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this,
                DataService.catagories)
        catagoryListView.adapter = adapter
    }
}

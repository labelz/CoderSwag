package com.example.arach.coderswag.Controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.example.arach.coderswag.R
import com.example.arach.coderswag.Utils.EXTRA_PRODUCT

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        var categoryType = intent.getStringExtra(EXTRA_PRODUCT)
        Toast.makeText(this, "${categoryType}", Toast.LENGTH_SHORT).show()
    }
}

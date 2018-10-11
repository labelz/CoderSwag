package com.example.arach.coderswag.Controller

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import com.example.arach.coderswag.Adepter.ProductAdapter
import com.example.arach.coderswag.ProductShowActivity
import com.example.arach.coderswag.R
import com.example.arach.coderswag.Services.DataService
import com.example.arach.coderswag.Utils.EXTRA_CATEGORY
import com.example.arach.coderswag.Utils.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {

    lateinit var adapter: ProductAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        var categoryType = intent.getStringExtra(EXTRA_CATEGORY)
//        Toast.makeText(this, "${categoryType}", Toast.LENGTH_SHORT).show()

        adapter = ProductAdapter(this,
                DataService.getProducts(categoryType)) { product ->
            val productShowIntent = Intent(this, ProductShowActivity::class.java)
            productShowIntent.putExtra(EXTRA_PRODUCT, product)
            startActivity(productShowIntent)
        }
        productListView.adapter = adapter

        var spanCount = 2
        var orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            spanCount = 3
        }

        var screenSize = resources.configuration.screenWidthDp
        if (screenSize > 720) {
            spanCount = 3
        }
        val layoutManager = GridLayoutManager(this, spanCount)
        productListView?.layoutManager = layoutManager
        productListView?.setHasFixedSize(true)
    }
}

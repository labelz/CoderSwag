package com.example.arach.coderswag

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.arach.coderswag.Model.Product
import com.example.arach.coderswag.Utils.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product_show.*

class ProductShowActivity : AppCompatActivity() {

    lateinit var product: Product
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_show)
        product = intent.getParcelableExtra(EXTRA_PRODUCT)
        var resorceId = this.resources.getIdentifier(product.image, "drawable", this.packageName)
        pImage.setImageResource(resorceId)
        pName.text = product.title
        pPrice.text = product.price
        pDescription.text = "logwoefijweofijweofjowie woeifwoeifjwofijoweijf woeifjwoefijwoefjowejfowj weofiwjofiweofiwjeof weofijwoefiwjf"

    }
}

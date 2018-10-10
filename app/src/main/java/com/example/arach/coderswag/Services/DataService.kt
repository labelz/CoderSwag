package com.example.arach.coderswag.Services

import com.example.arach.coderswag.Model.Category
import com.example.arach.coderswag.Model.Product

object DataService {
    val catagories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )
    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$18", "hat01"),
            Product("Devslopes Hat Black", "$20", "hat02"),
            Product("Devslopes Hat White", "$18", "hat03"),
            Product("Devslopes Hat Snapback", "$22", "hat04")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "$28", "hoodie01"),
            Product("Devslopes Hoodie Red", "$32", "hoodie02"),
            Product("Devslopes Hoodie Gray2", "$28", "hoodie03"),
            Product("Devslopes Hoodie Black", "$28", "hoodie04")
    )

    val shirts = listOf(
            Product("Devslopes Shirt1", "$28", "shirt01"),
            Product("Devslopes Shirt2", "$32", "shirt02"),
            Product("Devslopes Shirt3", "$28", "shirt03"),
            Product("Devslopes Shirt4", "$28", "shirt04")
    )
}
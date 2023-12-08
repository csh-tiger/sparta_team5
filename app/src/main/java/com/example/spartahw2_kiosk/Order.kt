package com.example.spartahw2_kiosk

data class Order (
    val name: String,
    val price: Double,
    var quantity: Int = 1
)
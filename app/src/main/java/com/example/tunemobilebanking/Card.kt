package com.example.tunemobilebanking

data class Card(val id: String, val cardNumber: String, val expireDate: String) {
    constructor(): this("","","")
}

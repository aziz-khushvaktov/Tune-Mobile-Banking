package com.example.tunemobilebanking.domain.model

data class Card(val id: String, val cardNumber: String, val expireDate: String) {
    constructor(): this("","","")
}

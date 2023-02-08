package com.example.tunemobilebanking.domain.repository

import com.example.tunemobilebanking.common.Resource
import com.example.tunemobilebanking.domain.model.Card

interface CardRepository {
     fun getCards(result:( Resource<List<Card>>) -> Unit)
     fun addCard(card: Card)
}
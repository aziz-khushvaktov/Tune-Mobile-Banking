package com.example.tunemobilebanking.data.repository

import com.example.tunemobilebanking.common.Resource
import com.example.tunemobilebanking.domain.model.Card
import com.example.tunemobilebanking.domain.repository.CardRepository
import com.google.firebase.firestore.FirebaseFirestore

class CardRepositoryImpl(private val firebaseFirestore: FirebaseFirestore): CardRepository {
    override fun getCards(result: (Resource<List<Card>>) -> Unit) {
        firebaseFirestore.collection("cards")
            .get()
            .addOnSuccessListener {
                val cards = ArrayList<Card>()
                it.forEach { queryDocumentSnapshot ->  
                    val card = queryDocumentSnapshot.toObject(Card::class.java)
                    cards.add(card)
                }
                result.invoke(Resource.Success(cards))
            }
            .addOnFailureListener { result.invoke(Resource.Error(it.localizedMessage!!)) }
    }

    override fun addCard(card: Card) {
        firebaseFirestore.collection("cards")
            .add(card)

    }


}
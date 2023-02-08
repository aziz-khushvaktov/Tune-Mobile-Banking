package com.example.tunemobilebanking.ui.home_screen

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.tunemobilebanking.common.Resource
import com.example.tunemobilebanking.domain.model.Card
import com.example.tunemobilebanking.domain.repository.CardRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CardViewModel @Inject constructor(val repository: CardRepository) : ViewModel() {

    private val _cardList = MutableLiveData<Resource<List<Card>>>()
    val cardList = _cardList

    private val _addCard = MutableLiveData<Resource<Card>>()
    val addCard = _addCard

    fun getCardList() {
        _cardList.value = Resource.Loading()
        repository.getCards { _cardList.value = it }
    }

    fun addCard(card: Card) {
        _addCard.value = Resource.Loading()
        repository.addCard(card)
    }

}
package com.example.tunemobilebanking.di

import com.example.tunemobilebanking.data.repository.CardRepositoryImpl
import com.example.tunemobilebanking.domain.repository.CardRepository
import com.google.firebase.firestore.FirebaseFirestore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideCardRepository(firebaseFirestore: FirebaseFirestore): CardRepository {
        return CardRepositoryImpl(firebaseFirestore)
    }
}
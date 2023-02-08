package com.example.tunemobilebanking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tunemobilebanking.databinding.ActivityMainBinding
import com.example.tunemobilebanking.domain.model.Card
import com.google.firebase.firestore.FirebaseFirestore
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    lateinit var firebaseFirestore: FirebaseFirestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() {
        firebaseFirestore = FirebaseFirestore.getInstance()
        var list = ArrayList<Card>()

    }
}
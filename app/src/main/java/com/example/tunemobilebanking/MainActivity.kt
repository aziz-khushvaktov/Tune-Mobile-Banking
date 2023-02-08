package com.example.tunemobilebanking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.tunemobilebanking.databinding.ActivityMainBinding
import com.google.firebase.firestore.FirebaseFirestore

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


//        binding.bDone.setOnClickListener {
//            val card = Card("3",binding.etCardNumber.text.toString(), binding.etExpireDate.text.toString())
//            firebaseFirestore.collection("cards")
//                .add(card)
//                .addOnSuccessListener { Toast.makeText(this, "Successfully", Toast.LENGTH_SHORT).show() }
//                .addOnFailureListener { Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show() }
//
//            firebaseFirestore.collection("cards")
//                .get()
//                .addOnCompleteListener {
//                    if(it.isSuccessful) {
//                        it.result?.forEach {queryDocumentSnapshot ->
//                            val card = queryDocumentSnapshot.toObject(Card::class.java)
//                            list.add(card)
//                        }
//                        binding.tvCard.text = list.toString()
//                    }
//                }
//        }

    }
}
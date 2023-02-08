package com.example.tunemobilebanking.ui.add_card_screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tunemobilebanking.R
import com.example.tunemobilebanking.databinding.FragmentAddCardScreenBinding


class AddCardScreen : Fragment() {

    private val binding by lazy { FragmentAddCardScreenBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        initViews()
        return binding.root
    }

    private fun initViews() {

    }

}
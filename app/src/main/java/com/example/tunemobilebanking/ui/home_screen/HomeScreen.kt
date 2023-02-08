package com.example.tunemobilebanking.ui.home_screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.tunemobilebanking.R
import com.example.tunemobilebanking.databinding.FragmentHomeScreenBinding
import com.example.tunemobilebanking.domain.model.Card
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeScreen : Fragment() {

    private val binding by lazy { FragmentHomeScreenBinding.inflate(layoutInflater) }
    private val adapter by lazy { HomeScreenAdapter() }
    val viewModel: CardViewModel by viewModels()

    private val cards: ArrayList<Card> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        initViews()
        return binding.root

    }

    private fun initViews() {
        binding.ivAdd.setOnClickListener { findNavController().navigate(R.id.addCardScreen) }

        viewModel.cardList.observe(viewLifecycleOwner) {
            adapter.submitList(it.data)
        }

        binding.rvCards.adapter = adapter

        binding.tabLayout.addTab(
            binding.tabLayout.newTab().setText(resources.getString(R.string.str_hammasi))
        )
        binding.tabLayout.addTab(
            binding.tabLayout.newTab().setText(resources.getString(R.string.str_sevimli))
        )
        binding.tabLayout.addTab(
            binding.tabLayout.newTab().setText(resources.getString(R.string.str_uzcard))
        )
        binding.tabLayout.addTab(
            binding.tabLayout.newTab().setText(resources.getString(R.string.str_humo))
        )
        binding.tabLayout.addTab(
            binding.tabLayout.newTab().setText(resources.getString(R.string.str_xalqaro))
        )
    }

}
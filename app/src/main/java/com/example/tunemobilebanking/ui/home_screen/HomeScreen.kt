package com.example.tunemobilebanking.ui.home_screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.tunemobilebanking.Card
import com.example.tunemobilebanking.R
import com.example.tunemobilebanking.databinding.FragmentHomeScreenBinding
import com.example.tunemobilebanking.ui.home_screen.HomeScreenAdapter

class HomeScreen : Fragment() {

    private val binding by lazy { FragmentHomeScreenBinding.inflate(layoutInflater) }
    private val adapter by lazy { HomeScreenAdapter() }

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

        val list = ArrayList<Card>()
        for (i in 0..10) {
            list.add(Card())
        }

        adapter.submitList(list)
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
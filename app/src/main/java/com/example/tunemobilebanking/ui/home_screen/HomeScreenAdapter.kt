package com.example.tunemobilebanking.ui.home_screen

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.tunemobilebanking.domain.model.Card
import com.example.tunemobilebanking.databinding.ItemCardBinding
import dagger.hilt.android.AndroidEntryPoint

class HomeScreenAdapter : ListAdapter<Card, HomeScreenAdapter.Vh>(MyDiffUtil()) {

    inner class Vh(var binding: ItemCardBinding, var context: Context): RecyclerView.ViewHolder(binding.root) {
        fun onBind(card: Card) {
            binding.tvCardNumber.text = card.cardNumber
            binding.tvExpireDate.text = card.expireDate
            if(adapterPosition == 0) {
                binding.tvMainCard.visibility = View.VISIBLE
                binding.tvOylik.visibility = View.VISIBLE
            }
        }
    }

    class MyDiffUtil : DiffUtil.ItemCallback<Card>() {
        override fun areItemsTheSame(oldItem: Card, newItem: Card): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Card, newItem: Card): Boolean {
            return oldItem == newItem
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemCardBinding.inflate(LayoutInflater.from(parent.context)),parent.context)
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        val card = getItem(position)
        holder.onBind(card)
    }
}
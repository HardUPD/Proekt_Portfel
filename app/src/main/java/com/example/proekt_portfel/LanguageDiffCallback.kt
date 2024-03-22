package com.example.proekt_portfel

import androidx.recyclerview.widget.DiffUtil

class LanguageDiffCallback:DiffUtil.ItemCallback<LanguageValue>(){
    override fun areItemsTheSame(oldItem: LanguageValue, newItem: LanguageValue): Boolean {
        return oldItem.id == newItem.id

    }

    override fun areContentsTheSame(oldItem: LanguageValue, newItem: LanguageValue): Boolean {
        return oldItem == newItem
    }
}
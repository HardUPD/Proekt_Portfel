package com.example.proekt_portfel

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.proekt_portfel.databinding.CardLanguageBinding


class LanguageAdapter: androidx.recyclerview.widget.ListAdapter<LanguageValue, LanguageViewHolder>(LanguageDiffCallback()){

    var onItemClickListener:((LanguageValue,Int,List<LanguageValue>)-> Unit)? =null

    private var selectedItem: LanguageValue? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder{
        val layout = when (viewType){
            VIEW_TYPE_LANGUAGE -> R.layout.card_language
            else -> throw RuntimeException("Unknown view type : $viewType")
        }

        val binding = DataBindingUtil.inflate<ViewDataBinding>(
            LayoutInflater.from(parent.context),
            layout,
            parent,
            false
        )
        return LanguageViewHolder(binding)
    }
    override fun onBindViewHolder(viewholder: LanguageViewHolder, position: Int){
        val item = getItem(position)

        when (val binding = viewholder.binding) {
           is CardLanguageBinding -> {
               if (item.image != null) {
                   binding.ivImage.setImageResource(item.image)
               }
               binding.tvNameLanguage.text = item.languagename

               if(item.isSelected == true){
                   binding.ButtonCheck.setBackgroundResource(R.drawable.check_selected)
               } else {
                   binding.ButtonCheck.setBackgroundResource(R.drawable.uncheck_button)
               }
               binding.ButtonCheck.setOnClickListener{
                   onItemClickListener?.invoke(item, position, currentList)
               }

           }

        }

    }
    override fun getItemViewType(position: Int): Int {
        super.getItemViewType(position)
        val item = getItem(position)
        return VIEW_TYPE_LANGUAGE
    }

    companion object{
        private const val VIEW_TYPE_LANGUAGE = 1
    }
}

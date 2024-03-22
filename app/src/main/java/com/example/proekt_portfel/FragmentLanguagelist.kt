package com.example.proekt_portfel

import android.animation.Animator
import android.animation.AnimatorInflater
import android.animation.AnimatorListenerAdapter
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.os.Build
import android.os.Bundle
import android.os.LocaleList
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AccelerateInterpolator
import android.widget.Switch
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.databinding.DataBindingUtil.setContentView
import com.example.proekt_portfel.databinding.FragmentLanguageListBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import org.w3c.dom.Text
import java.lang.RuntimeException
import java.util.Locale

class FragmentLanguagelist : BottomSheetDialogFragment() {

    private lateinit var languageAdapter: LanguageAdapter
    private var selectedItem: LanguageValue? = null

    private var _binding: FragmentLanguageListBinding? = null
    private val binding: FragmentLanguageListBinding
        get() = _binding ?: throw RuntimeException("FragmentLanguageListBinding == null")




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLanguageListBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


// Лист предлогаемых языков

        val languagelist = SystemLanguages()

        val listLanguages = mutableListOf(
            LanguageValue.create(
                "Polski",
                false,
                image = R.drawable.polska,
                "pl",
            ),
            LanguageValue.create(
                "German",
                false,
                image = R.drawable.german,
                "ger"

            ),
            LanguageValue.create(
                "Spain",
                false,
                image = R.drawable.spain,
                "spa"

            ),
            LanguageValue.create(
                "italian",
                false,
                image = R.drawable.italian,
                "ital"

            ),
            LanguageValue.create(
                "China",
                false,
                image = R.drawable.chinanumberone,
                "Cha"
            )


        )


        setupLanguageRecycleView(listLanguages)
        SystemLanguages()

    }
//

    private fun setupLanguageRecycleView(testtt: List<LanguageValue>) {
        val rvLanguage = binding.rvAllLanguage
        with(rvLanguage) {

            languageAdapter = LanguageAdapter()

            adapter = languageAdapter

        }
        languageAdapter.submitList(testtt)


        languageAdapter.onItemClickListener = {item, position, currentList ->

            if(selectedItem == null){
                selectedItem = item.copy(isSelected = !item.isSelected)
                val newList = currentList.toMutableList()
                newList[position] = selectedItem!!
                languageAdapter.submitList(newList.toList())

            } else {
                if(selectedItem != item) {
                    selectedItem?.let{newItemSelected ->
                        val oldItem = newItemSelected.copy(isSelected = !newItemSelected.isSelected)

                        val mutableCurrentList = currentList.toMutableList()

                        val newItem = item.copy(isSelected = !item.isSelected)

                        Log.d("CurrentList", "mutableCurrentList: $mutableCurrentList")
                        Log.d("CurrentList", "oldItem: $oldItem")
                        Log.d("CurrentList", "newItem: $newItem")

                        mutableCurrentList[oldItem.position]=oldItem
                        mutableCurrentList[newItem.position]=newItem

                        Log.d("CurrentList", "mutableCurrentList: $mutableCurrentList")

                        selectedItem = newItem

                        languageAdapter.submitList(mutableCurrentList.toList())
                    }
                }
            }
        }
    }

    private fun SystemLanguages():List<LanguageValue>{
        val languageMap: MutableMap<String, String> = HashMap()
        val locales2: LocaleList
        val configuration2 = this.resources.configuration
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            locales2 = configuration2.locales
            for (i in 0 until locales2.size()) {
                languageMap[locales2[i].language] = locales2[i].getDisplayLanguage(locales2[i])
            }
        }else{
                val locale = Locale.getDefault()
                languageMap[locale.language] = locale.getDisplayLanguage(locale)
            }
            val exitList = mutableListOf<LanguageValue>()
            Log.d("CurrentLanguage", "$languageMap")
            for (item in languageMap){
                val imageResourse = getImageResourceForLanguage(item.key)
                exitList.add(
                    LanguageValue.create(
                        item.value,
                        false,
                        image = imageResourse,
                        item.key
                    )

                )
            }
        return exitList
        }




    private fun getImageResourceForLanguage(languageCode: String): Int{
        val languageImageMap = mapOf(
            "ru" to R.drawable.russia,
            "eng" to R.drawable.usanotcool,
        )
        return  languageImageMap[languageCode]?: R.drawable.item_circle_blue
    }
    }






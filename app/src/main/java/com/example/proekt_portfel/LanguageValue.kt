package com.example.proekt_portfel

import java.text.FieldPosition

data class LanguageValue(
    val id: Int,
    val languagename: String,
    val image: Int? = 0,
    val isSelected: Boolean,
    val position: Int,
    val nameIso: String
) {
    companion object {
        private var idCounter = -1
        private var positionCounter = -1

        fun create(
            languagename: String,
            isSelected: Boolean,
            image: Int?,
            nameIso: String,
            lastPosition: Int? = null
        ): LanguageValue {
            return LanguageValue(
                idCounter++,
                languagename,
                image,
                isSelected,
                positionCounter++,
                nameIso
            )
        }
    }
}


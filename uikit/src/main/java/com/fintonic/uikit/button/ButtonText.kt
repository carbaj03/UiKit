package com.fintonic.uikit.button

import com.fintonic.uikit.text.*

data class ButtonText(
        val value: CharSequence,
        val strategy: TextStrategy = Capitalize
) {
    fun transform() = when (strategy) {
        Capitalize -> value.toString().toLowerCase().capitalize()
        UpperCase -> value.toString().toUpperCase()
        LowerCase -> value.toString().toLowerCase()
        Normal -> value.toString()
    }
}

fun CharSequence.toButtonText(strategy: TextStrategy = Capitalize) =
        ButtonText(this, strategy)
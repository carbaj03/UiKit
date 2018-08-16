package com.fintonic.uikit.text

sealed class TextStrategy(val id: Int)

object Capitalize : TextStrategy(1)
object UpperCase : TextStrategy(2)
object LowerCase : TextStrategy(3)
object Normal : TextStrategy(4)

fun Int.idToStrategy() = when (this) {
    Capitalize.id -> Capitalize
    UpperCase.id -> UpperCase
    LowerCase.id -> LowerCase
    else -> Normal
}

fun CharSequence.toStragety(strategy: TextStrategy = Normal) = when (strategy) {
    Capitalize -> this.toString().capitalize()
    UpperCase -> this.toString().toUpperCase()
    LowerCase -> this.toString().toLowerCase()
    Normal -> this.toString()
}
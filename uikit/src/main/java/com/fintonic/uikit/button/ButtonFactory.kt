package com.fintonic.uikit.button


fun Int.idToStyle() = when (this) {
    PrimaryBlue.id -> PrimaryBlue
    PrimaryWhite.id -> PrimaryWhite
    else -> PrimaryWhite
}
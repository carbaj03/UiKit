package com.fintonic.uikit.button.fab

import com.fintonic.uikit.button.Arrow


fun Int.idToStyle() = when (this) {
    Arrow.id -> Arrow
    else -> Arrow
}
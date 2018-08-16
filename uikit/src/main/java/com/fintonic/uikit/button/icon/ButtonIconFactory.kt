package com.fintonic.uikit.button.icon

import com.fintonic.uikit.button.Whatsapp


fun Int.idToStyle() = when (this) {
    Whatsapp.id -> Whatsapp
    else -> Whatsapp
}
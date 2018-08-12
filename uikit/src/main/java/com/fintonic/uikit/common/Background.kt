package com.fintonic.uikit.common.background

import android.content.Context
import android.support.annotation.StringRes

sealed class Background<M>(open val value: M)

data class FromString(override val value: String) : Background<String>(value)

data class FromHtml(override val value: String) : Background<String>(value)

data class FromResource(@StringRes override val value: Int, val context: Context) : Background<Int>(value)
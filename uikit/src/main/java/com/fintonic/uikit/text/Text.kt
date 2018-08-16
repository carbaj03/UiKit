package com.fintonic.uikit.common.text

import android.content.Context
import android.support.annotation.StringRes

sealed class Text<M>(open val value: M)

data class FromString(override val value: String) : Text<String>(value)

data class FromHtml(override val value: String) : Text<String>(value)

data class FromResource(@StringRes override val value: Int, val context: Context) : Text<Int>(value)
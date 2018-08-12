package com.fintonic.uikit.button

import com.fintonic.uikit.common.Eval
import com.fintonic.uikit.common.Model
import com.fintonic.uikit.common.None
import com.fintonic.uikit.common.Option

data class ButtonModel(
        val style: ButtonStyle,
        val value: CharSequence,
        val f: Option<Eval> = None
) : Model
package com.fintonic.uikit.button

import com.fintonic.uikit.common.Eval
import com.fintonic.uikit.common.Model
import com.fintonic.uikit.common.None
import com.fintonic.uikit.common.Option
import com.fintonic.uikit.text.*

sealed class BaseButtonModel(
        open val style: ButtonStyle,
        open val value: ButtonText,
        open val f: Option<Eval> = None
) : Model

data class ButtonIconModel(
        override val style: ButtonIconStyle,
        override val value: ButtonText,
        override val f: Option<Eval> = None
) : BaseButtonModel(style, value, f)

data class ButtonModel(
        override val style: ButtonStyle,
        override val value: ButtonText,
        override val f: Option<Eval> = None
) : BaseButtonModel(style, value, f)
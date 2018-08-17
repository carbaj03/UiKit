package com.fintonic.uikit.button

import com.fintonic.uikit.common.Eval
import com.fintonic.uikit.common.Model
import com.fintonic.uikit.common.None
import com.fintonic.uikit.common.Option

sealed class ButtonModel(
        open val style: ButtonStyle,
        open val f: Option<Eval> = None
) : Model

data class ButtonIconModel(
        override val style: ButtonIconStyle,
        val value: ButtonText,
        override val f: Option<Eval> = None
) : ButtonModel(style, f)

data class ButtonTextModel(
        override val style: ButtonTextStyle,
        val value:  ButtonText,
        override val f: Option<Eval> = None
) : ButtonModel(style, f)

data class ActionButtonModel(
        override val style: ActionButtonStyle,
        override val f: Option<Eval> = None
) : ButtonModel(style, f)
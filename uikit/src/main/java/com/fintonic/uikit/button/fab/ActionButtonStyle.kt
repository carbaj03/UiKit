package com.fintonic.uikit.button.fab

import com.fintonic.uikit.button.background.Arrow
import com.fintonic.uikit.button.background.BackgroundColorStyle
import com.fintonic.uikit.color.Blue
import com.fintonic.uikit.color.Color
import com.fintonic.uikit.color.Gum
import com.fintonic.uikit.common.Style
import com.fintonic.uikit.icons.ArrowIcon
import com.fintonic.uikit.icons.IconStyle

sealed class ActionButtonStyle(
         open val id: Int,
         open val background: BackgroundColorStyle,
         val icon : IconStyle
) : Style

object Arrow : ActionButtonStyle(1000, Arrow, ArrowIcon)


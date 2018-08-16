package com.fintonic.uikit.button.background

import com.fintonic.uikit.color.Blue
import com.fintonic.uikit.color.ClickWhite
import com.fintonic.uikit.color.Color
import com.fintonic.uikit.common.Style

sealed class BackgroundColorStyle(
        open val id: Int,
        open val resource: Color,
        open val tint : Color
) : Style

object Arrow : BackgroundColorStyle(1, Blue, ClickWhite)

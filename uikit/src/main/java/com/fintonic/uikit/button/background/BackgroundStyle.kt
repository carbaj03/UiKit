package com.fintonic.uikit.button.background

import com.fintonic.uikit.R
import com.fintonic.uikit.color.Blue
import com.fintonic.uikit.color.ClickWhite
import com.fintonic.uikit.color.Color
import com.fintonic.uikit.common.Style

sealed class BackgroundStyle(
        open val id: Int,
        open val resource: Int
) : Style

sealed class BackgroundColorStyle(
        override val id: Int,
        val color: Color,
        val tint : Color
) : BackgroundStyle(id, color.color)

object Arrow : BackgroundColorStyle(1, Blue, ClickWhite)

object RoundedBlue : BackgroundStyle(1000, R.drawable.btn_primary_blue_selector)
object RoundedWhite : BackgroundStyle(1001, R.drawable.btn_primary_white_selector)
object RoundedGreen : BackgroundStyle(1002, R.drawable.btn_whatsapp_selector)

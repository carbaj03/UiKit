package com.fintonic.uikit.button.background

import com.fintonic.uikit.R
import com.fintonic.uikit.common.Style

sealed class BackgroundStyle(
        open val id: Int,
        open val resource: Int
) : Style

object RoundedBlue : BackgroundStyle(1000, R.drawable.btn_primary_blue_selector)
object RoundedWhite : BackgroundStyle(1001, R.drawable.btn_primary_white_selector)
object RoundedGreen : BackgroundStyle(1002, R.drawable.btn_whatsapp_selector)

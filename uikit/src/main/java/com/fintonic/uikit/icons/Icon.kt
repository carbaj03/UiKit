package com.fintonic.uikit.icons

import com.fintonic.uikit.R
import com.fintonic.uikit.color.Blue
import com.fintonic.uikit.color.Color
import com.fintonic.uikit.color.Green
import com.fintonic.uikit.color.White
import com.fintonic.uikit.common.Style
import com.fintonic.uikit.dimens.DimensLabel
import com.fintonic.uikit.dimens.DisplayDimen

sealed class IconStyle(
        val color: Color,
        val resource: Int
) : Style

object WhatsappIcon : IconStyle(Green, R.drawable.ic_whatsapp)
object ArrowIcon : IconStyle(White, R.drawable.ic_arrow)
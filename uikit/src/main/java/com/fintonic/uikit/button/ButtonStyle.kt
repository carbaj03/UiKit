package com.fintonic.uikit.button

import com.fintonic.uikit.button.background.BackgroundStyle
import com.fintonic.uikit.button.background.RoundedBlue
import com.fintonic.uikit.button.background.RoundedWhite
import com.fintonic.uikit.common.Style
import com.fintonic.uikit.dimens.*
import com.fintonic.uikit.font.CerebriSansBook
import com.fintonic.uikit.font.CerebriSansLight
import com.fintonic.uikit.font.CerebriSansSemiBold
import com.fintonic.uikit.font.Font
import com.fintonic.uikit.label.LabelStyle
import com.fintonic.uikit.label.LinkBlueSmall
import com.fintonic.uikit.label.LinkWhite

sealed class ButtonStyle(
        val id: Int,
        val labelStyle: LabelStyle,
        val background: BackgroundStyle
) : Style

object PrimaryBlue : ButtonStyle(1000, LinkWhite, RoundedBlue)
object PrimaryWhite : ButtonStyle(1001, LinkBlueSmall, RoundedWhite)
object PrimaryIcon : ButtonStyle(1002, LinkWhite, RoundedBlue)

object GostBlue : ButtonStyle(2000, LinkWhite, RoundedBlue)
object GostWhite : ButtonStyle(2001, LinkWhite, RoundedBlue)
object GostIcon : ButtonStyle(2002, LinkWhite, RoundedBlue)

object Secondary : ButtonStyle(3000, LinkWhite, RoundedBlue)
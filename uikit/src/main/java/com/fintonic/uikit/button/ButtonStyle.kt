package com.fintonic.uikit.button

import com.fintonic.uikit.button.background.BackgroundStyle
import com.fintonic.uikit.button.background.RoundedBlue
import com.fintonic.uikit.button.background.RoundedGreen
import com.fintonic.uikit.button.background.RoundedWhite
import com.fintonic.uikit.common.Style
import com.fintonic.uikit.dimens.DimensButton
import com.fintonic.uikit.dimens.PrimaryBlueDimen
import com.fintonic.uikit.icons.IconStyle
import com.fintonic.uikit.icons.WhatsappIcon
import com.fintonic.uikit.label.LabelStyle
import com.fintonic.uikit.label.LinkWhite
import com.fintonic.uikit.label.Micro1BlackRegular

sealed class ButtonStyle(
         open val id: Int,
         open val labelStyle: LabelStyle,
         open val background: BackgroundStyle,
         open val dimens: DimensButton
) : Style

sealed class ButtonIconStyle(
        override val id: Int,
        val buttonStyle: ButtonStyle,
        val icon : IconStyle
) : ButtonStyle(id, buttonStyle.labelStyle, buttonStyle.background, buttonStyle.dimens)

object Whatsapp : ButtonIconStyle(1000, PrimaryGreen,  WhatsappIcon)

object PrimaryBlue : ButtonStyle(1000, LinkWhite, RoundedBlue, PrimaryBlueDimen)
object PrimaryWhite : ButtonStyle(1001, Micro1BlackRegular, RoundedWhite, PrimaryBlueDimen)
object PrimaryGreen : ButtonStyle(1002, LinkWhite, RoundedGreen, PrimaryBlueDimen)

//object PrimaryIcon : ButtonStyle(1002, LinkWhite, RoundedBlue, PrimaryBlueDimen)
object GostBlue : ButtonStyle(2000, LinkWhite, RoundedBlue, PrimaryBlueDimen)
object GostWhite : ButtonStyle(2001, LinkWhite, RoundedBlue, PrimaryBlueDimen)

//object GostIcon : ButtonStyle(2002, LinkWhite, RoundedBlue, PrimaryBlueDimen)

object Secondary : ButtonStyle(3000, LinkWhite, RoundedBlue, PrimaryBlueDimen)


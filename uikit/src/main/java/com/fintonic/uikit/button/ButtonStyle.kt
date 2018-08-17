package com.fintonic.uikit.button

import com.fintonic.uikit.button.background.*
import com.fintonic.uikit.button.background.Arrow
import com.fintonic.uikit.common.Style
import com.fintonic.uikit.dimens.DimensButton
import com.fintonic.uikit.dimens.PrimaryBlueDimen
import com.fintonic.uikit.icons.ArrowIcon
import com.fintonic.uikit.icons.IconStyle
import com.fintonic.uikit.icons.WhatsappIcon
import com.fintonic.uikit.label.LabelStyle
import com.fintonic.uikit.label.LinkWhite
import com.fintonic.uikit.label.Micro1BlackRegular

sealed class ButtonStyle(
        open val id: Int,
        open val background: BackgroundStyle,
        open val dimens: DimensButton
) : Style


sealed class ButtonTextStyle(
        override val id: Int,
        override val background: BackgroundStyle,
        override val dimens: DimensButton,
        val labelStyle: LabelStyle
) : ButtonStyle(id, background, dimens)

object PrimaryBlue : ButtonTextStyle(1000, RoundedBlue, PrimaryBlueDimen, LinkWhite)
object PrimaryWhite : ButtonTextStyle(1001, RoundedWhite, PrimaryBlueDimen, Micro1BlackRegular)
object PrimaryGreen : ButtonTextStyle(1002, RoundedGreen, PrimaryBlueDimen, LinkWhite)

sealed class ButtonIconStyle(
        override val id: Int,
        val style: ButtonTextStyle,
        val icon: IconStyle
) : ButtonStyle(id, style.background, style.dimens)

object Whatsapp : ButtonIconStyle(1000, PrimaryGreen, WhatsappIcon)


sealed class ActionButtonStyle(
        override val id: Int,
        override val background: BackgroundColorStyle,
        override val dimens: DimensButton,
        val icon: IconStyle
) : ButtonStyle(id, background, dimens)

object Arrow : ActionButtonStyle(1000, Arrow, PrimaryBlueDimen, ArrowIcon)




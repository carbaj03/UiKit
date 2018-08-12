package com.fintonic.uikit.label

import com.fintonic.uikit.color.*
import com.fintonic.uikit.common.Style
import com.fintonic.uikit.dimens.*
import com.fintonic.uikit.font.*

sealed class LabelStyle(
        val id: Int,
        val color: Color,
        val dimens: DimensLabel,
        val font: Font
) : Style

object DisplayBig : LabelStyle(1000, Navy, DisplayBigDimen, CerebriSansSemiBold)
object Display : LabelStyle(1001, Navy, DisplayDimen, CerebriSansSemiBold)

object H1Black : LabelStyle(2100, DarkGray, H1Dimen, CerebriSansLight)
object H2Black : LabelStyle(2200, DarkGray, H2Dimen, CerebriSansLight)
object H3Black : LabelStyle(2300, DarkGray, H3Dimen, CerebriSansBook)
object H3Gray : LabelStyle(2301, Gray, H3Dimen, CerebriSansBook)
object H3Green : LabelStyle(2302, Green, H3Dimen, CerebriSansBook)
object H3Pink : LabelStyle(2303, Pink, H3Dimen, CerebriSansBook)

object BodyBlack : LabelStyle(3000, DarkGray, BodyDimen, CerebriSansLight)
object BodyGray : LabelStyle(3001, Gray, BodyDimen, CerebriSansLight)

object LinkBlueBig : LabelStyle(4100, Blue, LinkBigDimen, CerebriSansBook)
object LinkBlueSmall : LabelStyle(4200, Blue, LinkSmallDimen, CerebriSansBook)
object LinkSecondary : LabelStyle(4300, Pink, LinkDimen, CerebriSansBook)
object LinkDisabled : LabelStyle(4400, Gray, LinkDimen, CerebriSansBook)
object LinkWhite : LabelStyle(4000, White, LinkDimen, CerebriSansMedium)
object LinkGreen : LabelStyle(4001, Green, LinkDimen, CerebriSansBook)

object Micro1BlackRegular : LabelStyle(5000, DarkGray, Micro1Dimen, CerebriSansRegular)
object Micro1Black : LabelStyle(5100, DarkGray, Micro1Dimen, CerebriSansLight)
object Micro1Gray : LabelStyle(5101, Gray, Micro1Dimen, CerebriSansLight)
object Micro2Black : LabelStyle(5200, DarkGray, Micro2Dimen, CerebriSansSemiBold)
object Micro2Gray : LabelStyle(5201, Gray, Micro2Dimen, CerebriSansSemiBold)
object Micro2GrayRegular : LabelStyle(5202, Gray, Micro2Dimen, CerebriSansRegular)

object InputError : LabelStyle(6000, Red, InputErrorDimen, CerebriSansRegular)

object Big50 : LabelStyle(7050, DarkGray, Big50Dimen, CerebriSansLight)
object Big33 : LabelStyle(7033, DarkGray, Big33Dimen, CerebriSansLight)
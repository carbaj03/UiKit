
package com.fintonic.uikit.dimens

import android.util.TypedValue

sealed class DimensLabel(val unit: Int, val size: Float) : Dimens

object DisplayBigDimen : DimensLabel(TypedValue.COMPLEX_UNIT_SP, 40f)
object DisplayDimen : DimensLabel(TypedValue.COMPLEX_UNIT_SP, 24f)
object H1Dimen : DimensLabel(TypedValue.COMPLEX_UNIT_SP, 26f)
object H2Dimen : DimensLabel(TypedValue.COMPLEX_UNIT_SP, 22f)
object H3Dimen : DimensLabel(TypedValue.COMPLEX_UNIT_SP, 18f)
object BodyDimen : DimensLabel(TypedValue.COMPLEX_UNIT_SP, 18f)
object LinkBigDimen : DimensLabel(TypedValue.COMPLEX_UNIT_SP, 17f)
object LinkSmallDimen : DimensLabel(TypedValue.COMPLEX_UNIT_SP, 15f)
object LinkDimen : DimensLabel(TypedValue.COMPLEX_UNIT_SP, 15f)
object Micro1Dimen : DimensLabel(TypedValue.COMPLEX_UNIT_SP, 15f)
object Micro2Dimen : DimensLabel(TypedValue.COMPLEX_UNIT_SP, 13f)
object InputErrorDimen : DimensLabel(TypedValue.COMPLEX_UNIT_SP, 15f)
object Big50Dimen : DimensLabel(TypedValue.COMPLEX_UNIT_SP, 50f)
object Big33Dimen : DimensLabel(TypedValue.COMPLEX_UNIT_SP, 33f)
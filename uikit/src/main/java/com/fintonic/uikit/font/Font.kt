package com.fintonic.uikit.font

import android.content.Context
import android.graphics.Typeface
import android.support.v4.content.res.ResourcesCompat
import com.fintonic.uikit.R


sealed class Font(open val font: Int) {
    fun getFont(context: Context): Typeface? = ResourcesCompat.getFont(context, font)
}

object CerebriSansBold : Font(R.font.cerebri_sans_bold)
object CerebriSansBoldItalic : Font(R.font.cerebri_sans_bold_italic)
object CerebriSansBook : Font(R.font.cerebri_sans_book)
object CerebriSansBookItalic : Font(R.font.cerebri_sans_book_italic)
object CerebriSansExtraBold : Font(R.font.cerebri_sans_extra_bold)
object CerebriSansExtraBoldItalic : Font(R.font.cerebri_sans_extra_bold_italic)
object CerebriSansHeavy : Font(R.font.cerebri_sans_heavy)
object CerebriSansHeavyItalic : Font(R.font.cerebri_sans_heavy_italic)
object CerebriSansItalic : Font(R.font.cerebri_sans_italic)
object CerebriSansLight : Font(R.font.cerebri_sans_light)
object CerebriSansLightItalic : Font(R.font.cerebri_sans_light_italic)
object CerebriSansMedium : Font(R.font.cerebri_sans_medium)
object CerebriSansMediumItalic : Font(R.font.cerebri_sans_medium_italic)
object CerebriSansRegular : Font(R.font.cerebri_sans_regular)
object CerebriSansSemiBold : Font(R.font.cerebri_sans_semi_bold)
object CerebriSansSemiBoldItalic : Font(R.font.cerebri_sans_semi_bold_italic)


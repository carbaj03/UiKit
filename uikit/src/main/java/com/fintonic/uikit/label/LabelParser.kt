package com.fintonic.uikit.label

import android.content.Context
import android.support.annotation.StringRes
import android.text.Html.fromHtml
import com.fintonic.uikit.common.text.FromHtml
import com.fintonic.uikit.common.text.FromResource
import com.fintonic.uikit.common.text.FromString
import com.fintonic.uikit.common.text.Text

class TextParse(private val context: Context) {
    private fun <M : Text<N>, N, R> parser(textBase: M, f: (M) -> R): R =
            f(textBase)

    private fun <M> Text<M>.toCharSequence(): CharSequence =
            parser(this) { textToCharsequence() }

    private fun <M> Text<M>.textToCharsequence(): CharSequence =
            when (this) {
                is FromString -> this.value
                is FromHtml -> fromHtml(this.value)
                is FromResource -> this.context.getText(this.value)
            }

    fun textParserResource(@StringRes toParse: Int): CharSequence =
            FromResource(toParse, context).toCharSequence()

    fun textParserString(toParse: String): CharSequence =
            FromString(toParse).toCharSequence()

    fun textParserHtml(toParse: String): CharSequence =
            FromHtml(toParse).toCharSequence()

    fun <M> textParser(toParse: M): CharSequence =
            when (toParse) {
                is Int -> FromResource(toParse, context).toCharSequence()
                is String -> FromString(toParse).toCharSequence()
                else -> throw Exception("")
            }
}

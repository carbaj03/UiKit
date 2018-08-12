package com.fintonic.uikit.label

import android.content.Context
import android.content.res.TypedArray
import android.support.v4.content.ContextCompat
import android.support.v7.widget.AppCompatTextView
import android.text.Html.fromHtml
import android.text.Spannable
import android.util.AttributeSet
import com.fintonic.uikit.R
import com.fintonic.uikit.common.*

class Label @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyleAttr: Int = 0
) : AppCompatTextView(context, attrs, defStyleAttr), Errorable, Component<LabelModel> {
    var value
        get() = text.toString()
        set(value) {
            text = value
        }

    val style: Option<LabelStyle>

    init {
        val a: TypedArray = context.theme.obtainStyledAttributes(attrs, R.styleable.Label, 0, 0)

        style = try {
            a.getInt(R.styleable.Label_label_style, H1Black.id).idToStyle().some()
        } catch (e: Exception) {
            None
        } finally {
            a.recycle()
        }

        style.map { render(it) }
    }

    private fun render(labelStyle: LabelStyle) = with(labelStyle) {
        setTextColor(color.getColor(context))
        setTextSize(dimens.unit, dimens.size)
        typeface = font.getFont(context)
    }

    override fun render(model: LabelModel) = apply {
        with(model) {
            render(style)
            text = value
            f.map { action -> setOnClickListener { action.f() } }
        }
    }

    override fun error(value: String) {
        this.error = value
    }
}
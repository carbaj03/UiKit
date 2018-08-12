package com.fintonic.uikit.button

import android.content.Context
import android.content.res.TypedArray
import android.support.v7.widget.AppCompatButton
import android.util.AttributeSet
import com.fintonic.uikit.R
import com.fintonic.uikit.common.*

class Button @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyleAttr: Int = 0
) : AppCompatButton(context, attrs, defStyleAttr), Errorable, Component<ButtonModel> {
    var value
        get() = text.toString()
        set(value) {
            text = value
        }

    val style: Option<ButtonStyle>

    init {
        val a: TypedArray = context.theme.obtainStyledAttributes(attrs, R.styleable.Label, 0, 0)

        style = try {
            a.getInt(R.styleable.Label_label_style, PrimaryWhite.id).idToStyle().some()
        } catch (e: Exception) {
            None
        } finally {
            a.recycle()
        }

        style.map { render(it) }
    }

    private fun render(buttonStyle: ButtonStyle) = with(buttonStyle) {
        setBackgroundResource(background.resource)

        setTextColor(labelStyle.color.getColor(context))
        setTextSize(labelStyle.dimens.unit, labelStyle.dimens.size)
        typeface = labelStyle.font.getFont(context)
    }

    override fun render(model: ButtonModel) = apply {
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
package com.fintonic.uikit.button.icon

import android.content.Context
import android.content.res.TypedArray
import android.support.v7.widget.AppCompatButton
import android.util.AttributeSet
import com.fintonic.uikit.R
import com.fintonic.uikit.button.*
import com.fintonic.uikit.common.*
import com.fintonic.uikit.text.Capitalize
import com.fintonic.uikit.text.idToStrategy


class ButtonIcon @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null
) : AppCompatButton(context, attrs), Errorable, Component<ButtonIconModel> {
    var value
        get() = text.toString()
        set(value) {
            text = value
        }

    val style: Option<ButtonIconModel>

    init {
        val a: TypedArray = context.obtainStyledAttributes(attrs, R.styleable.ButtonIcon)

        style = try {
            ButtonIconModel(
                    a.getInt(R.styleable.ButtonIcon_button_icon_style, Whatsapp.id).idToStyle(),
                    ButtonText(text, a.getInt(R.styleable.Button_text_strategy, Capitalize.id).idToStrategy())
            ).some()
        } catch (e: Exception) {
            None
        } finally {
            a.recycle()
        }

        style.map { render(it) }
    }

    override fun render(model: ButtonIconModel) = apply {
        setUp(model)
        setCompoundDrawablesWithIntrinsicBounds(model.style.icon.resource, 0,0,0)
        model.f.map { action -> setOnClickListener { action.f() } }
    }

    override fun error(value: String) {
        this.error = value
    }
}
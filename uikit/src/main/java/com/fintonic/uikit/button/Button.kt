package com.fintonic.uikit.button

import android.content.Context
import android.content.res.ColorStateList
import android.content.res.TypedArray
import android.graphics.Color
import android.graphics.drawable.RippleDrawable
import android.support.v4.view.ViewCompat
import android.support.v7.widget.AppCompatButton
import android.support.v7.widget.AppCompatTextView
import android.util.AttributeSet
import com.fintonic.uikit.R
import com.fintonic.uikit.common.*
import com.fintonic.uikit.text.Capitalize
import com.fintonic.uikit.text.TextStrategy
import com.fintonic.uikit.text.idToStrategy

class Button @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null
) : AppCompatButton(context, attrs), Errorable, Component<ButtonModel> {
    var value
        get() = text.toString()
        set(value) {
            text = value
        }

    val style: Option<ButtonModel>

    init {
        val a: TypedArray = context.obtainStyledAttributes(attrs, R.styleable.Button)

        style = try {
            ButtonModel(
                    a.getInt(R.styleable.Button_button_style, PrimaryWhite.id).idToStyle(),
                    ButtonText(text, a.getInt(R.styleable.Button_text_strategy, Capitalize.id).idToStrategy())
            ).some()
        } catch (e: Exception) {
            None
        } finally {
            a.recycle()
        }

        style.map { render(it) }
    }

    override fun render(model: ButtonModel) = apply {
        setUp(model)
        model.f.map { action -> setOnClickListener { action.f() } }
    }

    override fun error(value: String) {
        this.error = value
    }
}
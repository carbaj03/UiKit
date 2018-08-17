package com.fintonic.uikit.button

import android.content.Context
import android.content.res.ColorStateList
import android.content.res.TypedArray
import android.graphics.Color
import android.graphics.drawable.RippleDrawable
import android.support.v4.content.ContextCompat
import android.support.v4.view.ViewCompat
import android.support.v7.widget.AppCompatButton
import android.support.v7.widget.AppCompatTextView
import android.util.AttributeSet
import com.fintonic.uikit.R
import com.fintonic.uikit.button.fab.ActionButton
import com.fintonic.uikit.button.icon.ButtonIcon
import com.fintonic.uikit.common.*
import com.fintonic.uikit.text.Capitalize
import com.fintonic.uikit.text.TextStrategy
import com.fintonic.uikit.text.idToStrategy

class Button @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null
) : AppCompatButton(context, attrs), ButtonComponent<ButtonTextModel> {
    var value
        get() = text.toString()
        set(value) {
            text = value
        }

    val style: Option<ButtonTextModel>

    init {
        val a: TypedArray = context.obtainStyledAttributes(attrs, R.styleable.Button)

        style = try {
            ButtonTextModel(
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

    override fun render(model: ButtonTextModel) = apply {
        with(model.style) {
            setPadding(resources.getDimensionPixelOffset(dimens.padding), 0, resources.getDimensionPixelOffset(dimens.padding), 0)
//            setBackgroundResource(background.resource)
            ViewCompat.setBackgroundTintList(this@Button,
                    ColorStateList(arrayOf(intArrayOf( android.R.attr.state_pressed), intArrayOf()),
                            intArrayOf(ContextCompat.getColor(context, R.color.click_blue),
                                    ContextCompat.getColor(context, R.color.blue))))


            setAllCaps(false)
            setTextColor(labelStyle.color.getColor(context))
            setTextSize(labelStyle.dimens.unit, labelStyle.dimens.size)
            typeface = labelStyle.font.getFont(context)
            text = model.value.transform()
        }

        model.f.map { action -> setOnClickListener { action.f() } }
    }
}

fun AppCompatButton.render(model : ButtonModel) = apply {
    when(model){
        is ButtonIconModel -> ButtonIcon(context)
        is ButtonTextModel -> Button(context)
        is ActionButtonModel -> ActionButton(context)
    }

}
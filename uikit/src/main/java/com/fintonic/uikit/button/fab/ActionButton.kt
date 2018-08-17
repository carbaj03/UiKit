package com.fintonic.uikit.button.fab

import android.content.Context
import android.content.res.TypedArray
import android.support.v7.widget.AppCompatButton
import android.util.AttributeSet
import com.fintonic.uikit.R
import com.fintonic.uikit.button.ActionButtonModel
import com.fintonic.uikit.button.Arrow
import com.fintonic.uikit.common.*


class ActionButton @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null
) : AppCompatButton(context, attrs), ButtonComponent<ActionButtonModel> {

    val style: Option<ActionButtonModel>

    init {
        val a: TypedArray = context.obtainStyledAttributes(attrs, R.styleable.ButtonAction)

        style = try {
            ActionButtonModel(
                    a.getInt(R.styleable.ButtonAction_button_action_style, Arrow.id).idToStyle()
            ).some()
        } catch (e: Exception) {
            None
        } finally {
            a.recycle()
        }

        style.map { render(it) }
    }

    override fun render(model: ActionButtonModel) = apply {
        with(model.style) {
            setPadding(resources.getDimensionPixelOffset(dimens.padding), 0, resources.getDimensionPixelOffset(dimens.padding), 0)
            setBackgroundResource(background.resource)
        }

        setCompoundDrawablesWithIntrinsicBounds(model.style.icon.resource, 0,0,0)

        model.f.map { action -> setOnClickListener { action.f() } }

    }

}
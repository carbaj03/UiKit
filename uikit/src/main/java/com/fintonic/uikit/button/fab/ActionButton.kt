package com.fintonic.uikit.button.fab

import android.content.Context
import android.content.res.ColorStateList
import android.content.res.TypedArray
import android.content.res.XmlResourceParser
import android.graphics.Color
import android.support.design.widget.FloatingActionButton
import android.support.v4.content.ContextCompat
import android.support.v4.graphics.drawable.DrawableCompat
import android.util.AttributeSet
import com.fintonic.uikit.R
import com.fintonic.uikit.common.Component
import com.fintonic.uikit.common.None
import com.fintonic.uikit.common.Option
import com.fintonic.uikit.common.some
import org.xmlpull.v1.XmlPullParser


class ActionButton @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null
) : FloatingActionButton(context, attrs), Component<ActionButtonModel> {

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
        setImageResource(model.style.icon.resource)

        backgroundTintList = resources.getColorStateList(R.color.green)
//        backgroundTintList = ColorStateList(arrayOf(intArrayOf(android.R.attr.state_enabled)), intArrayOf(R.color.red))
//                model.style.background.resource.getColor(context))
//        rippleColor = model.style.background.tint.getColor(context)
        DrawableCompat.setTint(drawable, model.style.icon.color.getColor(context))
        model.f.map { action -> setOnClickListener { action.f() } }


    }

}
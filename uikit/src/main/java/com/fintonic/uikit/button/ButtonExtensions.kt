package com.fintonic.uikit.button

import android.support.v7.widget.AppCompatButton

fun AppCompatButton.setUp(model: BaseButtonModel) = with(model.style) {
    setPadding(resources.getDimensionPixelOffset(dimens.padding), 0, resources.getDimensionPixelOffset(dimens.padding), 0)
    setBackgroundResource(background.resource)

    setAllCaps(false)
    setTextColor(labelStyle.color.getColor(context))
    setTextSize(labelStyle.dimens.unit, labelStyle.dimens.size)
    typeface = labelStyle.font.getFont(context)
    text = model.value.transform()
}

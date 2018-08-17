package com.fintonic.uikit.common

import com.fintonic.uikit.button.ButtonModel

interface Component<M : Model> {
    fun render(model: M): Component<M>
}

interface LabelComponent<M : Model> {
    fun render(model: M): LabelComponent<M>
}

interface ButtonComponent<M : ButtonModel> {
    fun render(model: M): ButtonComponent<M>
}
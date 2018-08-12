package com.fintonic.uikit.common

interface Component<M : Model> {
    fun render(model: M): Component<M>
}
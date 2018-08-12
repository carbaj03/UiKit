package com.fintonic.example.buttons

import com.fintonic.uikit.button.ButtonModel


interface ButtonsView {
    fun showLabels(labels: List<ButtonModel>)

    fun showAlert(s: String)
}
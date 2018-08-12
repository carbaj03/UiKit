package com.fintonic.example.buttons

class ButtonsPresenter(
        private val view: ButtonsView,
        private val factory: FactoryResource
) {
    fun loadLabels() {
        view.showLabels(factory.getModels())
    }
}
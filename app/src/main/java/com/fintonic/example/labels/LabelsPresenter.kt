package com.fintonic.example.labels

class LabelsPresenter(
        private val view: LabelsView,
        private val factory: FactoryResource
) {
    fun loadLabels() {
        view.showLabels(factory.getModels())
    }
}
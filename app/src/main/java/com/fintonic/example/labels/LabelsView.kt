package com.fintonic.example.labels

import com.fintonic.uikit.label.LabelModel

interface LabelsView {
    fun showLabels(labels: List<LabelModel>)

    fun showAlert(s: String)
}
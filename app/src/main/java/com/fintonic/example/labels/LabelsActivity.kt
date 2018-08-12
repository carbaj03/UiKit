package com.fintonic.example.labels

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.fintonic.example.R
import com.fintonic.uikit.common.Eval
import com.fintonic.uikit.common.some
import com.fintonic.uikit.label.*
import kotlinx.android.synthetic.main.activity_labels.*

class LabelsActivity : AppCompatActivity(), LabelsView {

    private val presenter: LabelsPresenter by lazy { LabelsPresenter(this, factory) }

    private val factory by lazy { Factory(this, textParse) }

    private val textParse by lazy { TextParse(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_labels)

        presenter.loadLabels()

        //Modify xml label
        lblDisplayBig.render(LabelModel(H3Green, "Label Modify by code"))
    }

    override fun showLabels(labels: List<LabelModel>) =
            labels.forEach {
                labelProgrammaticallly.addView(Label(this).render(it))
            }


    override fun showAlert(s: String) =
            Toast.makeText(this, s, Toast.LENGTH_SHORT).show()
}


interface FactoryResource {
    fun getModels(): List<LabelModel>
}

class Factory(
        private val view: LabelsView,
        private val textParse: TextParse
) : FactoryResource {

    override fun getModels() = listOf(
            LabelModel(InputError, textParse.textParser(R.string.input_error)),
            LabelModel(Big33, textParse.textParser(R.string.big_33)),
            LabelModel(H1Black, textParse.textParser(R.string.h1_black)),
            LabelModel(H3Pink, textParse.textParser(R.string.h3_pink)),
            LabelModel(H3Pink, textParse.textParser("<i>H3 Pink from String<i>")),
            LabelModel(LinkBlueBig, textParse.textParser(R.string.link), Eval { view.showAlert("Hola") }.some()))
}

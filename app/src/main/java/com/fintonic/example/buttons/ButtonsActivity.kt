package com.fintonic.example.buttons

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.fintonic.example.R
import com.fintonic.uikit.button.*
import com.fintonic.uikit.common.Eval
import com.fintonic.uikit.common.some
import com.fintonic.uikit.text.TextParse
import kotlinx.android.synthetic.main.activity_buttons.*

class ButtonsActivity : AppCompatActivity(), ButtonsView {

    private val presenter: ButtonsPresenter by lazy { ButtonsPresenter(this, factory) }

    private val factory by lazy { Factory(this, textParse) }

    private val textParse by lazy { TextParse(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buttons)

        presenter.loadLabels()

        //Modify xml label
        btnDisplayBig.render(ButtonTextModel(PrimaryWhite, "Label Modify by code".toButtonText()))
        btnArrow.render(ActionButtonModel(Arrow, Eval { Toast.makeText(baseContext, "sf", Toast.LENGTH_SHORT).show() }.some()))
    }

    override fun showLabels(labels: List<ButtonModel>) =
            labels.forEach {
                labelProgrammaticallly.addView(Button(this).render(it))
            }

    override fun showAlert(s: String) =
            Toast.makeText(this, s, Toast.LENGTH_SHORT).show()
}

interface FactoryResource {
    fun getModels(): List<ButtonModel>
}

class Factory(
        private val view: ButtonsView,
        private val textParse: TextParse
) : FactoryResource {

    override fun getModels(): List<ButtonModel> =
            listOf(
                    ButtonTextModel(PrimaryBlue, textParse.textParserResource(R.string.input_error).toButtonText()),
                    ButtonTextModel(PrimaryWhite, textParse.textParserResource(R.string.big_33).toButtonText()),
                    ButtonIconModel(Whatsapp, textParse.textParserResource(R.string.big_33).toButtonText()),
                    ButtonTextModel(PrimaryWhite, textParse.textParserResource(R.string.h1_black).toButtonText()),
                    ButtonTextModel(PrimaryWhite, textParse.textParserResource(R.string.h3_pink).toButtonText()),
                    ButtonTextModel(PrimaryWhite, textParse.textParserHtml("<i>H3 Pink from String<i>").toButtonText()),
                    ButtonTextModel(PrimaryWhite, textParse.textParserResource(R.string.link).toButtonText(), Eval { view.showAlert("Hola") }.some()))

}

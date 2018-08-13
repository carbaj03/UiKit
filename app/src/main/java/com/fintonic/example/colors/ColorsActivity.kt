package com.fintonic.example.colors

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.fintonic.example.R
import kotlinx.android.synthetic.main.activity_main.*

class ColorsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_colors)

        colors.forEach {
            val text =  TextView(this)
            text.text = it.name
            text.setBackgroundColor(it.getColor(this))
            container.addView(text)
        }
    }
}

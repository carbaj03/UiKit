package com.fintonic.example.colors

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.fintonic.example.R
import kotlinx.android.synthetic.main.activity_main.*

class ColorsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        colors.forEach {
            val text =  TextView(this)
            text.text = it.name
            text.setBackgroundColor(Color.parseColor("#${it.hex}"))
            container.addView(text)
        }
    }
}

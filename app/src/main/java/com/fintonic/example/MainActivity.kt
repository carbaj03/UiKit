package com.fintonic.example

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.fintonic.example.buttons.ButtonsActivity
import com.fintonic.example.colors.ColorsActivity
import com.fintonic.example.labels.LabelsActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnColors.setOnClickListener {
            startActivity(Intent(this, ColorsActivity::class.java))
        }

        btnLabels.setOnClickListener {
            startActivity(Intent(this, LabelsActivity::class.java))
        }

        btnButtons.setOnClickListener {
            startActivity(Intent(this, ButtonsActivity::class.java))
        }

    }
}

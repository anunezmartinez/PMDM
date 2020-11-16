package com.example.mvcc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val miModelo by viewModels<MyViewModel>()
        miModelo.ronda.value
        val texto = findViewById<TextView>(R.id.textRonda)
        texto.text = miModelo.ronda.value.toString()
        miModelo.ronda.observe(this, Observer {
                nuevaRonda -> textRonda.text = nuevaRonda.toString()
        })

        sumarRonda.setOnClickListener(){
            miModelo.sumarRonda()
        }
    }
}
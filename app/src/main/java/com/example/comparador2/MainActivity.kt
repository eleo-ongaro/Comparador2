package com.example.comparador2

import android.os.Build.VERSION_CODES.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import viewmodel.MyViewModel



private lateinit var viewModel: MyViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(res.layout.activity_main.xml)
        viewModel = ViewModelProvider(this)[MyViewModel::class.java]
        val editText1 = findViewById<EditText>(R.id.editText1)
        val editText2 = findViewById<EditText>(R.id.editText2)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)

        findViewById<Button>(R.id.compareButton).setOnClickListener {
            val texto1 = editText1.text.toString()
            val texto2 = editText2.text.toString()

            val sonIguales = viewModel.compararTextos(texto1, texto2)

            if (sonIguales) {
                resultTextView.text = "Los textos son iguales."
            } else {
                resultTextView.text = "Los textos no son iguales."
            }
        }

    }
}
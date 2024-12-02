package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CalculatorActivity : AppCompatActivity() {

    private lateinit var elsoSzam: EditText
    private lateinit var masodikSzam: EditText
    private lateinit var osszeadas: Button
    private lateinit var torles: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_calculator)
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/

        elsoSzam = findViewById(R.id.elsoSzam)
        masodikSzam = findViewById(R.id.masodikSzam)
        osszeadas = findViewById(R.id.osszeadas)
        torles = findViewById(R.id.torles)
        
    }
}
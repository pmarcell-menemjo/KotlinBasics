package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.view.inputmethod.InputMethod
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class GreetingsActivity : AppCompatActivity() {
    private lateinit var nameEditText: EditText
    private lateinit var greetButton: Button
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_greeting)

        // UI elemek inicializálása
        nameEditText = findViewById(R.id.nameEditText)
        greetButton = findViewById(R.id.greetButton)
        resultTextView = findViewById(R.id.resultTextView)

        // gomb eseménykezelő beállítása
        greetButton.setOnClickListener(){
            // a bevitt név kiolvasása
            val name = nameEditText.text
            // ellenőrizzük hogy nem üres-e a név
            if(name.isNotEmpty()){
                // köszöntő szöveg összeállítása
                val greetingText = when {
                    name.length <= 3 -> "Szia $name! De rövid neved van!"
                    name.length >= 10 -> "Szia $name! De hosszú neved van!"
                    else -> "Hello $name!"
                }

                // eredmény megjelenítése
                resultTextView.text = greetingText

                // billentyűzet elrejtése
                hideKeyboard()

                // EditText tatalmának törlése
                nameEditText.text.clear()
            } else {
                Toast.makeText(
                    this,
                    "Kérlek adj meg egy nevet!",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    } // ONCREATE

    // segédfüggvény a billentyűzet elrejtéséhez
    private fun hideKeyboard(){
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(nameEditText.windowToken, 0)
    }
}
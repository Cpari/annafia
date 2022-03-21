package com.example.annafia.src.medicine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextPaint
import android.widget.Button
import android.widget.TextView
import com.example.annafia.R
import com.example.annafia.src.db.AppDatabase
import com.example.annafia.src.db.Medicine
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AddEditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_edit)


        val database = AppDatabase.getDatabase(this)
        val btnSave = findViewById<Button>(R.id.button2)


        btnSave.setOnClickListener {
            val name = findViewById<TextView>(R.id.editTextTextPersonName).text.toString()
            val description = findViewById<TextView>(R.id.editTextTextPersonName2).text.toString()
            val presentation1 = findViewById<TextView>(R.id.editTextTextPersonName3).text.toString()
            val presentation2 = findViewById<TextView>(R.id.editTextTextPersonName4).text.toString()
            val presentation3 = findViewById<TextView>(R.id.editTextTextPersonName5).text.toString()
            val presentation4 = findViewById<TextView>(R.id.editTextTextPersonName6).text.toString()
            val presentation5 = findViewById<TextView>(R.id.editTextTextPersonName7).text.toString()

            val medicine = Medicine(name, description, presentation1, presentation2, presentation3, presentation4, presentation5)

            CoroutineScope(Dispatchers.IO).launch {
                database.medicines().insertAll(medicine)
                this@AddEditActivity.finish()
            }

        }


    }
}
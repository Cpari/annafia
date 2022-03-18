package com.example.annafia.src

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import com.example.annafia.R

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)



        val dnLinear = findViewById<LinearLayout>(R.id.linearLayout)
        val deLinear = findViewById<LinearLayout>(R.id.linearLayout3)
        val paLinear = findViewById<LinearLayout>(R.id.linearLayout2)


        dnLinear.setOnClickListener {
            val intent = Intent(this, ListHomeActivity::class.java)
            startActivity(intent)
        }









    }
}
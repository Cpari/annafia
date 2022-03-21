package com.example.annafia.src

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.LinearLayout
import com.example.annafia.R
import com.example.annafia.src.medicine.MedicineHomeActivity

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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater : MenuInflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.mm_medicines -> {
                val intent = Intent(this, MedicineHomeActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }




}
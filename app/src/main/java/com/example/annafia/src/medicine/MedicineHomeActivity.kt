package com.example.annafia.src.medicine

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.ListView
import androidx.lifecycle.Observer
import com.example.annafia.R
import com.example.annafia.src.db.AppDatabase
import com.example.annafia.src.db.Medicine
import com.example.annafia.src.db.MedicineAdapter

class MedicineHomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_medicine_home)


        var voidList = emptyList<Medicine>()
        val database = AppDatabase.getDatabase(this)
        val medicineList = findViewById<ListView>(R.id.medicine_list)

        database.medicines().getAll().observe(this, Observer {
            voidList = it
            val adapter = MedicineAdapter(this, voidList)
            medicineList.adapter = adapter
        })




    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflate: MenuInflater = menuInflater
        inflate.inflate(R.menu.add_edit_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.add_item ->{
                val intent = Intent(this, AddEditActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }







}
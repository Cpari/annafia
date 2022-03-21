package com.example.annafia.src.db

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.annafia.R
import com.example.annafia.src.db.Medicine

class MedicineAdapter(private val mediContext: Context, private val listMedi: List<Medicine>): ArrayAdapter<Medicine>(mediContext, 0, listMedi) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layout = LayoutInflater.from(mediContext).inflate(R.layout.item_list, parent, false)
        val name = layout.findViewById<TextView>(R.id.name_item)
        val description = layout.findViewById<TextView>(R.id.descripcion_item)

        val data = listMedi[position]

        name.text = data.name
        description.text = data.description

        return layout

    }
}
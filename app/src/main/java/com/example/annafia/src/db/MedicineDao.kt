package com.example.annafia.src.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update


@Dao
interface MedicineDao {
    @Query("SELECT * FROM medicine")
    fun getAll(): LiveData<List<Medicine>>

    @Query("SELECT * FROM medicine WHERE idMedicine = :id")
    fun getAll(id: Int): LiveData<Medicine>

    @Insert
    fun insertAll(vararg medicine: Medicine)

    @Update
    fun insertAll(medicine: Medicine)
}
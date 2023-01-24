package com.example.myapplication.Model

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

interface PaymentDao {
    @Query("SELECT * FROM payment_table ORDER BY payment ASC")
    fun getPayments(): Flow<List<Payment>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(payment: Payment)

    @Query("DELETE FROM payment_table")
    suspend fun deleteAll()
}
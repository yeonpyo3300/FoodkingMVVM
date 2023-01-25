package com.example.myapplication.Model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Database(entities = [Payment::class], version = 1, exportSchema = false)
abstract class PaymentRoomDatabase : RoomDatabase() {

    abstract fun paymentDao(): PaymentDao

    companion object {
        @Volatile
        private var INSTANCE: PaymentRoomDatabase ?= null

        fun getDatabase(context: Context): PaymentRoomDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    PaymentRoomDatabase::class.java,
                    "payment_database"
                )
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }


}
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

    private class PaymentDatabaseCallback(
        private val scope: CoroutineScope
    ) : RoomDatabase.Callback() {

        override fun onCreate(db: SupportSQLiteDatabase) {
            super.onCreate(db)
            INSTANCE?.let { database ->
                scope.launch {
                    populateDatabase(database.paymentDao())
                }
            }
        }

        suspend fun populateDatabase(paymentDao: PaymentDao) {
            // Delete all content here.
            paymentDao.deleteAll()

            // Add sample payments.
            var payment = Payment("Hello")
            paymentDao.insert(payment)
            payment = Payment("World!")
            paymentDao.insert(payment)
        }
    }

    companion object {
        @Volatile
        private var INSTANCE: PaymentRoomDatabase ?= null

        fun getDatabase(context: Context, scope: CoroutineScope): PaymentRoomDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    PaymentRoomDatabase::class.java,
                    "payment_database"
                )
                    .fallbackToDestructiveMigration()
                    .addCallback(PaymentDatabaseCallback(scope))
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }


}
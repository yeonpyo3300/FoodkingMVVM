package com.example.myapplication.Model

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData

class PaymentRepository(private val paymentDao: PaymentDao) {

    val allPayments : LiveData<List<Payment>> = paymentDao.getPayments()

    suspend fun insert(payment: Payment) {
        paymentDao.insert(payment)
    }

    suspend fun deleteAll() {
        paymentDao.deleteAll()
    }

}
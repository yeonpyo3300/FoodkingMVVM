package com.example.myapplication.Model

import androidx.annotation.WorkerThread

class PaymentRepository(private val paymentDao: PaymentDao) {

    val allPayments = paymentDao.getPayments()
    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(payment: Payment) {
        paymentDao.insert(payment)
    }

}
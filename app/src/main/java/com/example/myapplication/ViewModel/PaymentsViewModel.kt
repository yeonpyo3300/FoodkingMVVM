package com.example.myapplication.ViewModel

import android.app.Application
import androidx.lifecycle.*
import com.example.myapplication.Model.Payment
import com.example.myapplication.Model.PaymentDao
import com.example.myapplication.Model.PaymentRepository
import com.example.myapplication.Model.PaymentRoomDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PaymentsViewModel(application: Application) : AndroidViewModel(application){

    val getPayments: LiveData<List<Payment>>
    private val repository:PaymentRepository

    init {
        val paymentDao = PaymentRoomDatabase.getDatabase(application).paymentDao()
        repository = PaymentRepository(paymentDao)
        getPayments = repository.allPayments
    }

    //Coroutine - Make it as background task
    fun insert(payment: Payment) = viewModelScope.launch(Dispatchers.IO) {
        repository.insert(payment)
    }

    fun deleteAll() = viewModelScope.launch ( Dispatchers.IO ) {
        repository.deleteAll()
    }

}
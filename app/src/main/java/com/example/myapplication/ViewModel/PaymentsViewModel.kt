package com.example.myapplication.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.myapplication.Model.Payment
import com.example.myapplication.Model.PaymentRepository
import kotlinx.coroutines.launch

class PaymentsViewModel(private val repository: PaymentRepository) : ViewModel(){

    val allPayments: LiveData<List<Payment>> = repository.allPayments.asLiveData()
    fun insert(payment: Payment) = viewModelScope.launch {
        repository.insert(payment)
    }

}
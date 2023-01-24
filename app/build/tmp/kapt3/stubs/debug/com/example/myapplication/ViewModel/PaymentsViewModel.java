package com.example.myapplication.ViewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/myapplication/ViewModel/PaymentsViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/myapplication/Model/PaymentRepository;", "(Lcom/example/myapplication/Model/PaymentRepository;)V", "allPayments", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/myapplication/Model/Payment;", "getAllPayments", "()Landroidx/lifecycle/LiveData;", "insert", "Lkotlinx/coroutines/Job;", "payment", "app_debug"})
public final class PaymentsViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.myapplication.Model.PaymentRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.myapplication.Model.Payment>> allPayments = null;
    
    public PaymentsViewModel(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.Model.PaymentRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.myapplication.Model.Payment>> getAllPayments() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insert(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.Model.Payment payment) {
        return null;
    }
}
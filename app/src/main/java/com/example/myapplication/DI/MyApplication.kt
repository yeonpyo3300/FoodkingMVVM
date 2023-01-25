//package com.example.myapplication.DI
//
//import android.app.Application
//import android.bluetooth.BluetoothAdapter.ERROR
//import com.example.myapplication.ViewModel.PaymentsViewModel
//import com.example.myapplication.Model.PaymentRepository
//import com.example.myapplication.Model.PaymentRoomDatabase
//import kotlinx.coroutines.CoroutineScope
//import kotlinx.coroutines.SupervisorJob
//import org.koin.android.ext.koin.androidApplication
//import org.koin.android.ext.koin.androidContext
//import org.koin.android.ext.koin.androidLogger
//import org.koin.android.viewmodel.dsl.viewModel
//import org.koin.core.context.startKoin
//import org.koin.dsl.module
//import java.util.logging.Level
//
//class MyApplication : Application() {
//
//    override fun onCreate() {
//        super.onCreate()
//        startKoin {
//            androidLogger(org.koin.core.logger.Level.ERROR)
//            androidContext(this@MyApplication)
//            modules(appModule)
//        }
//    }
//
//    private val appModule = module {
//        val applicationScope = CoroutineScope(SupervisorJob())
//
//        single {
//            PaymentRoomDatabase.getDatabase(androidApplication())
//        }
//        single {
//            PaymentRepository(get())
//        }
//        single {
//            get<PaymentRoomDatabase>().paymentDao()
//        }
//        viewModel {
//            PaymentsViewModel(get())
//        }
//    }
//
//}
package com.example.myapplication.Model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "payment_table")
data class Payment(@PrimaryKey @ColumnInfo(name = "payment") val payment: String)
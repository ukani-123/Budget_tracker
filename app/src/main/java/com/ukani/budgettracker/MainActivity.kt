package com.ukani.budgettracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {
    private lateinit var transactions : ArrayList<Transaction>
    private lateinit var transactionAdapter: TransactionAdapter
    private lateinit var layoutManager:LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        transactions = arrayListOf(
            Transaction("WeekEnd Budget",400.00),
            Transaction("Bananas",-4.00),
            Transaction("gasoline",-40.90),
            Transaction("Breakfast",-9.99),
            Transaction("Water Bottles",-4.00),
            Transaction("Suncream",-8.00),
            Transaction("CarPark",-15.00)
        )

        transactionAdapter = TransactionAdapter(transactions)
        layoutManager = LinearLayoutManager(applicationContext)

        
    }
}
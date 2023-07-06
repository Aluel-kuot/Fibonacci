package com.mama.fibonacci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.mama.fibonacci.databinding.ActivityMainBinding
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayFibNum()
    }

    fun fibonacci(n: Int): List<BigInteger> {
        val next = mutableListOf<BigInteger>(BigInteger.ZERO, BigInteger.ONE)
        while (next.size < n) {
            var nextNumber = next[next.lastIndex] + next[next.lastIndex - 1]
            next.add(nextNumber)
        }
        return next
    }

    fun displayFibNum() {
        binding.rvNumbers.layoutManager = LinearLayoutManager(this)
        val fibAdapter = NumbersRvAdapter(fibonacci(100))
        binding.rvNumbers.adapter = fibAdapter

    }
}




package com.example.itc362_hw1_ex4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.itc362_hw1_ex4.databinding.ActivityMainBinding


class UserTapCounter {
    private var tapCount: Int = 0
    fun addCount() {
        tapCount++
    }

    fun getCount(): Int {
        return tapCount
    }
}


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var count = UserTapCounter()
        val display = binding.TapCounter
        val btn = binding.TapButton

        btn.setOnClickListener {
            count!!.addCount()

            display?.setText(count.getCount().toString())
        }
    }
}
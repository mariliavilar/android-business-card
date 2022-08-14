package com.mariliavilar.businesscard.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mariliavilar.businesscard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // [BINDING#2]
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // [BINDING#3]
        setContentView(binding.root)
    }
}

package com.example.mainactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mainactivity.databinding.ActivitySegundaBinding

class SegundaActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySegundaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySegundaBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.btnAccion1.setOnClickListener { finish() }
    }
}
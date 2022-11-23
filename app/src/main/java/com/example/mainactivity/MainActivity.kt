package com.example.mainactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mainactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnAccion.setOnClickListener { navegarSegundaActivity() }

    }

    private fun navegarSegundaActivity() {
        val intent = Intent(this, SegundaActivity::class.java)
        startActivity(intent)
    }
}
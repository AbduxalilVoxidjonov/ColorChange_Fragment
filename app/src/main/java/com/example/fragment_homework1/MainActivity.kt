package com.example.fragment_homework1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.fragment_homework1.databinding.ActivityMainBinding
import com.example.fragment_homework1.databinding.FragmentColorBinding
import com.example.fragment_homework1.databinding.FragmentColorItemBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    @SuppressLint("CommitTransaction")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction().add(R.id.container,Fragment_Color()).commit()

    }
}
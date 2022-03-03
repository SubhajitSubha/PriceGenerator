package com.example.pricegenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.ViewModelProvider

import com.example.pricegenerator.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.lifecycleOwner = this
        binding.button.setOnClickListener {
            viewModel.ans=""
            Log.i("button1","add fun called")

            viewModel.add(binding.price.text.toString(),binding.percentage.text.toString())
            //binding.result.text= viewModel.ans
            Log.i("TextView","${binding.result.text}")
        }
        binding.button2.setOnClickListener{
            viewModel.ans=""
            Log.i("button1","discount fun called")
            viewModel.discount(binding.price.text.toString(),binding.percentage.text.toString())
            //binding.result.text = viewModel.ans
        }


    }



}



package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.counterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.clickMeBtn.setOnClickListener {
            //get text from count display
            var count = binding.displayCountTextView.text.toString().toInt()
//            // increase count and Display Count
            binding.displayCountTextView.text = (++count).toString()
        }
    }
}
package com.example.randomnumbercreator_006

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.randomnumbercreator_006.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnid.setOnClickListener {
            val from = binding.rangeid.values[0]
            val to = binding.rangeid.values[1]

            if (binding.checkid.isChecked) {
                val randomNumber = Random.nextInt(from.toInt(), to.toInt())
                binding.txtid.text = "generated: $randomNumber"
            } else {

                val randomNumber = Random.nextDouble(from.toDouble(), to.toDouble())
                binding.txtid.text = String.format("generated: %.3f", randomNumber)
            }
        }

    }
}
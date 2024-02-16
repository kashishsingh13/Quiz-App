package com.example.quizapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quizapplication.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding:ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val username= intent.getStringExtra(Constants.USER_NAME)
        binding.tvName.text= username
        val totalquestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        val correctanswer = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)
        binding.tvScore.text= " $correctanswer/$totalquestions"

        binding.finish.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }

    }
}
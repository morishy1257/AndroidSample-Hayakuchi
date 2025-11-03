package com.example.hayakuchi

import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.hayakuchi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener, TextToSpeech.OnInitListener {
    private lateinit var binding: ActivityMainBinding
    private lateinit var tts: TextToSpeech

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        tts = TextToSpeech(this@MainActivity, this@MainActivity)

        binding.btnFast.setOnClickListener(this)
        binding.btnNormal.setOnClickListener(this)
        binding.btnSlow.setOnClickListener(this)
    }

    override fun onInit(status: Int){

    }

    override fun onClick(v: View){

    }
}
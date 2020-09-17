package com.example.volumecontrol

import android.media.AudioManager
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val upBtn = findViewById<Button>(R.id.btnUp)
        val downBtn = findViewById<Button>(R.id.btnDown)

        val audioManager = applicationContext.getSystemService(AUDIO_SERVICE) as AudioManager

        upBtn.setOnClickListener {
            audioManager.adjustVolume(AudioManager.ADJUST_RAISE,AudioManager.FLAG_PLAY_SOUND)
        }

        downBtn.setOnClickListener {
            audioManager.adjustVolume(AudioManager.ADJUST_LOWER,AudioManager.FLAG_PLAY_SOUND)
        }
    }
}
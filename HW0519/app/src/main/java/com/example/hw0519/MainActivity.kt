package com.example.hw0519

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var startBtn: Button
    private lateinit var stopBtn: Button
    private lateinit var musicImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // assigning ID of startButton
        // to the object start
        startBtn = findViewById(R.id.startButton);

        // assigning ID of stopButton
        // to the object stop
        stopBtn = findViewById(R.id.stopButton);

        musicImage = findViewById(R.id.musicImage);
        // declaring listeners for the
        // buttons to make them respond
        // correctly according to the process
        startBtn.setOnClickListener(this);
        stopBtn.setOnClickListener(this);
    }

    override fun onClick(v: View?) {
        if(v===startBtn){
            musicImage.visibility=View.VISIBLE
            startService(Intent(this,Service::class.java))
        }else{
            musicImage.visibility=View.GONE
            stopService(Intent(this,Service::class.java))
        }
    }
}
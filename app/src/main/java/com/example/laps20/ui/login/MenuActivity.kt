package com.example.laps20.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import com.example.laps20.R

class MenuActivity : AppCompatActivity() {
    lateinit var ButtonUpload : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        ButtonUpload=findViewById(R.id.button_camera)

        ButtonUpload!!.setOnClickListener {
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

            startActivityForResult(takePictureIntent,1)
        }
    }


}
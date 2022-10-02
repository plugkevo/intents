package com.example.intents

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity(){
    lateinit var button1 : TextView
    lateinit var button2 : TextView
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1 = findViewbyId(R.id.btn1)
        button2 = findViewbyId(R.id.btn2)

        button1.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://zalegoacademy.ac.ke/"))
            startActivity(intent)
        }
        button2.setOnClickListener {
            var open = Intent(this,HomeActivity::class.java)
            startActivity(open)
        }



    }
}
package com.example.lokogame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

    }

    override fun onResume() {
        super.onResume()
        next()
    }

    fun next(){
        Thread.sleep(1000)

    var next: Intent = Intent(this, Main2Activity::class.java)
    startActivity(next)
    };
}

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
    fun change2 (){
        var next: Intent = Intent(this, Main2Activity::class.java)
        startActivity(next)
    }

    fun main() {
        Thread.sleep(500);change2()

    }

}

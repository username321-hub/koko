package com.example.lokogame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun gg (v: View) {
        var next: Intent = Intent(this, dsd::class.java)
        startActivity(next)
    }
}

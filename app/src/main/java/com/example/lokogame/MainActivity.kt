package com.example.lokogame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    var ed:Float=5f
    var ehp:Float=50f
    var d:Float=10f
    var hp:Float=25f


    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun attack (v: View):Unit{
        ehp=ehp-d
        hp=hp-ed
    }

    fun gg (v: View) :Unit{
        var next: Intent = Intent(this, dsd::class.java)
        startActivity(next)
    }
}




package com.example.lokogame

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {
    var sum = 0
    var myArray : Array<Int> = arrayOf(4,5,2,3)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun name () {
        for (a in 0..myArray.size - 1){
            sum = sum + myArray[a]
            myArray[a] = uio.text.toString().toInt()
        }
    }
}

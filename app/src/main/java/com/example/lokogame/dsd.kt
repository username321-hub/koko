package com.example.lokogame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_dsd.*

class dsd : AppCompatActivity() {
    var x = 0
    var d = 10
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dsd)
    }
fun win (v:View){
   x=x+30
}
    fun change(v: View){
                textView3.text = "🅈🄾🅄 🄷🄰🅅🄴 "+ x.toString() +" 🄲🄾🄸🄽🅂"
    }
    fun buy (v: View){
        if (x<=30){
            d=30
        }
    }


}

package com.example.a27012022

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckedTextView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ser = findViewById<CheckedTextView>(R.id.sera)
        val chleb = findViewById<CheckedTextView>(R.id.Chleba)
        val mleko = findViewById<CheckedTextView>(R.id.Mlekoa)
        val bulka = findViewById<CheckedTextView>(R.id.Bułkaa)
        val sol = findViewById<CheckedTextView>(R.id.Sóla)

        findViewById<Button>(R.id.buttonadd).setOnClickListener {
            if(ser.isChecked){
                findViewById<TextView>(R.id.textview).text.toString() + "\n Ser"
            }
            else if(chleb.isChecked){
                findViewById<TextView>(R.id.textview).text.toString() + "\n Chleb"
            }
            else if(mleko.isChecked){
                findViewById<TextView>(R.id.textview).text.toString() + "\n Mleko"
            }
            else if(bulka.isChecked){
                findViewById<TextView>(R.id.textview).text.toString() + "\n Bułka"
            }
            else if(sol.isChecked){
                findViewById<TextView>(R.id.textview).text.toString() + "\n Sól"
            }
        }
    }
}
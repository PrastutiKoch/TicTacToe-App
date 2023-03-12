package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var start=findViewById<Button>(R.id.button)
        var p1=findViewById<EditText>(R.id.player1)
        var p2=findViewById<EditText>(R.id.player2)



        start.setOnClickListener {

            var player1=p1.text.trim().toString()
            var player2=p2.text.trim().toString()

            if (player1.isEmpty() || player2.isEmpty()){

                Toast.makeText(this, "Enter players name", Toast.LENGTH_SHORT).show()

            }
            else {
                var intent = Intent(this, NextActivity::class.java)
                intent.putExtra("cross", player1)
                intent.putExtra("zero", player2)

                startActivity(intent)
            }

        }


    }

    override fun onBackPressed() {
        finishAffinity()
    }
}
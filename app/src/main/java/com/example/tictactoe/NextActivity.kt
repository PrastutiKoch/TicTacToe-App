package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class NextActivity : AppCompatActivity() {
    private var backPressedTime: Long = 0
    private var backToast: Toast? = null

    var index = 0
    var one_cross = false
    var two_cross = false
    var three_cross = false
    var four_cross = false
    var five_cross = false
    var six_cross = false
    var seven_cross = false
    var eight_cross = false
    var nine_cross = false


    var one_zero = false
    var two_zero = false
    var three_zero = false
    var four_zero = false
    var five_zero = false
    var six_zero = false
    var seven_zero = false
    var eight_zero = false
    var nine_zero = false

    var cross = ""
    var zero = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        var intent=intent
        cross = intent.getStringExtra("cross").toString()
        zero = intent.getStringExtra("zero").toString()
        playerTurn()

        var one=findViewById<ImageView>(R.id.one)
        var two=findViewById<ImageView>(R.id.two)
        var three=findViewById<ImageView>(R.id.three)
        var four=findViewById<ImageView>(R.id.four)
        var five=findViewById<ImageView>(R.id.five)
        var six=findViewById<ImageView>(R.id.six)
        var seven=findViewById<ImageView>(R.id.seven)
        var eight=findViewById<ImageView>(R.id.eight)
        var nine=findViewById<ImageView>(R.id.nine)
        var reset=findViewById<Button>(R.id.reset)
        var exit=findViewById<Button>(R.id.exit)
        one.setOnClickListener {

            if (index % 2 == 0) {
                one.setImageResource(R.drawable.cross_icon)
                one_cross = true
            } else {
                one.setImageResource(R.drawable.zero_icon)
                one_zero = true
            }

            one.isEnabled = false
            index++

            crossWin()
            zeroWin()
            playerTurn()


        }
        two.setOnClickListener {

            if (index % 2 == 0) {
                two.setImageResource(R.drawable.cross_icon)
                two_cross = true
            } else {
                two.setImageResource(R.drawable.zero_icon)
                two_zero = true
            }

            two.isEnabled = false
            index++
            crossWin()
            zeroWin()
            playerTurn()

        }

        three.setOnClickListener {

            if (index % 2 == 0) {
                three.setImageResource(R.drawable.cross_icon)
                three_cross = true
            } else {
                three.setImageResource(R.drawable.zero_icon)
                three_zero = true
            }

            three.isEnabled = false
            index++
            crossWin()
            zeroWin()
            playerTurn()

        }

        four.setOnClickListener {

            if (index % 2 == 0) {
                four.setImageResource(R.drawable.cross_icon)
                four_cross = true
            } else {
                four.setImageResource(R.drawable.zero_icon)
                four_zero = true
            }

            four.isEnabled = false
            index++
            crossWin()
            zeroWin()
            playerTurn()

        }

        five.setOnClickListener {

            if (index % 2 == 0) {
                five.setImageResource(R.drawable.cross_icon)
                five_cross = true
            } else {
                five.setImageResource(R.drawable.zero_icon)
                five_zero = true
            }

            five.isEnabled = false
            index++
            crossWin()
            zeroWin()
            playerTurn()

        }

        six.setOnClickListener {

            if (index % 2 == 0) {
                six.setImageResource(R.drawable.cross_icon)
                six_cross = true
            } else {
                six.setImageResource(R.drawable.zero_icon)
                six_zero = true
            }

            six.isEnabled = false
            index++
            crossWin()
            zeroWin()
            playerTurn()

        }

        seven.setOnClickListener {

            if (index % 2 == 0) {
                seven.setImageResource(R.drawable.cross_icon)
                seven_cross = true
            } else {
                seven.setImageResource(R.drawable.zero_icon)
                seven_zero = true
            }

            seven.isEnabled = false
            index++
            crossWin()
            zeroWin()
            playerTurn()

        }

        eight.setOnClickListener {

            if (index % 2 == 0) {
                eight.setImageResource(R.drawable.cross_icon)
                eight_cross = true
            } else {
                eight.setImageResource(R.drawable.zero_icon)
                eight_zero = true
            }

            eight.isEnabled = false
            index++
            crossWin()
            zeroWin()
            playerTurn()

        }

        nine.setOnClickListener {

            if (index % 2 == 0) {
                nine.setImageResource(R.drawable.cross_icon)
                nine_cross = true
            } else {
                nine.setImageResource(R.drawable.zero_icon)
                nine_zero = true
            }

            nine.isEnabled = false
            index++
            crossWin()
            zeroWin()
            playerTurn()


        }
        reset.setOnClickListener {
            resetGame()
        }
        exit.setOnClickListener {

            val builder = AlertDialog.Builder(this)
            builder.setMessage("DO YOU WANT TO EXIT?")
            builder.setPositiveButton("YES") { dialog, which ->

                startActivity(Intent(this, MainActivity::class.java))
                finish()


            }
            builder.setNegativeButton("NO"
            ) { dialog, which -> }
            val alertDialog = builder.create()

            alertDialog.show()




        }


    }



    private fun resetGame() {
            var winner = findViewById<TextView>(R.id.winner)
            var player = findViewById<TextView>(R.id.player)
            var one = findViewById<ImageView>(R.id.one)
            var two = findViewById<ImageView>(R.id.two)
            var three = findViewById<ImageView>(R.id.three)
            var four = findViewById<ImageView>(R.id.four)
            var five = findViewById<ImageView>(R.id.five)
            var six = findViewById<ImageView>(R.id.six)
            var seven = findViewById<ImageView>(R.id.seven)
            var eight = findViewById<ImageView>(R.id.eight)
            var nine = findViewById<ImageView>(R.id.nine)
            index = 0
            one_cross = false
            two_cross = false
            three_cross = false
            four_cross = false
            five_cross = false
            six_cross = false
            seven_cross = false
            eight_cross = false
            nine_cross = false


            one_zero = false
            two_zero = false
            three_zero = false
            four_zero = false
            five_zero = false
            six_zero = false
            seven_zero = false
            eight_zero = false
            nine_zero = false

            one.isEnabled = true
            two.isEnabled = true
            three.isEnabled = true
            four.isEnabled = true
            five.isEnabled = true
            six.isEnabled = true
            seven.isEnabled = true
            eight.isEnabled = true
            nine.isEnabled = true

            one.setImageDrawable(null)
            two.setImageDrawable(null)
            three.setImageDrawable(null)
            four.setImageDrawable(null)
            five.setImageDrawable(null)
            six.setImageDrawable(null)
            seven.setImageDrawable(null)
            eight.setImageDrawable(null)
            nine.setImageDrawable(null)

            playerTurn()

            winner.visibility = View.GONE
            player.visibility = View.VISIBLE
        }

        private fun gameOver() {
            var one=findViewById<ImageView>(R.id.one)
            var two=findViewById<ImageView>(R.id.two)
            var three=findViewById<ImageView>(R.id.three)
            var four=findViewById<ImageView>(R.id.four)
            var five=findViewById<ImageView>(R.id.five)
            var six=findViewById<ImageView>(R.id.six)
            var seven=findViewById<ImageView>(R.id.seven)
            var eight=findViewById<ImageView>(R.id.eight)
            var nine=findViewById<ImageView>(R.id.nine)

            one.isEnabled = false
            two.isEnabled = false
            three.isEnabled = false
            four.isEnabled = false
            five.isEnabled = false
            six.isEnabled = false
            seven.isEnabled = false
            eight.isEnabled = false
            nine.isEnabled = false


        }
        fun crossWin() {
            var winner=findViewById<TextView>(R.id.winner)
            var player=findViewById<TextView>(R.id.player)

            if ((one_cross && two_cross && three_cross) ||
                (four_cross && five_cross && six_cross) ||
                (seven_cross && eight_cross && nine_cross) ||
                (one_cross && five_cross && nine_cross) ||
                (three_cross && five_cross && seven_cross) ||
                (one_cross && four_cross && seven_cross) ||
                (two_cross && five_cross && eight_cross) ||
                (three_cross && six_cross && nine_cross)
            ) {

                gameOver()

                winner.text = "Winner is $cross"
                player.visibility = View.GONE
                winner.visibility = View.VISIBLE


            }

        }
        fun zeroWin() {
            var winner=findViewById<TextView>(R.id.winner)
            var player=findViewById<TextView>(R.id.player)

            if ((one_zero && two_zero && three_zero) ||
                (four_zero && five_zero && six_zero) ||
                (seven_zero && eight_zero && nine_zero) ||
                (one_zero && five_zero && nine_zero) ||
                (three_zero && five_zero && seven_zero) ||
                (one_zero && four_zero && seven_zero) ||
                (two_zero && five_zero && eight_zero) ||
                (three_zero && six_zero && nine_zero)
            ) {


                gameOver()

                winner.text = "Winner is $zero"
                player.visibility = View.GONE
                winner.visibility = View.VISIBLE

            }

        }
       fun playerTurn() {
            val player=findViewById<TextView>(R.id.player)

            if (index % 2 == 0) {
                player.text = "Turn of $cross"
            } else {
                player.text = "Turn of $zero"
            }

        }
        override fun onBackPressed() {

            if (backPressedTime + 2000 > System.currentTimeMillis()) {
                backToast?.cancel()
                finishAffinity()
            } else {
                backToast = Toast.makeText(baseContext, "Double press to Exit", Toast.LENGTH_SHORT)
                backToast?.show()
            }
            backPressedTime = System.currentTimeMillis()

        }

    }

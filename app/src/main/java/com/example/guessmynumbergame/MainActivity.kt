package com.example.guessmynumbergame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var number = 5
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        game_top.text =
            String.format(resources.getString(R.string.game_question), number.toString())
    }

    fun clickDownward(view: View) {
        if (number == 5) {
            number = 3
            question()
            game_top.text =
                String.format(resources.getString(R.string.game_question), number.toString())
        } else if (number == 3) {
            number = 2
            question()
            game_top.text =
                String.format(resources.getString(R.string.game_question), number.toString())
        } else if (number == 2) {
            number = 1
            question()
            game_top.text =
                String.format(resources.getString(R.string.game_question), number.toString())
        }
        if (number == 8) {
            number = 7
            question()
            game_top.text =
                String.format(resources.getString(R.string.game_question), number.toString())
        } else if (number == 7) {
            number = 6
            question()
            game_top.text =
                String.format(resources.getString(R.string.game_question), number.toString())
        }
    }

    fun clickUpward(view: View) {
        if (number == 5) {
            number = 8
            game_top.text =
                String.format(resources.getString(R.string.game_question), number.toString())
            question()
        } else if (number == 8) {
            number = 9
            question()
            game_top.text =
                String.format(resources.getString(R.string.game_question), number.toString())
        } else if (number == 9) {
            number = 10
            question()
            game_top.text =
                String.format(resources.getString(R.string.game_question), number.toString())
        }
        if (number == 3) {
            number = 4
            question()
            game_top.text =
                String.format(resources.getString(R.string.game_question), number.toString())
        }
    }

    fun clickReset(view: View) {
        number = 5
        game_result.visibility = View.INVISIBLE
        game_top.visibility = View.VISIBLE
        question()

    }

    fun clickCheck(view: View) {
        game_top.visibility = View.INVISIBLE
        game_result.visibility = View.VISIBLE
        game_result.text =
            String.format(resources.getString(R.string.game_success), number.toString())
    }
    fun question(){
        String.format(resources.getString(R.string.game_question), number.toString())
    }
}
/*
This is a simple guessing game of numbers between 1 and 10, for android in kotlin
Here I learned :-
* A new library of synthetic which reduced my line of codes while referencing any id from XML to MainActivity Page.
* I also learned about putting any text in any Text view by ( IDofVIEW.text ).
* Learned to change visibility of the View of any view.
*/
package com.example.guessmynumbergame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var number = 5
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        game_top.text =
            String.format(resources.getString(R.string.game_question), number.toString())
    }

    fun clickDownward(v: View) {
        when (number) {
            5 -> {
                number = 3
                question()
                game_top.text =
                    String.format(resources.getString(R.string.game_question), number.toString())
            }
            3 -> {
                number = 2
                question()
                game_top.text =
                    String.format(resources.getString(R.string.game_question), number.toString())
            }
            2 -> {
                number = 1
                question()
                game_top.text =
                    String.format(resources.getString(R.string.game_question), number.toString())
            }
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

    fun clickUpward(v:View) {
        when (number) {
            5 -> {
                number = 8
                game_top.text =
                    String.format(resources.getString(R.string.game_question), number.toString())
                question()
            }
            8 -> {
                number = 9
                question()
                game_top.text =
                    String.format(resources.getString(R.string.game_question), number.toString())
            }
            9 -> {
                number = 10
                question()
                game_top.text =
                    String.format(resources.getString(R.string.game_question), number.toString())
            }
        }
        if (number == 3) {
            number = 4
            question()
            game_top.text =
                String.format(resources.getString(R.string.game_question), number.toString())
        }
    }

    fun clickReset(v: View) {
        number = 5
        game_result.visibility = View.INVISIBLE
        game_top.visibility = View.VISIBLE
        question()

    }

    fun clickCheck(v: View) {
        game_top.visibility = View.INVISIBLE
        game_result.visibility = View.VISIBLE
        game_result.text =
            String.format(resources.getString(R.string.game_success), number.toString())
    }
    private fun question(){
        String.format(resources.getString(R.string.game_question), number.toString())
    }
}
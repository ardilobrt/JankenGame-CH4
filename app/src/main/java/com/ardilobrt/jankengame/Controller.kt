package com.ardilobrt.jankengame

// kalau class tanpa constructor, tanda kurungnya bisa di hapus
class Controller {

    private val draw = 0
    private val rock = 1
    private val paper = 2
    private val scissor = 3

    fun ruleGame(hand1: Int, hand2: Int): Int {

        val result = when {
            hand1 == rock && hand2 == paper || hand1 == paper && hand2 == rock -> paper
            hand1 == paper && hand2 == scissor || hand1 == scissor && hand2 == paper -> scissor
            hand1 == scissor && hand2 == rock || hand1 == rock && hand2 == scissor -> rock
            else -> draw
        }
        return result
    }

    fun showWinner(result: Int): String {

        val resultText = when (result) {
            1 -> "PLAYER 1 WIN"
            2 -> "PLAYER 2 WIN"
            else -> "DRAW"
        }
        return resultText
    }
}
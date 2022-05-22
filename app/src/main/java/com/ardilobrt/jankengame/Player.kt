package com.ardilobrt.jankengame


class Player(private var name: String) {

    var handId: Int = 0
    lateinit var hand: String

    fun showLogPlayer(): String {

        this.hand = getHandName()
        return "${this.name} Choose ${this.hand}"
    }

    private fun getHandName(): String {

        val handName = when (handId) {
            1 -> "Rock"
            2 -> "Paper"
            3 -> "Scissor"
            else -> "None"
        }
        return handName
    }

}
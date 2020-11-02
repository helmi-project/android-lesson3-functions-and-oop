package com.androidatc.lesson03.E12_ClassVariables

/**
 * Created by HELMI on 10/29/2019.
 */

class Game {
    companion object { // Variable yang ingin sama di setiap objek, bukan instance variable
        val gamesPlayed = 10 // Variable ini tetap valuenya karena val
    }
}

fun main() {
    var game1 = Game()

    println(Game.gamesPlayed) // Mengaksesnya langsung dengan nama class, bukan nama instance class
}
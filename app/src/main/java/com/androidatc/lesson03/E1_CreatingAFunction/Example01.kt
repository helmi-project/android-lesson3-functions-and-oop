package com.androidatc.lesson03.E1_CreatingAFunction

/**
 * Created by HELMI on 10/28/2019.
 */

fun main() {
    println("Hello Android ATC")

    var result = sum(2, 3) // Tidak perlu menyatakan z karena tahu function punya return value
    println("Sum Result = $result")

    var y = sales(4)
    println(y)
}

fun sum(x: Int, y: Int): Int { // Harus menyatakan tipe data return-nya :Int, kalau tidak jadi unit
    var z = x+y
    return z
}

fun sales(x: Int): Int {
    return 2*x
}
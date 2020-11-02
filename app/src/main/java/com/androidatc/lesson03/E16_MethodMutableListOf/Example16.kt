package com.androidatc.lesson03.E16_MethodMutableListOf

/**
 * Created by HELMI on 10/29/2019.
 */

fun main() {
    var mylist = listOf(1, "Android ATC", 500)

    println(mylist)

    // mylist[0] = 200 List tidak bisa diubah nilainya meskipun bertipe var

    var mylist2 = mutableListOf(1, "Android ATC", 500)

    mylist2[0] = 200

    println(mylist2)
}
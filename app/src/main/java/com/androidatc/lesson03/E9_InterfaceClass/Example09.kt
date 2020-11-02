package com.androidatc.lesson03.E9_InterfaceClass

/**
 * Created by HELMI on 10/29/2019.
 */

interface Calc {
    fun sum(x: Int, y: Int)
    //fun multiply(w: Int, z: Int)
}

class Math1: Calc {
    override fun sum(x: Int, y: Int) {
        var sumtotal = x+y
        println("Sum = $sumtotal")
    }
}

class Math2: Calc {
    override fun sum(x: Int, y: Int) {
        // var subtract = x-y
        // println("Subtract = $subtract")
    }
}

fun main() {
    var operation = Math1()

    operation.sum(1, 2)
}
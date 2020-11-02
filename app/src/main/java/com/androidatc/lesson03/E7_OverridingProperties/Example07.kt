package com.androidatc.lesson03.E7_OverridingProperties

/**
 * Created by HELMI on 10/29/2019.
 */

open class Computer {
    open var x: Int = 5
    var y: Int = 11
}

class Tablet: Computer() {
    override var x: Int = 20
}

fun main() {
    var laptop = Computer()
    var machine = Tablet()

    println(laptop.x)
    println(machine.x)
    println(laptop.y)
}
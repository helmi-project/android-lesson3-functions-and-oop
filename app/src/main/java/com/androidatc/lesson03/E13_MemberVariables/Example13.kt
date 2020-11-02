package com.androidatc.lesson03.E13_MemberVariables

/**
 * Created by HELMI on 10/29/2019.
 */

open class Airplane() {
    var type: String?= null
    protected var capacity: Int?= null

    constructor(tipe: String, kapasitas: Int): this() {
        this.type = tipe
        this.capacity = kapasitas

        println("Airplane Type : "+this.type)
        println("Airplane Capacity : "+this.capacity)
    }
}

class Bus(): Airplane()

var volvo_bus = Bus()

fun main() {
    // println(volvo_bus.capacity) Tidak bisa mengakses variable protect di function main
}
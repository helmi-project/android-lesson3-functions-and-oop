package com.androidatc.lesson03.E3_CreatingAClass

/**
 * Created by HELMI on 10/28/2019.
 */

class car {
    var type: String?= null
    var maxspeed: Int?= null
    var number_of_seats: Int?= null
}

fun main() {
    var AndroidCar = car()
    AndroidCar.type = "Toyota"
    AndroidCar.maxspeed = 200
    AndroidCar.number_of_seats = 4

    println("Car Type: ${AndroidCar.type}")
    println("Maximum Speed: ${AndroidCar.maxspeed}")
    println("Number of Seats: ${AndroidCar.number_of_seats}")
}
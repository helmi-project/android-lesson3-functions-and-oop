package com.androidatc.lesson03.E11_EnumClass

/**
 * Created by HELMI on 10/29/2019.
 */

enum class Colleges {
    ITCollege,
    BusinessCollege,
    ArtsCollege,
    EngineeringCollege
}

fun main() {
    var major = Colleges.EngineeringCollege

    println(major)
}
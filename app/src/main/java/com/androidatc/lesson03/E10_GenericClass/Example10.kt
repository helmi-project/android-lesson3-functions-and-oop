package com.androidatc.lesson03.E10_GenericClass

/**
 * Created by HELMI on 10/29/2019.
 */

class Permission <T> {
    var UserName: T?= null
    var Password: T?= null
}

fun main() {
    var x = Permission<String>()

    x.UserName = "William"
    x.Password = "Android"

    println("User Name: ${x.UserName} & Password: ${x.Password}")

    var y = Permission<Int>()

    y.UserName = 2018
    y.Password = 123

    println("User Name: ${y.UserName} & Password: ${y.Password}")
}
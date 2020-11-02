package com.androidatc.lesson03.E2_FunctionsAndVariableScope

/**
 * Created by HELMI on 10/28/2019.
 */

fun main() {
    name("Android ATC")
}

fun name (My_Company: String) {
    var My_Company = "Yahoo"
    println("My Company Name is : $My_Company")
}
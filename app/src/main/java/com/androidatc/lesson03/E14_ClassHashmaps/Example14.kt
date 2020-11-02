package com.androidatc.lesson03.E14_ClassHashmaps

/**
 * Created by HELMI on 10/29/2019.
 */

fun main() {
    var myhashmap = HashMap<String, String>() // Bisa pakai tipe data yang lain <>
    var myhashmap2 = hashMapOf<Int, Int>(1 to 100, 2 to 200, 3 to 300)

    myhashmap.put("Ok", "Okay")
    myhashmap.put("Y", "Yes")
    myhashmap.put("a", "Android")
    myhashmap.put("Abc", "Google")

    println(myhashmap.get("Ok"))
    println(myhashmap.get("Y"))
    println(myhashmap.get("a"))
    println(myhashmap.get("Abc"))

    for (x in myhashmap.keys) {
        println(myhashmap.get(x))
    }

    for (x in myhashmap2.keys) {
        println(myhashmap2.get(x))
    }
}
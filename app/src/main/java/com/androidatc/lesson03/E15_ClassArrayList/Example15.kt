package com.androidatc.lesson03.E15_ClassArrayList

/**
 * Created by HELMI on 10/29/2019.
 */

var x = arrayOf(10, 20, 30, 40, 50)

fun main() {
    var myArrayList = ArrayList<Int>()

    myArrayList.add(20)
    myArrayList.add(30)
    myArrayList.add(50)

    println(myArrayList)
    println(myArrayList.get(0))

    for (number in myArrayList) {
        println(number)
    }

    for (index in 0..myArrayList.size-1) {
        println(myArrayList[index])
    }

    if (myArrayList.contains(30)) {
        println("This number is exist !!!")
    }

    myArrayList.add(30) // Menambahkan 1 elemen bernilai 30 / index[3]
    myArrayList.remove(30) // Menghapus 1 elemen pertama yang memiliki nilai 30 / index[1]

    println(myArrayList)

    myArrayList.set(1, 1000)

    println(myArrayList)

    for (index in x) {
        println(index)
    }
}
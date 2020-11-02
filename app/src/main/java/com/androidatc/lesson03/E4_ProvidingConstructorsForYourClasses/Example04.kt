package com.androidatc.lesson03.E4_ProvidingConstructorsForYourClasses

/**
 * Created by HELMI on 10/28/2019.
 */

class Student {
    var Name: String?= null
    var College: String?= null
    var Age: Int?= null

    constructor(Nama: String, Fakultas: String, Umur: Int) {
        this.Name = Nama
        this.College = Fakultas
        this.Age = Umur

        println("Name : "+this.Name)
        println("College : "+this.College)
        println("Age : "+this.Age)
    }
}

fun main() {
    var ITStudent = Student("William", "Business", 19)
}
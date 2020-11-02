package com.androidatc.lesson03.E8_AbstractClass

/**
 * Created by HELMI on 10/29/2019.
 */

abstract class ComputerCourse {
    abstract fun courseprice()
    abstract fun courseprerequisite()
}

class LanguageCourse(): ComputerCourse() {
    override fun courseprice() {
        println("Course Price")
    }

    override fun courseprerequisite() {
        println("Course Prerequisite")
    }
}

fun main() {
    // var x = ComputerCourse() Tidak bisa menginisiasi objek dari class abstract
    var x = LanguageCourse()

    x.courseprerequisite()
    x.courseprice()
}
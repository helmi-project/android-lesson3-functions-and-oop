package com.androidatc.lesson03.E6_OverloadingConstructors

/**
 * Created by HELMI on 10/28/2019.
 */

open class Student() {
    var Name: String?= null
    var College: String?= null
    var Age: Int?= null

    constructor(Nama: String, Fakultas: String, Umur: Int): this() {
        this.Name = Nama
        this.College = Fakultas
        this.Age = Umur

        println("Name : "+this.Name)
        println("College : "+this.College)
        println("Age : "+this.Age)
    }
    constructor(Nama: String, Fakultas: String): this() {
        this.Name = Nama
        this.College = Fakultas
    }
}

class Teacher(): Student()
class Post_Graduate_Student(): Student()

fun main() {
    var IT_Teacher = Teacher()

    IT_Teacher.Name = "George"
    IT_Teacher.College = "IT College"

    println("Teacher Name : "+IT_Teacher.Name)
    println("Teacher College : "+IT_Teacher.College)

    var IT_Student = Post_Graduate_Student()

    IT_Student.Name = "Michel"
    IT_Student.College = "Computer Science College"

    println("Student Name : "+IT_Student.Name)
    println("College Name : "+IT_Student.College)
}
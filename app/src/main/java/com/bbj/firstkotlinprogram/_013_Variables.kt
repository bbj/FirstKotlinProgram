package com.bbj.firstkotlinprogram

fun main(args: Array<String>) {

    var a = 10
    var b = 20
    var c = a + b

    println(c)      //30

    var age = 20
    age = 10
    println(age)    //10

    val year = 2022
    //year = 2021     // Error! as it is a "val" which are immutable
}
package com.bbj.firstkotlinprogram

fun main(args: Array<String>) {

    var age = arrayOf(1,2,3)
    println("First = " + age[0])
    println("Second = " + age.get(1))
    println("Third = " + age[2])

    var cars = arrayOf("Mercedes", "BMW", "Opel")
    println("First = " + cars[0])
    println("Second = " + cars.get(1))
    println("Third = " + cars[2])

    cars.set(2, "Ford")
    println("Third = " + cars[2])
    println("cars.size() = "+cars.size)

    var carsAndAge = arrayOf("Mercedes",5,"Opel",10)
    println("First = " + carsAndAge[0])
    println("Second = " + carsAndAge.get(1))
    println("Third = " + carsAndAge[2])
    println("Fourth = " + carsAndAge[3])
    //carsAndAge.set(4, 10)       //java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
}
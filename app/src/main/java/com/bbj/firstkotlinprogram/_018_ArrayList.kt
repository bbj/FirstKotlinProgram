package com.bbj.firstkotlinprogram

fun main(args: Array<String>) {

    var age = ArrayList<Int>()
    age.add(10)                     //add 10 at the end (index = 0)
    age.add(1, 15)     //add 15 in 2nd position
    age.add(20)                     //add 20 in 3 position
    println("0: "+age[0])           //10
    println("1: "+age.get(1))       //15
    println("2: ${age[2]}")         //20 ... using string templates
    age.add(1, 14)     //add 14 at index = 1 =>
    println("0: "+age[0])           //10
    println("1: "+age.get(1))       //14 was inserted and others shifted
    println("2: ${age[2]}")         //15 shifted by 1
    println("3: ${age[3]}")         //20 shifted by 1

    age.remove(15)          //remove first occurence of 15
    println("0: "+age[0])           //10
    println("1: "+age.get(1))       //14
    println("2: "+age.get(2))       //20 (replacing 15)

    var cars = arrayListOf<String>("Opel","BMW")
    cars.add("Toyota")
    println("0: "+cars[0])           //Opel
    println("1: "+cars[1])           //BMW
    println("2: "+cars.get(2))       //Toyota
    //println("3: "+cars.get(3))       //java.lang.IndexOutOfBoundsException

    var mixArrayList = ArrayList<Any>()
    mixArrayList.add("Ford")
    mixArrayList.add(10)
    mixArrayList.add(22.2342)
    mixArrayList.add(false)
    mixArrayList.add('A')
    println(mixArrayList[0])    //Ford
    println(mixArrayList[1])    //10
    println(mixArrayList[2])    //22.2342
    println(mixArrayList[3])    //false
    println(mixArrayList[4])    //A
}
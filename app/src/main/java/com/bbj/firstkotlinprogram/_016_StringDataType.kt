package com.bbj.firstkotlinprogram

fun main(args: Array<String>) {
    var a:String = "Hello Kotlin"
    var b:String = "Language"
    println(a + " " + b)        //Hello Kotlin Language

    var age:Int = 25
    println("Your age is = "+age)       //Your age is = 25

    var x:String = "Kotlin"
    var i:Int = x.length;
    println("Length of Kotlin = "+i)    //Length of Kotlin = 6

    var c:Boolean = x.equals("Java")
    println(b)                          //false
    println(x.isEmpty())                //false
    println(x.plus(" functional and object language"))
    println(x.lowercase())              //kotlin
    println(x.uppercase())              //KOTLIN
    var d:String = "     android   "
    println(d.trim())                   //android
}
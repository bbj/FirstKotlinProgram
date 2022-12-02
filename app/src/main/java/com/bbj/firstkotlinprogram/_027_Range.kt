package com.bbj.firstkotlinprogram

fun main(args: Array<String>) {

    var myCharRange = 'a'.rangeTo('j')
    var isK = 'k' in myCharRange
    var isE = 'e' in myCharRange
    println("myCharRange has k: $isK")     //false
    println("myCharRange has e: $isE")     //true
}
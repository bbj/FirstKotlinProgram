package com.bbj.firstkotlinprogram

fun main(args: Array<String>) {
    var myArrayList = arrayListOf<Any>("Kotlin", 2, 2.5, 'K', true, "Kotlin")
    println(myArrayList.size)           //6
    println(myArrayList.last())         //"Kotlin"

    var mySetArray = setOf<Any>("Kotlin", 2, 2.5, 'K', true, "Kotlin")
    println(mySetArray.size)            //5 (no duplicates)
    println(mySetArray.last())          //true
}
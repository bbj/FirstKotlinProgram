package com.bbj.firstkotlinprogram

import kotlin.random.Random

fun main(args: Array<String>) {

    var i = 5;
    while (i > 0) {
        println(i)
        i--
    }

    //factorial of 3 = 3! = 3*2*1 = 6
    var k = 3
    var fact = 1;
    while (k > 0) {
        fact *= k
        k--
    }
    println("factorial of 3 is $fact") //factorial of 3 is 6

    //infinite loop (using class kotlin.random.Random)
    //Random.nextInt() generates an Int between Int.MIN_VALUE and Int.MAX_VALUE
    val number = Random.nextInt(0, 100)
    println("Please enter a number:")

    while (2 > 1)
    {
        val userGuess:Int = readLine()!!.toInt()
        if (userGuess == number) {
            println("Congratulations, you know the random number!")
            break   //exit the infinite loop
        }
        else if (userGuess < number) {
            println("Increase your guess")
        }
        else {
            println("Decrease your guess")
        }
    }
}
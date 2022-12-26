package com.bbj.firstkotlinprogram

fun main(args: Array<String>)
{
    print("Enter the first number: ")
    var number1:Int = readLine()!!.toInt()
    print("Enter the second number: ")
    var number2:Int = readLine()!!.toInt()

    show(number1, number2)
    var sum:Int = add(number1, number2)
    println("Sum of the 2 numbers = $sum")
    var min:Int = findMinimumNumber(number1, number2)
    println("Min of the 2 numbers = $min")
}

fun show(num1: Int, num2: Int) // : Unit
{ //Unit function, returns nothin
    println("You entered $num1 and $num2")
}

fun add(num1:Int, num2:Int) : Int
{
    var sum:Int = 0
    sum = num1 + num2
    return sum
}

fun findMinimumNumber(num1: Int, num2: Int) : Int
{
    var minimum:Int
    if (num1 > num2)
    {
        minimum = num2
    }
    else
    {
        minimum = num1
    }
    return minimum
}
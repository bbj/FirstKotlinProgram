package com.bbj.firstkotlinprogram

fun main(args: Array<String>) {

    //============== For (x in 0..10) =========
    for (number in 1..10)
    {
        println(number)
    }

    var sum:Int = 0
    for (x in 0..5)
    {
        println(x)
        sum +=x
    }
    println("Sum of numbers = $sum") //15

    var sumEven:Int = 0
    for (x in 0..5)
    {
        if (x % 2 == 0) {
            println(x)
            sumEven +=x
        }
    }
    println("SumEven of numbers = $sumEven") //6

    //============== For (x in ArrayList) =========
    var myNumberArray = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)
    for (y in myNumberArray) {
        print(" $y")
    }
    println()

    //============== For (x in 0..ArrayList.size-1) =========
    for (y in 0..myNumberArray.size-1) {
        println("myNumberArray[$y] = ${myNumberArray[y]}") //myNumberArray[0] = 1 ... 10
    }

    //============== For (x in ArrayList.indices) =========
    for (y in myNumberArray.indices) {
        println("myNumberArray[$y] = ${myNumberArray[y]}") //myNumberArray[0] = 1 ... 10
    }

    //============== For each ===================
    myNumberArray.forEach() {
        print("$it ") //1 2 3 4 5 6 7 8 9 10
    }
}
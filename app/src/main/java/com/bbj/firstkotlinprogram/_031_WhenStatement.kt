package com.bbj.firstkotlinprogram

fun main(args: Array<String>) {

    print("Enter a day number of the week: ")
    var dayNumber:Int = readLine()!!.toInt()
    //if input is "a" => Exception in thread "main" java.lang.NumberFormatException: For input string: "a"
    var day:String

    when(dayNumber)
    {
        1 -> day = "Monday"
        2 -> day = "Tuesday"
        3 -> day = "Wednesday"
        4 -> day = "Thursday"
        5 -> day = "Friday"
        6 -> day = "Saturday"
        7 -> day = "Sunday"
        else -> day = "Invalid day choice"
    }

    println("Day is $day")
}
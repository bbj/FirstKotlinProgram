package com.bbj.firstkotlinprogram

fun main(args: Array<String>) {

    //var x:Byte = 128          //Error
    var x:Byte = 127            //biggest value!
    var y:Int = x.toInt()
    var z:Double = y.toDouble()

    println(x)  //127
    println(y)  //127
    println(z)  //127.0

    var a:Double = 132.32
    var b:Int = a.toInt()
    var c:Byte = b.toByte()

    println(a)  //132.32
    println(b)  //132
    println(c)  //-124 - data loss!
}
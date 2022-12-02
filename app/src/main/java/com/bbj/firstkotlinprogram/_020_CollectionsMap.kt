package com.bbj.firstkotlinprogram

fun main(args: Array<String>) {

    //immutable
    var age = mapOf<String, Int>("david" to 20, "ronaldo" to 25)
    println("age of david: "+ age["david"])
    println("age of ronaldo: "+ age["ronaldo"])

    //mutable
    var mutableAge = mutableMapOf<String, Int>("david" to 20, "ronaldo" to 25)
    mutableAge.put("buffon", 30)

    println("[mutable] age of david: "+ mutableAge["david"])
    println("[mutable] age of ronaldo: "+ mutableAge["ronaldo"])
    println("[mutable] age of buffon: "+ mutableAge["buffon"])
    println("[mutable] age of buffon: "+ mutableAge.get("buffon"))
}
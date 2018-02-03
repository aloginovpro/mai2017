package ru.mai.learning.kotlin

fun main(args: Array<String>) {
    val value = if (true) {
        println("counting if true...")
        42
    } else {
        println("counting if false...")
        0
    }
    //int value = condition ? 42 : 0
    val value2 = if (true) 42 else 0 //no elvis operator
    //string streetName = street == null ? "undefined" : street.name
    println(value)
}
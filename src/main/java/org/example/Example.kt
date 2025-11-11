package org.example

import kotlin.random.Random
import kotlin.math.* // * import all items

fun main() {
    val num1: Int = 7
    val num2 = 3
    // num2 =4 val can not be reassign
    val num3 = num1/num2
    println("num3 is $num3")


    var num4: Double = 7.0
    var num5 = 3.0
    num5 = 4.0
    var num6 = num4/num5
    println("num3 is $num3")

    val randomNumber = Random.nextInt(from = 0, until = 6)
    println("Random number: $randomNumber")

    var dog = "Odie"
    println("My dog name is $dog")

    val yes: Boolean = true
    val no: Boolean = false

    val notYes: Boolean = !yes
    println("notYes is $notYes")

    if(yes == !no)
    {
        println("These are the same")
    }
    else
    {
        println("these are not the same")
    }

    val hourOfDay = 10
    val timeOfDay = if (hourOfDay < 6) {
        "early Morning"
    }
    else if (hourOfDay < 12) {
    "Morning"
    }
    else if (hourOfDay < 17) {
        "Afternoon"
    }
    else if (hourOfDay < 20) {
        "Evening"
    }
    else if (hourOfDay < 24) {
        "Late Evening"
    }
    else {
        "invalid Hour!"
    }
    println(timeOfDay)
}
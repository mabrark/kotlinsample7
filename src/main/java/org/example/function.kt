package org.example

fun main() {
   var intro = printName("Abrar") // calling for invoking the function
    println(intro)
}

fun printName(name: String): String { // function definition
    println("My name is $name")
    var greeting = "Hi $name, how are you?"
    return greeting

}

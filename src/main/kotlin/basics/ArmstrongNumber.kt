package basics

import kotlin.math.pow

fun main() {
    val number = 371
    var remainder : Int
    var result = 0
    var digits = 0
    var originalNumber = number

    // Get the digits of given number
    while (originalNumber != 0){
        originalNumber /= 10
        digits++

    }

    //Reset the original number and calculate the Armstrong number
    originalNumber = number

    while (originalNumber != 0) {
        remainder = originalNumber % 10
        result += remainder.toDouble().pow(digits.toDouble()).toInt()
        originalNumber /= 10
    }
    if (result == number)
        println("$number is an Armstrong number.")
    else
        println("$number is NOT an Armstrong number.")
}
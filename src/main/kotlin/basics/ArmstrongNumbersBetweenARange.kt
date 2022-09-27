package basics

import kotlin.math.pow

/**
 * A positive integer is called an Armstrong number of order n if
 * abcd... = an + bn + cn + dn + ...
 * In case of an Armstrong number of 3 digits, the sum of cubes of each digits is equal to the number itself.
 *
 * For example:
 * 153 = 1*1*1 + 5*5*5 + 3*3*3  // 153 is an Armstrong number.
 */

fun main() {
    val low = 999
    val high = 99999


    for(number in low..high){

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
    }
}
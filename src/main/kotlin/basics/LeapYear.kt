package basics

/*
* A leap year is exactly divisible by 4 except for century years (years ending with 00).
* The century year is a leap year only if it is perfectly divisible by 400.
*
* */

fun main() {
    val year = 2004

    val isLeap : Boolean = if (year % 4 == 0) {
        if (year % 100 == 0) {
            // year is divisible by 400, hence the year is a leap year
            year % 400 == 0
        } else
            true
    } else
        false

    println(if(isLeap) "$year is a Leap Year." else "$year is NOT a Leap Year.")
}
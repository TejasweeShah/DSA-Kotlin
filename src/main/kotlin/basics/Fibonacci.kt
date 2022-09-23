package basics

/*
* The Fibonacci series is a series where the next term is the sum of previous two terms.
* The first two terms of the Fibonacci sequence is 0 followed by 1.
*
* Example:
* The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
* */

fun main() {
    val seriesLen = 15
    var no1 = 0
    var no2 = 1

    print("First $seriesLen Fibonacci Numbers")

    for(count in 1..seriesLen){
        print(" $no1, ")

        val sum = no1 + no2
        no1 = no2
        no2 = sum
    }
}
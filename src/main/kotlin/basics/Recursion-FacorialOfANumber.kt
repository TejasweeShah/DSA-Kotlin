package basics

/**
 * The factorial of a positive number n is given by:
 * factorial of n (n!) = 1 * 2 * 3 * 4 * ... * n
 *
 * Example:
 * Factorial of 6 = 720
 *
 * The factorial of a negative number doesn't exist. And the factorial of 0 is 1.
 *
 */

fun main() {
    val number = 10
    val factorial = calculateFactorial(number)
    println(" Factorial of $number is $factorial ")
}

private fun calculateFactorial(number: Int): Long {
    return if (number >= 1)
        number * calculateFactorial(number - 1)
    else
        1
}

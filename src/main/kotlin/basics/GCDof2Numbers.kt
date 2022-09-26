package basics

/**
 * The HCF or GCD of two integers is the largest integer that can exactly divide both numbers (without a remainder).
 * Example :
 *
 * G.C.D of 81 and 153 is 9
 */
fun main() {

    var number1 = 156
    var number2 = 246

    // If any of the given number is -ve, Make it +ve first.
    number1 = if (number1 > 0) number1 else -number1
    number2 = if (number2 > 0) number2 else -number2

    while (number1 != number2) {

        if (number1 > number2)
            number1 -= number2
        else
            number2 -= number1
    }
        println("G.C.D = $number1")
}
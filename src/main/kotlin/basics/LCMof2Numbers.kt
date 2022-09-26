package basics

/**
 *
 * The LCM of two integers is the smallest positive integer that is perfectly divisible by
 * both the numbers (without a remainder).
 *
 * Example :
 *  The LCM of 72 and 120 is 360.
 *
 */

fun main() {
    val n1 = 72
    val n2 = 120

    // maximum number between n1 and n2 is stored in lcm
    var lcm: Int = if (n1 > n2) n1 else n2

    // Always true
    while (true) {
        if (lcm % n1 == 0 && lcm % n2 == 0) {
            println("The LCM of $n1 and $n2 is $lcm.")
            break
        }
        ++lcm
    }
}
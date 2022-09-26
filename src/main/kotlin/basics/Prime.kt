package basics

fun main() {
    val number = 5
    var cnt = 2
    var isPrime = false
    while (cnt <= number / 2) {
        // condition for nonprime number
        if (number % cnt == 0) {
            isPrime = true
            break
        }
        ++cnt
    }

    if (!isPrime)
        println("$number is a Prime Number.")
    else
        println("$number is NOT a Prime Number.")
}
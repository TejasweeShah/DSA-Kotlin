package basics

fun main() {
    val number = 10
    var factorial: Long = 1
    for (i in 1..number) {
        // factorial = factorial * i;
        factorial *= i.toLong()
    }
    println("Factorial of $number = $factorial")
}
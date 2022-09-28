package basics

fun main() {
    val no1 = 366
    val no2 = 6

    val gcdOf2No = calculateGCD(no1,no2)
    println("GCD of $no1 and $no2 is $gcdOf2No")
}

fun calculateGCD(no1: Int, no2: Int): Int {
    return if (no2 != 0)
        calculateGCD(no2, no1 % no2)
    else
        no1
}


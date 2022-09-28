package basics

fun main() {
    val base = 3
    val powerRaised = 4
    val result = power(base, powerRaised)

    println("$base^$powerRaised = $result")
}

fun power(base: Int, powerRaised: Int): Int {
    return if (powerRaised != 0)
        base * power(base, powerRaised - 1)
    else
        1
}
package basics

fun main() {
    val num = 19
    val binary = convertDecimalToBinary(num)
    println("$num in decimal = $binary in binary")
}

fun convertDecimalToBinary(n: Int): Long {
    var n1 = n
    var binaryNumber: Long = 0
    var remainder: Int
    var i = 1
    var step = 1

    while (n1 != 0) {
        remainder = n1 % 2
        println(" Step ${step++}: ${n1/2}, Remainder = $remainder, Quotient = ${n1/2}")
        n1 /= 2
        binaryNumber += (remainder * i).toLong()
        i *= 10
    }
    return binaryNumber
}
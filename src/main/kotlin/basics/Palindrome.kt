package basics

fun main() {
    var number = 1112111
    var remainder: Int
    var reverseNo = 0
    val originalNo = number

    // Reverse the given number
    while (number != 0) {
        remainder = number % 10
        reverseNo = reverseNo * 10 + remainder
        number /= 10
    }

    if (originalNo == reverseNo)
        println("$originalNo is a  Palindrome")
    else
        println("$originalNo is NOT a  Palindrome")
}

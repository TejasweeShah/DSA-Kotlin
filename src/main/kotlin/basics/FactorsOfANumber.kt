package basics

fun main() {

    val number = 90
    print("Factors of $number are: ")
    for (i in 1..number) {
        if (number % i == 0) {
            print("$i ")
        }
    }
}
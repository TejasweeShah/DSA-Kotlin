package basics

fun main() {

    print("Enter two numbers: ")
    val first = readln().toDouble()
    val second = readln().toDouble()

    print("Enter an operator (+, -, *, /): ")
    val operator = readln()

    val result: Double = when (operator) {
        "+" -> first + second
        "-" -> first - second
        "*" -> first * second
        "/" -> first / second
        // operator doesn't match any case constant (+, -, *, /)
        else -> {
            println("Error! operator is not correct")
            return
        }
    }
    println(" $first $operator $second = $result ")
}
package basics

fun main() {
    val addTill = 25
    val sum = addNumbers(addTill)
    println(" Sum of first $addTill numbers is $sum")

}

private fun addNumbers(addTill: Int): Int {
    return if(addTill != 0)
        addTill + addNumbers(addTill - 1)
    else
        addTill
}


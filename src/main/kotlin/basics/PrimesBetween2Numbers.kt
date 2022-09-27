package basics

fun main() {
    val low = 5
    val high = 50

    for (numberP in low..high){
        var isPrime = false
        for (cnt in 2..numberP/2){
            if (numberP % cnt == 0) {
                isPrime = true
                break
            }
        }
        if (!isPrime)
            println(numberP)
    }
}
package basics

fun main() {
    val number = 9
    val tableTill = 12

    for (cnt in 1..tableTill){
        println(" $number x $cnt = ${number*cnt}")
    }
}
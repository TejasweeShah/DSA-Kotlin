package basics

fun main() {

    val no1 = 11
    val no2 = 21
    val no3 = 3

    if (no1 >= no2 && no1 >= no3 ){
        println("Largest Number is $no1")
    }
    else if (no2 >= no1 && no2 >= no3){
        println("Largest Number is $no2")
    }
    else{
        println("Largest Number is $no3")
    }
}
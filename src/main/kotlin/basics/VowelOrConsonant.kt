package basics

fun main() {
    val ch = 'a'

    when(ch) {
        'a', 'e', 'i', 'o', 'u' -> println("$ch is Vowel")
        else -> println("$ch is Consonant")
    }
}
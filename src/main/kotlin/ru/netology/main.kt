package ru.netology

fun main() {
    var likes = 0

    while (true) {
        likes += 1
        Thread.sleep(500)

        val ending = if (likes % 10 != 1 || likes % 100 == 11) "людям" else "человеку"
        println("Понравилось $likes $ending ")
    }
}
package ru.netology

fun main() {
    val peoples = "людям"
    val mans = "человеку"
    var likes = 0
    fun printEnding(likes: Int): String {
        if (likes % 10 != 1 || likes%100 == 11) return peoples else return mans
    }
    while (true) {
        likes += 1
        Thread.sleep(500)
        println("Понравилось " + likes + " " + printEnding(likes))
    }
}
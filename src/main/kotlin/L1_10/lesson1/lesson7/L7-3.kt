package L1_10.lesson1.lesson7

fun main() { // password generator

    //программа выводит диапазон чисел до рамок заданных пользователем

    println("Введите число ")

    val numberforSmth = readln().toInt()
    var start = 0

    for (i in 1..999) {


        if (numberforSmth.equals(start)) {
            break
        }
        if (start % 2 == 0) {
            println("$start ")
        }
        start++
    }

}
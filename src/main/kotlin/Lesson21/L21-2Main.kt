package Lesson21

import L1_10.lesson1.lesson10.randmeNumber

fun main() {
    var numberList = listOf(3, 5, 7, 123, 5435,  123, 15, 127, 13, 99, 4, 6, 8) // 18 of all
    println(numberList.evenNumbersSum())
}


fun List<Int>.evenNumbersSum(): Int {

    return this.filter { it % 2 == 0 }.sum() // how to sort list using .map.sum() not working at all (sumof?)

}
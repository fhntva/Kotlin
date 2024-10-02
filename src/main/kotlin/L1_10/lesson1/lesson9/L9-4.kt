package L1_10.lesson1.lesson9

fun main() {

    println("Введите 5 значений через запятую")
    var something = readln().toString()
    var list : List<String> = something.split(",")

    println(list)
    println(list.sorted())

    }

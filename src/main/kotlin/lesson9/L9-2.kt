package lesson9

fun main() {
    val listMe = mutableListOf<String>("лук", "картофель", "мандарин")
    println("В рецепте есть следующие ингредиенты:"); listMe.forEach { println(it) } // как избатьвиться от println
    println("Желаете добавить еще? введите да или нет")
    var yesOrNo = readln().toString()
    if (yesOrNo.equals("нет")) {
        println("Программа завершена")
    }
    if (yesOrNo.equals("да")) {
        println("Введите элемент который хотите добавить ")
        val eleM = readln().toString().trim()
        listMe.add(eleM)
        println("В рецепте есть следующие ингредиенты:")
        listMe.forEach { println(it) }
    } else {
        println("Введен некоректный тип данных")
    }

}
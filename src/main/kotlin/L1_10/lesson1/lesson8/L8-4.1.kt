package L1_10.lesson1.lesson8

//
fun main() {
    var arrVegetables: Array<String> = arrayOf("лук", "картофель", "мандарин", "пицца", "сардина", "томат")
    println("Cписок ингридиетнов : \n" + arrVegetables.joinToString() + "Введите ингридиент который хотите заменить")
    val elem = readln().toString()
    println("Введите ингридиент который хотите добавить")
    var elemChanger = readln().toString()
    var indexME = arrVegetables.indexOf(elem)

    if (-1 == indexME) {
        println("Такого элемента нет в списке ")
    }
    if (indexME >= 0) {
        arrVegetables[indexME] = elemChanger
        println("Cписок ингридиетнов : \n" + arrVegetables.joinToString())
    }

}



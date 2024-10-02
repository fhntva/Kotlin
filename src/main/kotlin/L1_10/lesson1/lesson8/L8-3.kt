package L1_10.lesson1.lesson8
//
fun main() {
    val arrVegetables: Array<String> = arrayOf("лук", "картофель", "мандарин", "пицца", "сардина", "томат",)

    println("Введите элемент для поиска в массиве")
    val finder = readln().toString().trim()

    val check = arrVegetables.filter { it.equals(finder) }

    if (!check.equals(""))
    {
        println("Элемент $finder присутствует в массиве")
    }
    else{

        println("Элемент не найден")

    }
}



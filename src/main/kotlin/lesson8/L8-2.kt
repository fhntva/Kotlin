package lesson8
//
fun main() {
    val arrVegetables: Array<String> = arrayOf("лук", "картофель", "мандарин", "пицца", "сардина", "томат",)

    println("Введите элемент для поиска в массиве")

    val finder = readln().toString().trim()

    var arrsize = -1
    arrsize+=arrVegetables.size

    for (i in arrVegetables.indices)
    {
        //println(i)
        if (arrVegetables[i].equals(finder)) {

            println("Элемент $finder присутствует в рецепте")
            break
        }
        if ( i == arrsize)
        {
            println("Элемент не найден")
        }
    }


}



package lesson8
//
fun main() {
    var arrVegetables: Array<String> = arrayOf("лук", "картофель", "мандарин", "пицца", "сардина", "томат",)

    println("Список ингридиентов, что из этого вы хотите заменить")

    for (i in 1..2)
    {

        for (s in arrVegetables.indices)
        {

            println("Элемент $s: "+arrVegetables[s])



        }
        println("Введите  элемент который вы хотите заменить ")

        var something = readln().toString()

       // val check = arrVegetables.filter { it.equals(something)  }


        if (arrVegetables.contains(something))
        {
            arrVegetables = arrVegetables.filter { it != something }.toTypedArray() // какого хуя не работает REMOVE
            println("Введите элемент который вы хотите добавить")
            something = readln().toString().trim()
            arrVegetables+=something.toString().trim()
            println("Готово! вы сохранили следующий список")

        }
        if  (!arrVegetables.contains(something))
        {
            println("Такого элемента нет")

        }

    }


}



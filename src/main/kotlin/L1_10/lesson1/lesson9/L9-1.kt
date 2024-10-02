package L1_10.lesson1.lesson9

fun main()
{
    val listMe = listOf("лук", "картофель", "мандарин", "пицца", "сардина", "томат")
   println("В рецепте есть следующие ингредиенты:"); listMe.forEach { println(it)  }
}
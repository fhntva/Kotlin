package lesson9

fun main()
{
    val listMe = listOf("лук", "картофель", "мандарин", "пицца", "сардина", "томат")
   println("В рецепте есть следующие ингредиенты:"); listMe.forEach { println(it)  }
}
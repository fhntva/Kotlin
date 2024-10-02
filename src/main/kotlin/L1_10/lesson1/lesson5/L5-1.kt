package L1_10.lesson1.lesson5

fun main()
{
    val ab =  1..7

    val number1 = ab.random()
    val number2 = ab.random()

    println("Проверка на бота. Для прохождения введите сумму значений $number1 и $number2")


    val human = readln().toInt()
    val result = number1+number2

    if (human== result)
    {
        println("Проверка пройдена")
    }
    else
    {   println("Допушена ошибка в вычислениях")
    }



}



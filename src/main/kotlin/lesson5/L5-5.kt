package lesson5

fun main()
{
    val ab = 0..42

    var costumerN = emptyList<String>()
    var randN = emptyList<String>()


    for (i in 1..3) // заполнение чисел пользователем
    {
        println("Введите число $i для лотереи")
        val number = readln().toString()
        costumerN += number
        }
    for (i in 1..3)// рандом заполнение
    {
        val number = ab.random().toString()
        randN += number

    }



    val cross = costumerN.intersect(randN)
    val quantity = cross.size
    val prize3 = 3; val prize2 = 2; val prize1 = 1; val prizeZero = 0
    //println(costumerN)
    //println(randN)

    if (quantity== prize3)
    {
        println("Вы угадали все числа и выйграли джекпот")
        println("Выйгрышные числа $randN и числа которые вы угадали $cross")
    }
    if (quantity== prize2)
    {
        println("Вы угадали два числа")
        println("Выйгрышные числа $randN и числа которые вы угадали $cross")
    }
    if (quantity== prize1)
    {
        println("Вы угадали одно число ")
        println("Выйгрышные числа $randN и числа которые вы угадали $cross")
    }
    if (quantity== prizeZero)
    {
        println("Вы ничего не угадали")
        println("Выйгрышные числа $randN и числа которые вы угадали $cross")
    }


}









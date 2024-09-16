package lesson4

const val ALL_KITCHEN_TABLE = 13

fun main ()
{
        val TableToday = 13
        val freeTableTomorrow = 4

    val text = "Свободные столики  есть  "; val text1 = "Свободные столиков нет"

    val freeTableTodayIs =  TableToday == ALL_KITCHEN_TABLE
    val freeTableTomorrowIs = ALL_KITCHEN_TABLE == freeTableTomorrow



    if (!freeTableTodayIs )
    {
       println(text)
    }
    else
    {
        println(text1)
    }


    if (!freeTableTomorrowIs)
    {
        println(text)
    }

    else
    {
        println(text1)
    }



}
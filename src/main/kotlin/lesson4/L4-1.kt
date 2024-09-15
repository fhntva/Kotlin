package lesson4

const val ALL_KITCHEN_TABLE = 13

fun main ()
{
        val TableToday = 13
        val freeTableTomorrow = 4

    val text = "Свободные столики  есть  "; val text1 = "Свободные столиков нет"

    val freeTableTodayIs =  TableToday == ALL_KITCHEN_TABLE


    if (freeTableTodayIs == true)
    {
       println(text1)

    }
    val freeTableTomorrowIs = ALL_KITCHEN_TABLE == freeTableTomorrow

    if (!freeTableTomorrowIs)
    {
        println(text)

    }

}
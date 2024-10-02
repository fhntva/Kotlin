package L1_10.lesson1.lesson4

const val ALL_KITCHEN_TABLES = 13

fun main()
{
        val totaltabletoday = 13        //занятые посетителями
        val totaltabletommorow = 9

        val freetableToday = ALL_KITCHEN_TABLES - totaltabletoday
        val freetableTomorr = ALL_KITCHEN_TABLES - totaltabletommorow

        val rentToday = freetableToday >= 1
        val rentTomorr = freetableTomorr >=1

        println("Доступность столиков на сегодня : "+rentToday)
        println("Доступность столиков на завтра : "+rentTomorr)


}
package lesson1

fun main()
{
// 108 минуты // время полета Гагарина || 6480
    var starter= 6480

    var (second, minutes,hours ) = Triple(60, 60, 3600)



    var hoursfly:Int =  (starter/hours)
    starter = starter-(hoursfly*hours)



    var minutefly:Int = (starter/minutes)
    starter = starter-(minutefly*minutes)


    var secondfly:Int = starter


    println("Время проведенное Гагариным в космосе равно: "+hoursfly+" час "+ minutefly+" минут "+ secondfly+" секунд")


}
package lesson1

fun main()
{
// 108 минуты // время полета Гагарина || 6480
    var starter= 6480

    val (minutes,hours ) = listOf( 60, 3600)



    val hoursfly:Int =  (starter/hours)
    starter -= (hoursfly * hours)



    val minutefly:Int = (starter/minutes)
    starter -= (minutefly * minutes)


    val secondfly:Int = starter


    println("Время проведенное Гагариным в космосе равно: $hoursfly час $minutefly минут $secondfly секунд")


}
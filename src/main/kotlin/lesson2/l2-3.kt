package lesson2

fun main ()
{

   val (startH,startM)= listOf(9,39)
   var roadTime = 457 + startM

   val hoursIN:Int = roadTime/60
   roadTime -= hoursIN*60


   println("Время прибытия поезда " +(hoursIN+startH) +" часов "+(roadTime) + " минут"  )
}
package lesson2

fun main ()
{
   val  (ironOre, crystalOre) = listOf(11,7)

   val bonusOre = (ironOre*1.2-ironOre).toInt()
   val bonusCr = (crystalOre*1.2-crystalOre).toInt()


   println("Бонусная кристалическая руда =$bonusCr")
   println("Бонусная железна руда =$bonusOre")
}
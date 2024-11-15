package Lesson15

abstract class WeatherStationStats
    {
    abstract var data:Int
    abstract var season:String
}

class Temperature(
    override var data: Int,
    override var season: String,
    var temperature:Int,
):WeatherStationStats()

class PrecipitationAmount(

    override var data: Int,
    override var season: String,
    var precipitationAmount:Int,
):WeatherStationStats()


class WeatherServer()
{
 fun massages( tempture:Int, precipitationAmount: Int )
  {
     when(tempture)
     {
         in -50..0 -> println("Снег")
         in 0..10 -> println("Холод")
         in 10..23 -> println("Комфортная")
         in 23..50 -> println("Жаркая")
     }
      when(precipitationAmount)
      {
          in 0..15 -> println("Осадков нет")
          in 15..35 -> println("Небольшие осадки")
          in 35..100 -> println("Дождь")
          in 100..500 -> println("Плаваем")
      }
 }
}
package Lesson15



fun main ()
{
  var temp = Temperature(
      data = 15,
      season = "something",
      temperature = 35,
  )
    var amount = PrecipitationAmount(
        data = 15,
        season = "something",
        precipitationAmount = 15,
    )

    var temp1 = Temperature(
        data = 15,
        season = "something",
        temperature = 35,
    )
    var amount1 = PrecipitationAmount(
        data = 15,
        season = "something",
        precipitationAmount = 115,
    )

    WeatherServer().massages(temp.temperature,amount.precipitationAmount)
    WeatherServer().massages(temp1.temperature,amount1.precipitationAmount)
}
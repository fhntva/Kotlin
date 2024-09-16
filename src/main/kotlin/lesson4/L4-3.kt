package lesson4


fun main ()
{
    val weather = "sunny";val openTent = "open";val airHumidity = "20%"

    val seasonSum = "summer" // использовать условия для сравнение != winter
    val seasonAut = "autumn"
    val seasonSpr = "spring"


    val weatherNow = "sunny" //условия для проверки
    val tentNow = "open"
    val airHumidityNow = "20%"
    val seasonNow = "winter"

    val weatherOk = weather == weatherNow

    println("Погода соответсвует условиям роста $weatherOk")

    val tentOk = openTent == tentNow

    println("Солнце соответсвует условиям роста $tentOk")

    val airOk = airHumidity == airHumidityNow

    println("Ветер соответсвует условиям роста $airOk")

    val seasonOk = seasonNow == seasonSum || seasonNow == seasonAut || seasonNow == seasonSpr

    println("Сезон соответсвует условиям роста $seasonOk")

    val growTime = true == weatherOk && tentOk && airOk &&  seasonOk

    println("Время роста $growTime")
}
package Lesson12

fun main() {
    var day = 1..99
    var night = 1..30
    var faLLout = 0..1

    var averageW = averageWeather(
        day = mutableListOf(),
        night = mutableListOf(),
        fallout = mutableListOf(),
    )
    var fallOuf = 0
    for (i in 1..30) {
        averageW.day += day.random()
        averageW.night += night.random()
        var counter = faLLout.random()
        if (counter == 1) {
            fallOuf += counter
        }
        averageW.fallout += counter.toString()

    }

    println("Средняя температура днем ${averageW.day.average()}")
    println("Средняя температура ночью ${averageW.night.average()}")
    println("Количество дней с осадками ${fallOuf} ")


}
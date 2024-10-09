package Lesson12

import weather


fun main() {
    var winter = weather()
    winter.dayweather = 15
    winter.nightweather = 3
    winter.fallout = "rainy"

    println(winter.printMe())


    var autumm = weather()

    autumm.dayweather = 35
    autumm.nightweather = 33
    autumm.fallout = "no"
    println(autumm.printMe())
}
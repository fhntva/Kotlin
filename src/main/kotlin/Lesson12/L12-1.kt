package Lesson12

import Weather


fun main() {
    var winter = Weather()
    winter.dayweather = 15
    winter.nightweather = 3
    winter.fallout = "rainy"

    println(winter.printMe())


    var autumm = Weather()

    autumm.dayweather = 35
    autumm.nightweather = 33
    autumm.fallout = "no"
    println(autumm.printMe())
}
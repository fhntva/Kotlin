package Lesson15

fun main() {
    var passengerCars = PassengerClass(
        passenger = 3,
        transportWeight = false
    )

    var cargoCars = CargoCars(
        passenger = 1,
        transportWeight = false
    )
    passengerCars(passengerCars)
    cargoCars(cargoCars)
}
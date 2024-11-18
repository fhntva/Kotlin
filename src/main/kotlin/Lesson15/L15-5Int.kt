package Lesson15

interface LoadingCargo {
    fun loadingCargo() {
        println("Загрузка груза")
    }
}

interface UnloadingCargo {
    fun unloadingCargo() {
        println("Разгрузка груза")
    }
}

interface LoadingPassenger {
    fun loadingPassenger() {
        println("Загрузка пассажиров")
    }
}

interface Unloadingpassenger {
    fun unloadingPassenger() {
        println("Разгрузка пассажиров")
    }
}

interface MovementCars {
    fun moveCars() {
        println("Движение")
    }
}

fun passengerCars(passengerCars: PassengerClass) {
    passengerCars.loadingPassenger()
    passengerCars.moveCars()
    passengerCars.unloadingPassenger()
}

fun cargoCars(cargoCars: CargoCars) {

    cargoCars.loadingCargo()
    cargoCars.loadingPassenger()
    cargoCars.moveCars()
    cargoCars.unloadingCargo()
    cargoCars.unloadingPassenger()
}

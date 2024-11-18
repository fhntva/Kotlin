package Lesson15

abstract class Cars() {
    abstract var passenger: Int
    abstract var transportWeight: Boolean
}

class PassengerClass(
    override var passenger: Int,
    override var transportWeight: Boolean,
) : Cars(),MovementCars,LoadingPassenger,Unloadingpassenger

class CargoCars(
    override var passenger: Int,
    override var transportWeight: Boolean,
) : Cars(),MovementCars,LoadingCargo,UnloadingCargo,
    LoadingPassenger,Unloadingpassenger

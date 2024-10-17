package Lesson14



fun main ()
{
    val linerFreedomDive = Liner(
        name = "Поплавушка",
        speed = 50,
        capacity = 30,
        people = 600,
    )

    val crusher = Icebreaker(
        name = "Крушилка",
        speed = 35,
        capacity = 75,
        people = 27,
    )
    val cargoDocker = CargoLiner(
        name = "Посылочная",
        speed = 45,
        capacity = 80,
        people = 20,
    )
    linerFreedomDive.printMe()
    crusher.printMe()
    cargoDocker.printMe()

}

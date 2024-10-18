package Lesson14

fun main() {

    val satelite1 = Satelite(
        name = "Камень",
        atmosphere = true,
        readytoColoniastion = false,

        )
    val satelite2 = Satelite(
        name = "Luna",
        atmosphere = true,
        readytoColoniastion = false
    )
    val spaPlanet = BasicPlanet(
        name = "ПланетаСпа",
        atmosphere = true,
        readytoColoniastion = true,
        satelite = mutableListOf(satelite1, satelite2)
    )

    println(spaPlanet)
}
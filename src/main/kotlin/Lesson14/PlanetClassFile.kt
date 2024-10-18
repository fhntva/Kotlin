package Lesson14

abstract class MotherPlanet(
    val name: String,
    val atmosphere: Boolean,
    val readytoColoniastion: Boolean,

    )

class BasicPlanet(
    name: String,
    atmosphere: Boolean,
    readytoColoniastion: Boolean,
    satelite: MutableList<Satelite>,
) : MotherPlanet(
    name,
    atmosphere,
    readytoColoniastion
)


class Satelite(
    name: String,
    atmosphere: Boolean,
    readytoColoniastion: Boolean,
) : MotherPlanet(
    name,
    atmosphere,
    readytoColoniastion
)
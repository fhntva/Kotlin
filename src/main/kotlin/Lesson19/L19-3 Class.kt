package Lesson19

enum class SpaceShip() {
    FLYING(),

    LAND(),

    SHOOT();

    fun Fly(): String {
        return "i fly"
    }

    fun Shoot(): String {
        return "i shoot"
    }

    fun Land(): String {
        return "i land"
    }

    fun Break(): String {
        return "переписать методы"
    }
    fun Todo(): Any
    {
        TODO("Provide the return value")
    }
}
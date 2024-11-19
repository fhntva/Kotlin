package Lesson16

open class Cube()  {
    var getNumber = 1..6

    private var cube = getNumber.random()
    private var getCube = cube.toInt()
    fun getCube()
    {
        return println(getCube)
    }
}
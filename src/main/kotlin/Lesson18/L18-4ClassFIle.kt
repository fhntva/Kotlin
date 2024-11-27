package Lesson18

abstract class Shapes() {

    abstract var a: Int
    abstract var b: Int
    abstract var c: Int

    open fun cubeSize() {
        var d = a * b * c
        println("Площадь посылки равна $d")
    }
}

class Cube(
    var cube: Int,
) : Shapes() {
    override var a: Int = cube
    override var b: Int = cube
    override var c: Int = cube
    override fun cubeSize() {
        var d = a * b * c
        println("Площадь посылки равна $d")
    }
}

class Rectangle(
    override var a: Int,
    override var b: Int,
    override var c: Int,
) : Shapes() {
    override fun cubeSize() {
        var d = a * b * c
        println("Площадь посылки равна $d")
    }
}

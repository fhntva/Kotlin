package Lesson18

abstract class Screen() {
    abstract var x: Any
    abstract var y: Any
    abstract var figureType: String
    open fun draw() {
        println("Нарисована фигура $figureType в координатах $x, $y")
    }

}

class Circle(x: Any, y: Any, ) : Screen() {
    override var x: Any =x
    override var y: Any=y
    override var figureType: String = "Круг"
    override fun draw() {
        super.draw()
    }
}

class Box(x: Any, y: Any, ) : Screen() {
    override var x: Any =x
    override var y: Any=y
    override var figureType: String = "Коробка"
    override fun draw() {
        super.draw()
    }
}

class Pointer(x: Any, y: Any, ) : Screen() {
    override var x: Any =x
    override var y: Any=y
    override var figureType: String = "Точка"
    override fun draw() {
        super.draw()
    }
}
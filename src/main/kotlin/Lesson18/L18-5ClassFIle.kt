package Lesson18

abstract class Screen() {
    abstract var xDouble: Double?
    abstract var yDouble: Double?
    abstract var x: Int?
    abstract var y: Int?

    abstract var `figure-type`: String

    open fun draw(x: Int?, y: Int?) {
        println("Нарисована фигура = $`figure-type` в координатах $x и $y")
    }

    open fun draw(xDouble: Double?, yDouble: Double?) {
        println("Нарисована фигура =  $`figure-type` в координатах $xDouble и $yDouble")
    }


}

class Circle : Screen {


    constructor(
        x: Int,
        y: Int,
    ) {
        this.x=x
        this.y=y

    }
    constructor(
        xDouble: Double,
        yDouble: Double,
    ) {
        this.xDouble=xDouble
        this.yDouble=yDouble

    }
    override var xDouble:Double? = null ?: 1.0
    override var yDouble:Double? = null ?: 1.0
    override var x: Int? = null ?: 1
    override var y: Int? = null ?: 1
    override var `figure-type`: String = "Круг"
    override fun draw(x: Int?, y: Int?) {
        super.draw(x, y)
    }

    override fun draw(xDouble: Double?, yDouble: Double?) {
        super.draw(xDouble, yDouble)
    }
}


class Box : Screen {


    constructor(
        x: Int,
        y: Int,
    ) {
        this.x=x
        this.y=y

    }
    constructor(
        xDouble: Double,
        yDouble: Double,
    ) {
        this.xDouble=xDouble
        this.yDouble=yDouble

    }
    override var xDouble:Double? = null ?: 1.0
    override var yDouble:Double? = null ?: 1.0
    override var x: Int? = null ?: 1
    override var y: Int? = null ?: 1
    override var `figure-type`: String = "Квадрат"

    override fun draw(x: Int?, y: Int?) {
        super.draw(x, y)
    }

    override fun draw(xDouble: Double?, yDouble: Double?) {
        super.draw(xDouble, yDouble)
    }
}

class Pointer : Screen {


    constructor(
        x: Int,
        y: Int,
    ) {
        this.x=x
        this.y=y

    }
    constructor(
        xDouble: Double,
        yDouble: Double,
    ) {
        this.xDouble=xDouble
        this.yDouble=yDouble

    }
    override var xDouble:Double? = null ?: 1.0
    override var yDouble:Double? = null ?: 1.0
    override var x: Int? = null ?: 1
    override var y: Int? = null ?: 1
    override var `figure-type`: String = "Точка"

    override fun draw(x: Int?, y: Int?) {
        super.draw(x, y)
    }

    override fun draw(xDouble: Double?, yDouble: Double?) {
        super.draw(xDouble, yDouble)
    }
}

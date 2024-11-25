package Lesson18

abstract class Dice() {
    abstract val diceside: Int

    open fun rand() {
        var a = 1
        var b = diceside
        var ab = a..b
        return println(ab.random())
    }

}

class FourSideDice() : Dice() {
    override val diceside: Int = 4
    override fun rand() {
        var a = 1
        var b = diceside
        var ab = a..b
        return println(ab.random())
    }

}

class SixSideDice() : Dice() {
    override val diceside: Int = 6
    override fun rand() {
        var a = 1
        var b = diceside
        var ab = a..b
        return println(ab.random())
    }

}

class EightSideDice() : Dice() {
    override val diceside: Int = 8
    override fun rand() {
        var a = 1
        var b = diceside
        var ab = a..b
        return println(ab.random())
    }

}
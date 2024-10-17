package Lesson14

import java.awt.Rectangle

abstract class Figure(
     val color: String,
)
 {


    fun circleSum(r:Int): Double {

        val pi: Double = 3.14
        var sum = pi * r
        return sum
    }

    fun rectangleSum(a:Int, b:Int): Double {
        var sum = a * b
        return sum.toDouble()

    }

}


class Circle(
    color: String,
    val range:Int,
) : Figure(color)
{

}

class RectangleSad(
    color: String,
    val length: Int,
    val width: Int,
) : Figure(color)

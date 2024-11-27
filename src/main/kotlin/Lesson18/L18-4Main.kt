package Lesson18

fun main ()
{
    println("isee you ")
    var cube = Cube(4)
    var rectangle = Rectangle(3,4,34)
    var list = listOf(cube,rectangle)
    for (element in list)
    {
        element.cubeSize()
    }

}
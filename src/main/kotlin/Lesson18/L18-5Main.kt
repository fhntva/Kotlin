package Lesson18

fun main()
{
    var circle = Circle(3, 4)
    var box = Box(3, 66)
    var pointer = Pointer(33, 44)

    var circle1 = Circle(3.1, 4.5)
    var box1 = Box(3.3, 6.6)
    var pointer1 = Pointer(34.5, 33.3)

    var shitList = listOf(circle, box, pointer)
    for (element in shitList) {
        element.draw()

    }
    var shitList1 = listOf(circle1, box1, pointer1)
    for (element in shitList1) {
        element.draw()

    }
}
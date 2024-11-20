package Lesson16

class Circle(
    private var radius:Int,
) {
    protected var pi = 3.14

    fun area() {
        var sum = radius*radius * pi
        return println("Площадь круга равна = $sum")
    }
    fun length() {
        var length = radius*2 * pi
        return println("Длина окружности равна = $length")
    }
}
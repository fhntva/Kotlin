package Lesson18

fun main() {
println("i see you")
    var kitty = Kitty("Мурка","fish")
    var doggo = Dog("Шарик","bones")
    var fox = Fox("Foxy","berry")
    var list = listOf(kitty,doggo,fox)
    for (element in list)
    {
        element.eating()
        element.sleep()
    }
}
package Lesson17

fun main()
{
    var transportation = Package()
    transportation.currentPosition = "sosal"
    println(transportation.numberOfMoves)

    transportation.currentPosition = "миска"
    println(transportation.numberOfMoves)
    transportation.currentPosition = "v"
    println(transportation.numberOfMoves)
}


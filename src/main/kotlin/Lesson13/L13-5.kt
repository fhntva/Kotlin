package Lesson13

fun main()
{


    try {
        var number = readln().toLong()

    }   catch (e:NumberFormatException)
    {
        println(e)
    }

         //println(runCatching { number  })



}
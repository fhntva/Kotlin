package L1_10.lesson1.lesson2

fun main ()
{
    val numbers = arrayOf(3,4,3,5)
    var sum = 0.00
    var calc = 0

    for (i in 0..numbers[calc])
    {


        sum += numbers[calc]

    //println(sum)

        calc++

    }

    val average : Double  = sum/calc

    println(average)

}
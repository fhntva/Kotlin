package L1_10.lesson1.lesson7

fun main ()
{
    println("Введите количество секунд для секундомер")
    var second = readln().toInt()

    var a = 1

    for ( i in a..second )
    {



        var howMuchTime = second-i


        println("Прошло секунд : $i Осталось времени $howMuchTime")
        if (howMuchTime==0) {break}
        Thread.sleep(1000)




    }

}
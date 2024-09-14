package lesson3

// нарезаем стринг на 3 массива

fun main ()
{

          val data = "D2-D4;0"

    val split = data.split("-",";")



    for (i in 0..3)

    {
       println(split[i])

    }
}





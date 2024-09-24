package lesson8
// рандомное заполнение массива+ сумма всех элементов
fun main()
{
    val ab =  50..350

   // val random = ab.random()

    val array= IntArray(10)
    var summary = 0


    for (i in 0..6 )
    {
        ab.random().also { array[i] = it }

        summary+=array[i]



       println(array[i])


    }
    println("Значение всех элементов массива равно $summary")

}




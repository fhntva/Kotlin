package lesson5



const val CURRENTYEARS = 2024
const val COMMITAGES = 18


fun main()
{
 println ("Введите свой год рождения")

    val ages = readLine()!!.toInt()


            val calcYears = CURRENTYEARS - ages


    if(calcYears>=COMMITAGES)
    {
        println("Показать экран со скрытым контентом")

    }
    else
    {
        println("Недопустимый возраст")
    }
}




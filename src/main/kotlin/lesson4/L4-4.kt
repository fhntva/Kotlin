package lesson4



fun main ()
{
    val trainDay:Int =  4
    


val dayChecker = trainDay%2
    val zero = 0
    val one  = 1
val even = dayChecker==zero
val notEven = dayChecker == one

    if (even) // четный день тренировок
{

    println(
                "Упражнение для рук "+notEven+ "\n"+
                "Упражнение для ног "+even +"\n"+
                "Упражнение для спины "+even +"\n"+
                "Упражнение для пресса "+notEven +"\n"
    )
}
    else { //нечетный день тренировок

        println(
                    "Упражнение для рук :"+notEven+ "\n"+
                    "Упражнение для ног "+even +"\n"+
                    "Упражнение для спины "+even +"\n"+
                    "Упражнение для пресса "+notEven +"\n"

        )
    }








}
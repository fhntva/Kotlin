package lesson3

// Таблица умножения считающая от 6x1 до 6x9 // abc переводят значения в строку для вывода

fun main ()
{
    var calc = 1;
    val number = 6;

    for (i in 1..9)
    {
        val answer = number * calc

        val a : String = number.toString()
        val b : String = calc.toString()
        val c : String = answer.toString()

        println ( a +"x" + b+ " = "+ c   )

        calc++

    }
}





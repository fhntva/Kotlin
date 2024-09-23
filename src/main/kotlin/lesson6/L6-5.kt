package lesson6


fun main() {

    val ab = 1..9

    val random = ab.random()
    var attempt = 3

    var number: Int



    println("Докажи что ты не бот реши уравнение")

    do {

    val n1= ab.random()
        val n2= ab.random()
        println("Сложение $n1 и $n2 Введите результат")
        number = readln().toInt() // only Numbers how to fix crush
        if (number.equals(n1+n2))
        {
            println("Добро пожаловать ")
            break
        }

        if (!number.equals(n1+n2))
        {
            println("Вы не угадали ")
            --attempt
        }
        if (attempt.equals(0))
        {
            println("Попытки закончились ")
            break
        }




    } while (attempt >= 0)


}


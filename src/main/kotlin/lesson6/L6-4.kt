package lesson6


fun main() {

    val ab = 1..13

    val random = ab.random()
    var attempts = 5
    var number: Int
    println("Загадано число от 0 до 13. Попробуй угадать у тебя $attempts попыток")

    do {


        println("Введите число.. Осталось попыткок $attempts ")
        number = readln().toInt()


        if (attempts.equals(0)) {
            println("Попытки кончились. Загаданное число равнялось $random")
            break

        }

        if (number.equals(random)) {
            --attempts
            println("Поздравляю вы угадали число ")
            break
        }
        if (!number.equals(random)) {
            --attempts
            println(" вы НЕ угадали число ")
        }


    } while (attempts >= 0)


}


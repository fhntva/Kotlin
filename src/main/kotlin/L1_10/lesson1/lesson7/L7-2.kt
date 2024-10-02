package L1_10.lesson1.lesson7

fun main() { // password generator


    val oneTwo = 1000..9999
    var autoR:Int = 0
    val sms = oneTwo.random()

    for (i in 1..99)
    {

        println("Вам пришел код $sms Введите код для авторизации")
        autoR= readln().toInt()

        if (autoR.equals(sms))
        {
            println("Поздравляю вы вошли в систему")
            break

        }
        if (!autoR.equals(sms))
        {
            println("Вы ввели  неверный парль")
        }


    }

}
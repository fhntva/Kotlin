package lesson10

const val USER10L5 = "fhntva"
const val USERPASW10L5 = "fhntvap"

fun main()

{
   var basket = LogIn()

    if (basket == 0 ) {
    println("Логин или пароль не верен $basket")
    }
    if (basket != 0)
    {

        println("Ваша корзина $basket:")
    }
}


fun tokenGen(): String {
    var token: String = randmeNumber()
    for (i in 1..31) {
        token += randMeFullPack()
    }

    return token
}

fun LogIn():Any
{

    println("Введите Логин")
    var logIn = readln().toString()

    if (logIn.equals(USER10L5)) {
        println("Введите Пароль")
        var passW = readln().toString()
        if (passW.equals(USERPASW10L5)) {
            println("Добро пожаловать $USER10L5")
            val token = tokenGen()
            return token.toString()
        } else
        {
            return 0
        }

    } else
    {

        return 0

    }



}
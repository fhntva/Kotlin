package L1_10.lesson1.lesson10

const val USER10L5 = "fhntva"
const val USERPASW10L5 = "fhntvap"

fun main()

{
   var basket = L1_10.lesson1.lesson10.LogIn()

    if (basket == 0 ) {
    println("Логин или пароль не верен $basket")
    }
    if (basket != 0)
    {

        println("Ваша корзина $basket:")
    }
}


fun tokenGen(): String {
    var token: String = L1_10.lesson1.lesson10.randmeNumber()
    for (i in 1..31) {
        token += L1_10.lesson1.lesson10.randMeFullPack()
    }

    return token
}

fun LogIn():Any
{

    println("Введите Логин")
    var logIn = readln().toString()

    if (logIn.equals(L1_10.lesson1.lesson10.USER10L5)) {
        println("Введите Пароль")
        var passW = readln().toString()
        if (passW.equals(L1_10.lesson1.lesson10.USERPASW10L5)) {
            println("Добро пожаловать ${L1_10.lesson1.lesson10.USER10L5}")
            val token = L1_10.lesson1.lesson10.tokenGen()
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
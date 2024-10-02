package L1_10.lesson1.lesson10

fun main() {
    println("Добро пожаловать в генерацию плохого пароля")
    println("Введите длинну пароля ")
    val simeMe = readln().toInt()
    var passwordGen = passwordgen(simeMe).toString()
    println("Ващ пароль $passwordGen ")


}


fun randMeFullPack(): String {
    val diap = ('A'..'Z') + ('a'..'z') + ('0'..'9')
    val randMe = diap.random().toString()
    return randMe

}

fun randMeSpecials(): String {
    val diap = listOf('!', '@', '#', '$', '%', '^', '&', '*', '(', ')') // тут всю чушню перечислить
    val passMe = diap.random()
    return passMe.toString()
}

fun randmeNumber(): String {
    val diap = 1..9
    val randNumber = diap.random()

    return randNumber.toString()
}

fun probel(): String {
    val probel = " ".toString()
    return probel
}

fun passwordgen(Size: Int): String {
    val quant = Size
    var password: String = randmeNumber().toString()
    password += randMeSpecials().toString()
    password += probel()
    val diap = 1..2


    for (i in 1..quant - 3) {
        var oneORtwo = diap.random()
        if (1 == oneORtwo) {
            password += randmeNumber()


        }
        if (2 == oneORtwo) {
            password += randMeSpecials()

        }

    }

    return password

}
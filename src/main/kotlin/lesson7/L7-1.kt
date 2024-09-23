package lesson7

fun main() { // password generator


    val oneTwo = 1..9
    val ab = 'a'..'z'
    val or = 1..2

    var password: String = ""



    for (i in 1..9) {
        val random = or.random()
        var numberR = oneTwo.random().toString()
        var alPR = ab.random().toString()

        if (random == 1) {
            password += numberR

        }
        if (random == 2) {
            password += alPR

        }


    }

    println("Твой пароль $password")


}
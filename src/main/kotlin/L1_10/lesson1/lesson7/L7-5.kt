package L1_10.lesson1.lesson7

fun main() { // password generator


    val oneTwo = 1..9
    val ab = 'a'..'z'
    val AB = 'A'..'Z'
    val or = 1..4




    println("Введите количество символов для своего пароль")
    var passSize = readln().toInt()
    if (passSize <= 6) {
        passSize = 6
        println("Минимальня длина пароля 6 символов")
    }

    for (s in 1..99) {
        var password: String = ""

        for (i in 1..99) {


            val random = or.random()
            var numberR = oneTwo.random().toString()
            var alPR = ab.random().toString()
            var alpRBig = AB.random().toString()


            if (random == 1 || random == 4) {
                password += numberR

            }
            if (random == 2) {
                password += alPR

            }
            if (random == 3) {
                password += alpRBig
            }
            if (passSize == i) {
                break
            }

        }


        val check = password.filter { it.isUpperCase() } //password validation
        val check2 = password.filter { it.isLowerCase() }
        val check3 = password.filter { it.isDigit() }

        if (!check.equals("")) {
            if (!check2.equals("")) {
                if (!check3.equals("")) {

                    println("Ваш пароль$password")
                    break


                }


            }


        }


    }


}





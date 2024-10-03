package Lesson11

import L1_10.lesson1.lesson10.randMe1to99

fun main() {
    val user = UserInf(
        uidUser = randMe1to99(),
        logIn = "fhntva",
        Password = "ASciISGod",
        mail = "MyMailIsBad@mail.ru",
    )
    val user2 = UserInf(
        uidUser = randMe1to99(),
        logIn = "Vilka",
        Password = "dfg23e4",
        mail = "sadface@mail.ru"
    )
    println(user.printUserInf())
    println(user2.printUserInf())


}





package Lesson11

import L1_10.lesson1.lesson10.randMe1to99

fun main() {
    val user = UserInf2(
        //имя переменной затем класс
        uidUser = randMe1to99(),
        logIn = "fhntva",
        Password = "ASciISGod",
        mail = "MyMailIsBad@mail.ru",
    )
    println(user.printUserInf())
    println("Информация о вас на данный момент, заполните вашу боиграфию")
    val userINF = readln().toString().trim()
    user.bio = userINF
    println(user.printUserInf())
    println("Давайте сменим пароль. Введите ваш текущий пароль")
    var userpassword = readln().toString()
    if (user.Password == userpassword) {
        println("Пароль подтвержден. Введите новый пароль")
        userpassword = readln().toString()
        user.Password = userpassword
        println(user.printUserInf())
        println("Пароль изменен")
    } else {
        println("Что то пошло не так")
    }


}

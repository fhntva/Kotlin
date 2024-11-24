package Lesson17

fun main() {
    var logPass = LogPassword(
        login = "test",
        password = "123"
    )
    logPass.passworD = "345"
    println(logPass.passworD)
    logPass.logiN = "sad"
    println(logPass.logiN)

}
package L1_10.lesson1.lesson10

fun main() {

    println("Введите логин")
    var checker = readln()

    if (validation(checker)) {
        println("Введите пароль")
        checker = readln()
        if (validation(checker)) {
            println("Добро пожаловать")

        }
        else println("Пароль слишком короткий")


    } else println("Логин слишком короткий")

}


fun validation(check: String?): Boolean {
    var lenght = check?.length
    if (lenght!! >= 4) {
        return true

    }
    if (lenght!! < 4) {
        return false

    }

    return false
}

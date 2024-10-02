package L1_10.lesson1.lesson6


fun main() {
//register new account then we log in
    var user = "0"
    var password = "0"
    var userLogIn: String = "0"
    var passwLogIn: String = "0"
    do {


        println("У вас нет аккаунта. Давайте создадим. Введите логин")
        user = readln().toString()
        println("Введите пароль")
        password = readLine().toString()


        println("Ваш созданый логин: $user пароль: $password")
        do {
            println("Введите логин")
            userLogIn = readLine().toString()
            if (userLogIn.equals(user)) {
                do {
                    println("Введите пароль")
                    passwLogIn = readLine().toString()
                    if (passwLogIn.equals(password)) {
                        println("Поздравляю вы вошли в систему")
                        break
                    }
                }while (!password.equals(passwLogIn))



            }

        } while (!userLogIn.equals(user))


    } while (!userLogIn.equals(user))
}

package Lesson17

class LogPassword(login: String, password: String) {
    //class LogPassword( var login: String, var password: String) {
    var logiN = login
        set(value) {
            println("Логин заменен")
            field = value
        }
    var passworD = password
        set(value) {
            println("cant")
        }
        get() {
            field
            val a = "****"
            return a
        }
}
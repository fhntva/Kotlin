package lesson10

fun main() {
    println("Пользователь и компуктер бросают кубики") //whoWin/ L10-1 Function
    var humanwins = 0
    do {
        if (whoWIn().equals("humanWin")) {
            ++humanwins
        }

        println("Пользователь выйграл раз : $humanwins")
        println("Ввведите да что бы сыграть еще раз, нет что бы закончить")
        var playorNot = readln().toString()
        if (playorNot.equals("да")) {
            println("Продолжаем")
        } else {
            break
        }

    } while (1 > 0)

}




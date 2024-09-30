package lesson10

fun main() {
    println("Пользователь и компуктер бросают кубики")
    println("Бросает кожаный мешок")
    println("Бросает компуктер")
    whoWIn()


}



fun randMe1to99(): Int {
    val diap = 1..99
    val random = diap.random()
    return random

}

fun whoWIn():String {
    val playerR: Int = randMe1to99()
    val compR: Int = randMe1to99()
    if (playerR > compR) {
        println("Победил кожаный мешок. Мешок$playerR Пк $compR")
        return "humanWin"
    }
    if (playerR < compR) {
        println("Победило компуктер. Мешок$playerR Пк $compR")
         return "PCWin"
    }
    if (playerR == compR) {
        println("У нас ничья. Мешок$playerR Пк $compR ")
        return "noOneWin"
    }
    return "problem"
}

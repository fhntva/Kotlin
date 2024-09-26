package lesson9

fun main() {
    val listMe = listOf("Яиц", "Молока", "Сливочное масло")
    var listIngr = mutableListOf(2, 50, 15)
    println("Какое количество порций вы хотите получить.Введите число")
    var quant = readln().toInt()
    var listIngr2 = listIngr.map { it * quant }
    val multiStr = """
На данное количество порций вы потратите:
   ${listMe[0]} :  ${listIngr2[0]}
   ${listMe[1]} :  ${listIngr2[1]}
   ${listMe[2]} :  ${listIngr2[2]}
           
        """.trimMargin()
    println(multiStr)


}

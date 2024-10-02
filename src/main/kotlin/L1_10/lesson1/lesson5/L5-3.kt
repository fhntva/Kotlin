package L1_10.lesson1.lesson5

fun main() {
    val ab = 0..42

    val n1 = ab.random()
    val n2 = ab.random()

    println("Угадай 2 числа от 0 до 42. Введите первое число ")
    val costumerN1 = readLine()!!.toInt()

    println("Введите второе число ")
    val costumerN2 = readLine()!!.toInt()

    if (n1==costumerN1&&n2==costumerN2)
    {
        print("Поздравляем вы выйграли главный приз")

    }
    if (n1==costumerN1||n2==costumerN2)
    {
        print("Вы выйграли утешительный приз")

    }
    else
    {
        print("Неудача. Вы не угадали число 1 $n1 и число 2  $n2")
    }

}





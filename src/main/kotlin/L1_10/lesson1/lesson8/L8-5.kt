package L1_10.lesson1.lesson8

// L8-5 создание заполняемого массива определяемого пользователем размера
fun main() {


    //val ab =  1..9
    println("введите количество элементов ")

    var elemofArr = readln().toInt()

    var arrVegetables = arrayOfNulls<String>(elemofArr)
    for (i in arrVegetables.indices) {
        var sukaCounter = 1
        println("Введите элемент " + sukaCounter++)
        var newElement = readln().trim()

        arrVegetables[i] = newElement

    }

    for (i in arrVegetables.indices)
    {
        println(arrVegetables[i])
    }

}







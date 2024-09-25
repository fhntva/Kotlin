package lesson8

// L8-5 создание заполняемого массива определяемого пользователем размера
fun main() {


    //val ab =  1..9
    println("введите количество элементов ")

    var elemofArr = readln().toInt()

    var arrVegetables = arrayOfNulls<String>(elemofArr)
    var sukaCounter = 1
    for (i in arrVegetables.indices) {

        println("Введите элемент " + sukaCounter++)
        var newElement = readln().trim()

        arrVegetables[i] = newElement

    }

    for (i in arrVegetables.indices)
    {
        println(arrVegetables[i])
    }

}







package lesson9

fun main() {


    println("Введите 5 элементов друг за другом")
    val setMe = mutableListOf(readln(), readln(), readln(), readln(), readln())
    var setMeCopy = setMe.toSet().sorted().toMutableList() // удаляет дубликаты set // сортирует по порядку // заглавные буквы .map { it.capitalize() }
    var int = setMeCopy.get(0).toString().replaceFirstChar { it.uppercaseChar() }
    setMeCopy[0] = int

    println(setMe) //первый массив
    println(setMeCopy) // измененный массив

}

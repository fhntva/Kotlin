package lesson9

fun main() {


    println("Введите 5 элементов друг за другом")
    var setMe = mutableListOf(readln(), readln(), readln(), readln(), readln())
    println(setMe.toSet().sorted().map { it.capitalize() }) // удаляет дубликаты set // сортирует по порядку // заглавные буквы

}

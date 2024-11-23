package Lesson17

fun main() {
    var folders = Folders()
    println(folders.name)
    println(folders.number)
    folders.hidden = false
    println(folders.name)
    println(folders.number)
}
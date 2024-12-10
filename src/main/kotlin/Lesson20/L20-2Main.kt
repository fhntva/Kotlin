package Lesson20

fun main()
{
    var oleg = mainCharacter();
    run{
    println("Текушее здоровье Олега равно ${oleg.hp}" + " на него наложен хил. Здоровье после хила = ${oleg.hp + (0..10).random()}")
    }
}
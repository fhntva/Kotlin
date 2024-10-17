package Lesson14

open class Liner(
    val name: String,
    val speed:Int,
    val capacity:Int,
    val people: Int,
    val trap:String ="Горизонтальный трап",

    )
{
   open fun printMe() {
        var printer="""
            
            Название:    $name
            Скорость:    $speed
            Вместимость: $capacity
            Люди:        $people
            Погрузка:    $trap 
                       
        """.trimIndent()
        return println(printer)
    }
}


class Icebreaker(
    name: String,
    speed: Int,
    capacity: Int,
    people: Int,
    val crushIce:Boolean = true,
    trap: String = "Кормовая погрузка"
) :Liner(name, speed, capacity, people, trap, )
{
    override fun printMe() {
        var printer="""
            
            Название:    $name
            Скорость:    $speed
            Вместимость: $capacity
            Люди:        $people
            Погрузка:    $trap
            КрушуЛед:    $crushIce
            
        """.trimIndent()
        return println(printer)
    }
}


class CargoLiner(
    name: String,
    speed: Int,
    capacity: Int,
    people: Int,
    trap:String ="Погрузочный кран" ,
) :Liner(name, speed, capacity, people,trap,)
{

}


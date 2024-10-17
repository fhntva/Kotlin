package Lesson14

open class Liner(
    val name: String,
    val speed:Int,
    val capacity:Int,
    val people: Int,

    )
{
   open fun printMe() {
        var printer="""
            
            Название:    $name
            Скорость:    $speed
            Вместимость: $capacity
            Люди:        $people
                        
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
) :Liner(name, speed, capacity, people,)
{
    override fun printMe() {
        var printer="""
            
            Название:    $name
            Скорость:    $speed
            Вместимость: $capacity
            Люди:        $people
            КрушуЛед:    $crushIce
            
        """.trimIndent()
        return println(printer)
    }
}


class CargoLiner(
    name: String,
    speed: Int,
    capacity: Int,
    people: Int
) :Liner(name, speed, capacity, people,)
{

}

